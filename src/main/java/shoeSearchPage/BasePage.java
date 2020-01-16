package shoeSearchPage;

import java.util.NoSuchElementException;
import shoeSearchUtilityFolder.BrowserUtility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class BasePage {
	public void clickOn(By locator) {
		try {
			BrowserUtility.getDriver().findElement(locator).click();
		} catch (NoSuchElementException e) {
			Assert.fail("Element is not found with this locator: " + locator.toString());
			e.printStackTrace();
		}
	}

	
}
