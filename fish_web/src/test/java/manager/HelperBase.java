package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HelperBase {

    WebDriver driver;

    public HelperBase(WebDriver driver) {
        this.driver = driver;
    }

    public void openSite(String url) {
        driver.get(url);
    }


    public void click(By locator) {
        driver.findElements(locator);
    }

    public void focusOnClick(By locator){
        new Actions(driver).moveToElement(driver.findElement(locator)).click().perform();
    }


}
