package Test_Scenarios;

import Objects.FacebookPage;
import Objects.GoogleSearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestMethods_GoogleSearch {

    WebDriver driver;
    GoogleSearchPage objectrepo;
    @BeforeTest
    public void beforetest(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
    }


    @Test(priority = 0)
    public void SearchOperation() {
        GoogleSearchPage page = new GoogleSearchPage(driver);
        page.searchgoogle("Facebook");

    }
    @Test(priority = 1)
    public void VerifyAndAccessFacebook(){
        objectrepo = new GoogleSearchPage(driver);
        objectrepo.ClickFacebook();
    }

    @Test(priority = 2)
    public void VerifyLogin(){
        FacebookPage page = new FacebookPage(driver);
        page.EnterUsername();
        page.EnterPassword();
        page.VerifyLogin();

    }


    @AfterTest
    public void aftertest(){
        driver.quit();
    }


}
