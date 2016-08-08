package Pack2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Exception_IFConditionVJ {
	
	@Test
	
	public void exceptionIFcondition () {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://google.co.uk");
		
		String title = driver.getTitle();
		if(title.equalsIgnoreCase("Google_Page")){ // correct page title is "Google" 
			
			System.out.println("Application Title is Correct:");
		}else{
			System.out.println("Application Title is InCorrect:");
			
		}
		driver.get("http://ebay.co.uk");
	}

}
