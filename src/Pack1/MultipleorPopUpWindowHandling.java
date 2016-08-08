package Pack1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class MultipleorPopUpWindowHandling {
	
	
	@Test
	public void PopUpWindow() throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://hdfcbank.com");
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("html/body/div[1]/div[3]/div[3]/div[2]")).click(); // this is for hdfc greetings window message
		//driver.findElement(By.linkText("Demat Account")).click();
		
		driver.findElement(By.xpath("html/body/div[4]/div/div[4]/div[1]/div[1]/div/div[5]/img[1]")).click();
		driver.findElement(By.xpath("html/body/div[4]/div/div[4]/div[1]/div[1]/div/div[5]/div[1]/div/div/a[1]/img")).click();
		
		// To get window IDs we have to use Java Collections
		//Set and Iterator: these collections will print the window IDs in Sort-Order
		
		Set<String> allwindowids = driver.getWindowHandles();
		Iterator<String> iter = allwindowids.iterator();
		
		//now print Window ID
		 while(iter.hasNext()){
			System.out.println(iter.next());
		}
		 
		    allwindowids = driver.getWindowHandles();
			iter = allwindowids.iterator();
			
		
		String MainWindow = iter.next();
		String NewWindow1 = iter.next();
		String NewWindow2 = iter.next();
		String NewWindow3 = iter.next();
		
		driver.switchTo().window(NewWindow1);
		driver.switchTo().window(NewWindow2);
		driver.switchTo().window(NewWindow3);
		driver.switchTo().window(NewWindow3);
		
		driver.findElement(By.xpath("html/body/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[1]/table/tbody/tr[2]/td[3]/input")).sendKeys("vijay");
		driver.findElement(By.xpath("html/body/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[3]/input")).sendKeys("kumar");
		driver.close();
		
		driver.switchTo().window(MainWindow);
		
		
		//driver.close();
		
		//to close both or all the windows together
		// driver.quit();  //
		
		
		
		
		
		
	}

	
}
