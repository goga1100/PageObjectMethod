package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {

    WebDriver driver;
    public GoogleSearchPage(WebDriver driver) {

        this.driver = driver;

    }
    By SearchBox = By.xpath("//input[@name=\"q\"]");
    By Search_Btn = By.xpath("//input[@name=\"btnK\"]");
    By Facebook_Link = By.xpath("//h3[@class=\"LC20lb MBeuO DKV0Md\"][1]");

    public void searchgoogle(String SearchInput) {

        try {
            driver.findElement(SearchBox).sendKeys(SearchInput);
            driver.findElement(Search_Btn).click();
            Thread.sleep(2000);
            }catch (Exception e) {
            System.out.printf("Exception Caught" + e.getMessage());
            }
        }
    public void ClickFacebook(){
        try{
                driver.findElement(Facebook_Link).click();
                Thread.sleep(2000);
            }catch(Exception e){
                System.out.printf("Exception Caught" + e.getMessage());
            }
        }





    }





