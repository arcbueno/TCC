package androidtest;

import java.io.File;
import java.io.FileWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class App {

    private static AndroidDriver<MobileElement> androidDriver;
    private static int repeticoes = 10;
    private static FileWriter myWriter;
    private static NewToDo newToDo;
    private static UpdateToDo updateToDo;

    public static void main(String[] args) throws Exception {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        Constants constants = new Constants();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, constants.DEVICE_NAME);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.APP, new File(constants.FILE_PATH));
        androidDriver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), capabilities);
        newToDo = new NewToDo(androidDriver);
        updateToDo = new UpdateToDo(androidDriver);

        myWriter = new FileWriter("android20.json");

        // Descomente qual função você quer rodar
        // Lembre-se de alterar o número de repetições

        create();

        // update();

        // delete();

    }

    static void create() throws Exception {
        for (int i = 0; i < repeticoes; i++) {
            NewToDo.create();
            getPerformanceAndExports(androidDriver, myWriter, i);
        }
    }

    static void update() throws Exception {

        for (int i = 0; i < repeticoes; i++) {
            NewToDo.create();
        }

        for (int i = 0; i < repeticoes; i++) {

            if (i == 0) {
                androidDriver.findElement(By.xpath(
                        "//*[@class='android.widget.GridLayout' and @index='" + 0 + "']/android.widget.TextView"))
                        .click();

            } else {

                androidDriver.findElements(By.id("list_item_layout")).get(i).findElement(By.id("item_text_id")).click();
            }

            UpdateToDo.update();
            getPerformanceAndExports(androidDriver, myWriter, i);
        }

    }

    static void delete() throws Exception {

        for (int i = 0; i < repeticoes; i++) {
            NewToDo.create();
        }

        for (int i = 0; i < repeticoes; i++) {

            androidDriver
                    .findElement(By.xpath(
                            "//*[@class='android.widget.GridLayout' and @index='" + 0 + "']/android.widget.TextView"))
                    .click();

            UpdateToDo.delete();
            getPerformanceAndExports(androidDriver, myWriter, i);
        }

    }

    private static void getPerformanceAndExports(AndroidDriver<MobileElement> driver, FileWriter myWriter, int position)
            throws Exception {

        List<List<Object>> data = driver.getPerformanceData("com.arcbueno.mytodo", "memoryinfo", 5);

        HashMap<String, Integer> readableData = new HashMap<String, Integer>();
        for (int i = 0; i < data.get(0).size(); i++) {
            int val;
            if (data.get(1).get(i) == null) {
                val = 0;
            } else {
                val = Integer.parseInt((String) data.get(1).get(i));
            }
            readableData.put((String) data.get(0).get(i), val);
        }
        HashMap<String, String> finalData = new HashMap<String, String>();

        finalData.put("\"updateNumber\"", Integer.toString(position + 1));
        finalData.put("\"totalPss\"", readableData.get("totalPss").toString());
        finalData.put("\"totalPrivateDirty\"", readableData.get("totalPrivateDirty").toString());

        myWriter.write(finalData.toString().replace("=", ":"));
        myWriter.write(",");
    }

    private static void scroll(AndroidDriver<MobileElement> driver, int position) throws InterruptedException {

        Dimension size = driver.manage().window().getSize();

        int width = size.width / 2;

        int startPoint = (int) (size.getHeight() * 0.40);
        int endPoint = (int) (size.getHeight() * 0.30);

        new TouchAction(driver).press(PointOption.point(width, startPoint))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).moveTo(PointOption.point(width, endPoint))
                .release().perform();

    }

}
