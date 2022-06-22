package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class LoginPage {

  public   WebDriver driver;

    public LoginPage(WebDriver driver1){

        this.driver=driver1;
        PageFactory.initElements(driver1, this);

    }

    @FindBy (xpath = "//input[@id='biglietti_fromNew']")
    WebElement departure;

    @FindBy (xpath = "//input[@id='biglietti_toNew']")
    WebElement arrival;

    @FindBy (xpath = "//button[@id='onetrust-accept-btn-handler']")
    WebElement cookies;

    @FindBy (xpath = "//img[@class='acceso']")
    WebElement andataRitorno;

    @FindBy (xpath = "(//p[@class='mobileHeaderLink'])[1]")
    WebElement areaRiservata;

    @FindBy (xpath = "//input[@id='biglietti_data_pVISIBLE']")
    WebElement depdate1;

    @FindBy (xpath = "(//a[@class='ui-state-default'])[3]")
    WebElement depdate2;

    @FindBy (xpath ="//select[@id='biglietti_ora_p']")
    WebElement time1;

     public void loginnarea() throws InterruptedException {
         Thread.sleep(2000);
         cookies.click();
         String mainHandle = driver.getWindowHandle();
         System.out.println(mainHandle);
         //areaRiservata.click();
         Set<String> windowsList=driver.getWindowHandles();
         System.out.println(windowsList+ " windows");
        // WebDriverWait wait = new WebDriverWait(driver, 5);
         //wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("(//p[@class='mobileHeaderLink'])[1]")));

}
    public void enterloc(String dep, String arr) throws InterruptedException {

        cookies.click();
        departure.sendKeys(dep);
        arrival.sendKeys(arr);
        Thread.sleep(3000);
      // andataRitorno.click();
        depdate1.click();
        depdate2.click();
        time1.click();
    }
}
