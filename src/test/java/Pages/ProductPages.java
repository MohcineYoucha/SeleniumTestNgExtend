package Pages;

import io.opentelemetry.semconv.SemanticAttributes;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.security.SecureRandom;

import static tests.SeleniumTest.driver;

public class ProductPages {


    public static String FormalShoes = "/html/body/div[2]/center/h2";


    public static String SportsSheos = "/html/body/div[3]/center/h2";


    public  static String Sneakers = "/html/body/div[4]/center/h2";



    public static String Formalshoesihead = "/html/body/div[2]/center/div/i[1]";


    public static String SportsSheoshead = "/html/body/div[3]/center/div/i[1]";


    public static String SnearkersHead = "/html/body/div[4]/center/div/i[1]";



    public static String FormalShoes_FirstShowName = "/html/body/div[2]/table/tbody/tr[1]/td[1]";


    public static String SportsSheoshead_FirstShowitem = "/html/body/div[3]/table/tr[1]/td[1]";



    public static void FormalShoes_verifyTitle(){

        String expectedtileFS = "Formal Shoes";

        String actualTitleFS = driver.findElement(By.xpath(FormalShoes)).getText();

        Assert.assertEquals(expectedtileFS, actualTitleFS);



    }


    public static void SportsSheos_verifyTitle(){


        String expectedtitleSH = "Sports Shoes";
        String ActualtitleSH = driver.findElement(By.xpath(SportsSheoshead)).getText();

        Assert.assertEquals(expectedtitleSH, ActualtitleSH);




    }


    public static void Sneakers_verifyTitle(){

        String expectedtitleSK = "Sneakers";
        String ActualtileSH = driver.findElement(By.xpath(Sneakers)).getText();

        Assert.assertEquals(expectedtitleSK, ActualtileSH);


    }

    public static void Formalshoesihead_drpdown_click(){

        driver.findElement(By.xpath(Formalshoesihead)).click();


    }

    public static void SportsSheoshead_drpdown_click(){

        driver.findElement(By.xpath(SportsSheos)).click();


    }

    public static void SnearkersHead_drpdown_click(){

        driver.findElement(By.xpath(SnearkersHead)).click();
    }

    public static void FormalShoes_FirstShowName_click(){

        String ExpectedTitleFH = "Classic Cheltenham";
        String ActualTitleFH = driver.findElement(By.xpath(FormalShoes_FirstShowName)).getText();
        Assert.assertEquals(ExpectedTitleFH, ActualTitleFH );


    }


    public static void SportsSheoshead_FirstShowitem_click(){


        String ExpectedTitleSS = "Ultimate";
        String ActualtitleSS = driver.findElement(By.xpath(SportsSheoshead_FirstShowitem)).getText();
        Assert.assertEquals(ExpectedTitleSS, ActualtitleSS);

    }
}
