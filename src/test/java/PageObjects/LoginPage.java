package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    @FindBy (xpath = "(//p[@class='mobileHeaderLink'])[1]")
    WebElement areaRiservata;

     public void loginnarea() throws InterruptedException {
         Thread.sleep(2000);
         cookies.click();
         areaRiservata.click();
}
    public void enterloc()  {
        //WebDriverWait wait=new WebDriverWait(driver,20);
        departure.click();
        departure.sendKeys("Roma");
    }
}
