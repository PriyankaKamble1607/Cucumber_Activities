package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTestSteps
{
	WebDriver driver;
    WebDriverWait wait;
    
    @Given("^User is on Login page$")
    public void userIsOnGooglePage() throws Throwable {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 15);
                
        //Open the browser
        driver.get("https://www.training-support.net/selenium/login-form");
    }
    
    @When("^User enters username and password$")
    public void userlogin() throws Throwable 
    {
       // driver.findElement(By.name("q")).sendKeys("Cheese", Keys.RETURN);
    }

    @Then("^Read the page title and confirmation message$")
    public void showHowManySearchResultsWereShown() throws Throwable
    {
        /*wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("result-stats")));
        String resultStats = driver.findElement(By.id("result-stats")).getText();
        System.out.println("Number of results found: " + resultStats);*/
    }
	/*
	 * @And("^Close the browser$") public void closeTheBrowser() throws Throwable {
	 * driver.close(); }
	 */
}


