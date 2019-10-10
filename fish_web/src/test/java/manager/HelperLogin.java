package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperLogin extends HelperBase {

    public HelperLogin(WebDriver driver) {
        super(driver);
    }

    public void logIn(){
        focusOnClick(By.cssSelector(".navbar_right"));
        type(By.id("id_login"), "lizamil@mail.ru");
        type(By.id("id_password"), "liza1978");
        focusOnClick(By.cssSelector(".button_green"));

    }

    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

}
