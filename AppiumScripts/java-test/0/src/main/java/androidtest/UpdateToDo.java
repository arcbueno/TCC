package androidtest;

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

    // input properties
    // @AndroidFindBy(id = "fab_add")
    // private static MobileElement addButton;

    @AndroidFindBy(id = "update_todo_title")
    private static MobileElement titleUpdate;

    @AndroidFindBy(id = "update_todo_text")
    private static MobileElement bodyUpdate;

    @AndroidFindBy(id = "fab_save")
    private static MobileElement updateTodoButton;

    @AndroidFindBy(id = "fab_delete")
    private static MobileElement deleteTodoButton;

    public static void update() {
        // addButton.click();
        titleUpdate.setValue("teste123updated");
        bodyUpdate.setValue("teste1232updated");
        updateTodoButton.click();
    }

    public static void delete() {
        // addButton.click();
        // titleUpdate.setValue("teste123updated");
        // bodyUpdate.setValue("teste1232updated");
        deleteTodoButton.click();
    }

    public void quitDriver() {
        driver.quit();
    }
}
