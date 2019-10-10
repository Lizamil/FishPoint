package test;

import manager.ApplicationManager;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestBase {

    protected static ApplicationManager app = new ApplicationManager(System.getProperty("browser", BrowserType.CHROME));

    @BeforeSuite
    public void setUp(){
        app.init();
    }

    @Test
    public void aboutUs() throws InterruptedException {
        app.getHelperLogin().focusOnClick(By.cssSelector("[href='/o_magazine.html']"));
        Thread.sleep(5000);

    }

    @AfterSuite
    public void tearDown() {
        app.stop();
    }


}
