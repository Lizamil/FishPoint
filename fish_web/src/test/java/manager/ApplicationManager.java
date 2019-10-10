package manager;

import manager.HelperLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    WebDriver driver;
    HelperLogin helperLogin;
    HelperBox helperBox;
    private String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public void init() {
        if (browser.equals(BrowserType.CHROME))
            driver = new ChromeDriver();
        if (browser.equals(BrowserType.FIREFOX))
            driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        helperLogin = new HelperLogin(driver);
        helperBox = new HelperBox(driver);
        helperLogin.openSite("https://fishpoint.ru/");
        helperLogin.logIn();
    }
    public void stop() {
        driver.quit();
        driver = null;
    }

    public HelperLogin getHelperLogin() {
        return helperLogin;
    }

    public HelperBox getHelperBox() {
        return helperBox;
    }

}
