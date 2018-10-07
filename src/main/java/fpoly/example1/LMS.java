package fpoly.example1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LMS {

    public String url = "http://lms.poly.edu.vn/";

    String linkDriver = "C:\\Users\\Admin\\Desktop\\SOF304_Lab6\\chromedriver.exe";

    public WebDriver driver;

    @BeforeTest
    public void launchBrowser() {
        System.out.println("Launch :D");
        System.setProperty("webdriver.chrome.driver", linkDriver);

        driver = new ChromeDriver();
        driver.get(url);
    }

    @Test
    public void verifyHomepageTitle() {
        String titleWebsite = "FPT Polytechnic";
        String titleExpect = driver.getTitle();
        Assert.assertEquals(titleExpect, titleWebsite);
    }

    @AfterTest
    public void closeBrowser() {
        driver.close();
    }
}
