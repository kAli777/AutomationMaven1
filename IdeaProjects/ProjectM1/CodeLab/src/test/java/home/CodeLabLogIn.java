package home;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


/**
 * Created by Ali on 1/4/2017.
 */
public class CodeLabLogIn extends CommonAPI{

    @Test
    public void testLogIn(){

        driver.findElement(By.id("username")).sendKeys("zabed.rashid@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Z7777777z");
        clickByXpath("//*[@id=\"submit-html5\"]");
        driver.findElement(By.id("nav-dropdown")).click();
        clickByXpath("//*[@id=\"account-link\"]");
        clickByXpath("//*[@id=\"exit-link\"]");

    }
}
