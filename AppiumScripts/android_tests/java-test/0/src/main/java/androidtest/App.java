package androidtest;

import java.io.File;
import java.io.FileWriter;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

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

        myWriter = new FileWriter("resultadosAndroid.json");

        // Descomente qual função você quer rodar
        // Lembre-se de alterar o número de repetições

        // create();

        // update();

        // delete();

        System.out.println("Teste finalizado. Verifique o arquivo resultadosAndroid.json.");

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

        finalData.put("\"actionNumber\"", Integer.toString(position + 1));
        finalData.put("\"totalPss\"", readableData.get("totalPss").toString());
        finalData.put("\"totalPrivateDirty\"", readableData.get("totalPrivateDirty").toString());

        myWriter.write(finalData.toString().replace("=", ":"));
        myWriter.write(",");
    }
}
