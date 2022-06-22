package StepDefinitions;

import PageObjects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginSteps {



    @When("user opens page")
    public void user_opens_page() throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.trenitalia.com/it/informazioni/acquisti_online.html");
        driver.manage().window().maximize();
       LoginPage ll=new LoginPage(driver);
       ll.loginnarea();

    }
    @Given("user in login page")
    public void user_in_login_page() {
        System.out.println("2");
    }
    @Given("user enters credentials")
    public void user_enters_credentials() {
        System.out.println("3");
    }
    @Then("user able to login")
    public void user_able_to_login() {
        System.out.println("4");
    }

}
