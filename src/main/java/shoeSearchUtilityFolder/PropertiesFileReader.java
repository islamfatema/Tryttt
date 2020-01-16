package shoeSearchUtilityFolder;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader {
   
	public Properties getProperty() throws IOException{
		FileInputStream fis=null;
		Properties properties= new Properties();
		try {
			properties.load(new FileInputStream("/Users/fatemaislam/Documents/workspace/TekSystem.com/resousces/browser-config.properties"));
		}catch(Exception e) {
			System.out.println("Exception: " + e);
		}
		
		
		return properties;
		
	}
}
