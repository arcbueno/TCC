package flutterTest;

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
import org.openqa.selenium.Point;
import org.openqa.selenium.html5.Location;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.interactions.touch.TouchActions;
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

    public static void main(String[] args) throws MalformedURLException, Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "API 29 Strikes Again");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability("unicodeKeyboard", false);
        capabilities.setCapability("resetKeyboard", false);
        capabilities.setCapability(MobileCapabilityType.APP,
                new File("C:\\Users\\arcbu\\Documents\\Pessoal\\TCC\\Codigo\\APKs\\MyToDoFlutter.apk"));
        androidDriver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), capabilities);
        newToDo = new NewToDo(androidDriver);
        updateToDo = new UpdateToDo(androidDriver);

        myWriter = new FileWriter("resultadosFlutter.json");

        // Descomente qual função você quer rodar
        // Lembre-se de alterar o número de repetições

        // create();

        // update();

        // delete();

        System.out.println("Teste finalizado. Verifique o arquivo resultadosFlutter.json.");

    }

    private static void create() throws Exception {
        for (int i = 0; i < repeticoes; i++) {
            NewToDo.create();
            getPerformanceAndExports(androidDriver, myWriter, i);
        }
    }

    private static void update() throws Exception {
        for (int i = 0; i < repeticoes; i++) {
            NewToDo.create();
        }

        for (int i = 0; i < repeticoes; i++) {

            String elementXpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View";

            androidDriver.findElements(By.xpath(elementXpath)).get(i).click();

            updateToDo.update();
            getPerformanceAndExports(androidDriver, myWriter, i);
        }
    }

    private static void delete() throws Exception {
        for (int i = 0; i < repeticoes; i++) {
            NewToDo.create();
        }

        for (int i = 0; i < repeticoes; i++) {

            String elementXpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View";

            androidDriver.findElements(By.xpath(elementXpath)).get(0).click();

            updateToDo.delete();
            getPerformanceAndExports(androidDriver, myWriter, i);
        }
    }

    private static void getPerformanceAndExports(AndroidDriver<MobileElement> driver, FileWriter myWriter, int position)
            throws Exception {

        List<List<Object>> data = driver.getPerformanceData("com.example.MyToDoFlutter", "memoryinfo", 5);

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

        finalData.put("\"actionNumber\"", Integer.toString(position + 1));
        finalData.put("\"totalPss\"", readableData.get("totalPss").toString());
        finalData.put("\"totalPrivateDirty\"", readableData.get("totalPrivateDirty").toString());

        myWriter.write(finalData.toString().replace("=", ":"));
        myWriter.write(",");
    }

}
