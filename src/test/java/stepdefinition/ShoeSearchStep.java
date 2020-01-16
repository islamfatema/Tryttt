package stepdefinition;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import shoeSearchPage.ShoeSearchPage;
import shoeSearchUtilityFolder.BrowserUtility;
import shoeSearchUtilityFolder.PropertiesFileReader;

public class ShoeSearchStep {
  
	
	public static WebDriver driver;
	ShoeSearchPage shoeSearchPage= new ShoeSearchPage();
	PropertiesFileReader obj= new PropertiesFileReader();

@Given("^Open Chrome Browser with url$")
public void open_Chrome_Browser_with_url() throws Throwable {

	Properties properties=obj.getProperty();
	
	driver=BrowserUtility.openBrowser(driver, properties.getProperty("browser.name"),properties.getProperty("browser.baseURL"));
}
@When("^Click on search button$")
public void click_on_search_button() throws Throwable {
	shoeSearchPage.clickOnsearchButton();

}

@When("^Select \"([^\"]*)\" from list$")
public void select_from_list(String arg1) throws Throwable {
	shoeSearchPage.select();
}

@When("^Click on search$")
public void click_on_search() throws Throwable {
    
}
@Then("^Validate Acron's shoes$")
public void validate_Acron_s_shoes() throws Throwable {
	String expectedText=driver.findElement(By.cssSelector("body:nth-child(2) div.title:nth-child(4) > h2:nth-child(1)")).getText();
	String actualText="Acorn's Shoes";
	Assert.assertEquals(actualText,expectedText);
}
}
