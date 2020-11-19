package flutterTest;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class NewToDo {
    private static AppiumDriver<MobileElement> driver;

    public NewToDo(AppiumDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        this.driver = driver;
    }

    // input properties
    @AndroidFindBy(xpath = "//*[@class='android.widget.Button']")
    private static MobileElement addButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.EditText' and @index='1']")
    private static MobileElement titleAdd;

    @AndroidFindBy(xpath = "//*[@class='android.widget.EditText' and @index='2']")
    private static MobileElement bodyAdd;

    @AndroidFindBy(xpath = "//*[@class='android.widget.Button' and @index='2']")
    private static MobileElement newTodoButton;

    public static void create() throws InterruptedException {
        addButton.click();
        Thread.sleep(1000);
        driver.findElements(By.xpath("//*[@class='android.widget.EditText']")).get(0).click();
        Actions action = new Actions(driver);
        action.sendKeys("teste123").perform();
        driver.findElements(By.xpath("//*[@class='android.widget.EditText']")).get(1).click();
        action.sendKeys("teste1232").perform();
        newTodoButton.click();
    }

    public void quitDriver() {
        driver.quit();
    }
}
