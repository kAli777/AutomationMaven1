package home;

import Base.CommonAPI;
import org.testng.annotations.Test;

/**
 * Created by Ali on 1/4/2017.
 */
public class BestBuyHomePage extends CommonAPI{

    @Test
    public void testHomePage(){
        System.out.println(driver.getCurrentUrl());
        clickByXpath("//*[@id=\"abt-email-modal\"]/div/div/div[1]/button/span[1]");
//        clickByXpath();
//        cancelAlert();
//        clickByXpath("//*[@id=\"site-control-content\"]/div[4]/div[1]/div[2]/div/div[2]/div/div[2]/div[2]/div/a");
//        clickByXpath("//*[@id=\"category_facet\"]/ul/li[2]/a");
//        clickByXpath("//*[@id=\"category_facet\"]/ul/li/a");
    }

}
