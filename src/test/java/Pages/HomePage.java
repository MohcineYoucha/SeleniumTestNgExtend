package Pages;

import org.openqa.selenium.By;

import static tests.SeleniumTest.driver;

public class HomePage  {


    public static String MenuFragment = "//*[@id=\"menuToggle\"]/input";


    public static String ProductsList = "//*[@id=\"menu\"]/a[3]/li";



    public static void ClickMenu() {

        driver.findElement(By.xpath(MenuFragment)).click();

    }

    public static void ClickProductList() throws Exception{

        Thread.sleep(2000);
        driver.findElement(By.xpath(ProductsList)).click();

    }


}
