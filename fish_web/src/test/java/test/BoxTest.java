package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BoxTest extends TestBase {

    @Test(enabled = false)
    public void alogin() throws InterruptedException {
        app.getHelperLogin().logIn();;
        Thread.sleep(5000);
    }

    @Test
    public void chooseGood() throws InterruptedException {

        //app.getHelperBox().openBox();
       // app.getHelperBox().focusOn(By.cssSelector("[href='/catalog/katushki-g-97.html']"));
       // app.getHelperBox().focusOnClick(By.cssSelector("[href='/catalog/katushki-katushki-g-63.html']"));
        //app.getHelperBox().focusOnClick(By.id("tocart_btn5299"));
       // app.getHelperBox().focusOnClick(By.id("tocart_btn5562"));
        app.getHelperBox().focusOn(By.cssSelector(".basket_small_text"));
        Thread.sleep(5000);
        app.getHelperBox().focusOnClick(By.cssSelector("[href='/cart.html']")); //[href='/cart.html']
        app.getHelperBox().clearBox();
        //app.getHelperBox().focusOnClick(By.cssSelector(".button_green"));

        Thread.sleep(25000);
    }

}
