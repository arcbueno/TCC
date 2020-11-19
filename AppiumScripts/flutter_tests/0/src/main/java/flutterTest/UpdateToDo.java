package flutterTest;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class UpdateToDo {
    private AppiumDriver<MobileElement> driver;

    public UpdateToDo(AppiumDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        this.driver = driver;
    }

    @AndroidFindBy(xpath = "//*[@class='android.widget.EditText' and @index='1']")
    private static MobileElement titleUpdate;

    @AndroidFindBy(xpath = "//*[@class='android.widget.EditText' and @index='2']")
    private static MobileElement bodyUpdate;

    @AndroidFindBy(xpath = "//*[@class='android.widget.Button' and @index='3']")
    private static MobileElement updateTodoButton;

    @AndroidFindBy(xpath = "//*[@class='android.widget.Button' and @index='2']")
    private static MobileElement deleteTodoButton;

    public void update() {
        driver.findElements(By.xpath("//*[@class='android.widget.EditText']")).get(0).click();
        Actions action = new Actions(driver);
        action.sendKeys("updated").perform();
        driver.findElements(By.xpath("//*[@class='android.widget.EditText']")).get(1).click();
        action.sendKeys("updated").perform();
        updateTodoButton.click();
    }

    public void delete() {
        deleteTodoButton.click();
    }

    public void quitDriver() {
        driver.quit();
    }
}
