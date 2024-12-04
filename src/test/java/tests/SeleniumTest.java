package tests;

import Pages.HomePage;
import Pages.ProductPages;
import org.checkerframework.checker.index.qual.PolyUpperBound;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v127.page.model.Screenshot;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class SeleniumTest {

    public static WebDriver driver;

    @BeforeTest
    public static void setup() throws Exception {

        driver = new ChromeDriver();

        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");

        HomePage.ClickMenu();
        HomePage.ClickProductList();

    }

//
    @Test
    void testSteps() throws Exception {


        ProductPages.FormalShoes_verifyTitle();
        ProductPages.SportsSheos_verifyTitle();
        ProductPages.Sneakers_verifyTitle();


    }

    @Test
    void ValidateFirstForminformationsClassic() {

        ProductPages.FormalShoes_verifyTitle();
    }


    @Test
    void ValidatefirstInfirmationSports() {

        ProductPages.SportsSheos_verifyTitle();
    }



}
