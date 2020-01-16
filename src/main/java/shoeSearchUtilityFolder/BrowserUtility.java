package shoeSearchUtilityFolder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserUtility {
	
	private static WebDriver driver ;
	 public static WebDriver openBrowser(WebDriver driver,String browserName ,String url) throws InterruptedException{
		   if(browserName.equalsIgnoreCase("Chrome")) {
			   System.setProperty("webdriver.chrome.driver", "/Users/fatemaislam/Downloads/chromedriver"); 
		 	   driver=new ChromeDriver();
		 	   driver.manage().window().maximize();
		 	   driver.get(url);
		 	   Thread.sleep(5000);
		 	   return driver;
		   
		   }
		   else
			   if(browserName.equalsIgnoreCase("IE")) {
				   System.setProperty("webdriver.chrome.driver", "/Users/fatemaislam/Downloads/chromedriver"); 
			 	   driver=new InternetExplorerDriver();
			 	   driver.get(url); 
			 	  Thread.sleep(5000);
			 	   return driver;
	   }
			   else if(browserName.equalsIgnoreCase("IE")) {
					   System.setProperty("webdriver.chrome.driver", "/Users/fatemaislam/Downloads/firefoxdriver"); 
				 	   driver=new FirefoxDriver();
				 	   driver.get(url); 
				 	  Thread.sleep(5000);
				 	   return driver;
			   }
		return null;
	}
   public static void after() {
		
			driver.quit();
		}
   public static WebDriver getDriver() {
		return driver;
	}
}