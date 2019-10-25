package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperBox extends HelperBase {
    public HelperBox(WebDriver driver) {
        super(driver);
    }


    public void clearBox() {
        focusOnClick(By.id("clean_btn"));
    }


    public void openBox() {
focusOnClick(By.cssSelector("[href='/catalog/katushki-g-97.html']"));
focusOnClick(By.cssSelector("[href='/catalog/katushki-katushki-g-63.html']"));
    }
}
