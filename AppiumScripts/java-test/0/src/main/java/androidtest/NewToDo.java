package androidtest;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class NewToDo {
    private AppiumDriver<MobileElement> driver;

    public NewToDo(AppiumDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        this.driver = driver;
    }

    // input properties
    @AndroidFindBy(id = "fab_add")
    private static MobileElement addButton;

    @AndroidFindBy(id = "new_todo_title")
    private static MobileElement titleAdd;

    @AndroidFindBy(id = "new_todo_text")
    private static MobileElement bodyAdd;

    @AndroidFindBy(id = "fab_new")
    private static MobileElement newTodoButton;

    public static void create() {
        addButton.click();
        titleAdd.setValue("teste123");
        bodyAdd.setValue("teste1232");
        newTodoButton.click();
    }

    public void quitDriver() {
        driver.quit();
    }
}
