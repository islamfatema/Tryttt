package shoeSearchPage;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ShoeSearchPage extends BasePage{
    
	WebDriver driver;
	
	public By searchTextBox=By.xpath("//select[@id='brand']");
	   
	
	public By searchButton=By.xpath("//input[@id='search_button']");
	
	
	
	public By Acron=By.cssSelector("body:nth-child(2) div.title:nth-child(4) > h2:nth-child(1)")	;	
			
	
	public void clickOnsearchButton() {
		Actions action = new Actions(driver);
		action.moveToElement((WebElement) searchTextBox).click().perform();
		clickOn(searchTextBox);
		
	}
	
	public void select() {
		Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='brand']")));
		dropdown.selectByVisibleText("Acron");
	}

	public void clickSearchButton() {
		clickOn( searchButton);
	}
	
}
