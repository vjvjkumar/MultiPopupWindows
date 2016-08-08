package Pack1;


	
	

	import java.util.Iterator;
	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.Test;


	public class Gmail_MultipleWindows {		
		
		@Test
		public void NewWindows() throws InterruptedException{
			
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("http://gmail.com");
			Thread.sleep(3000);
			
			//driver.findElement(By.xpath("html/body/div[1]/div[3]/div[3]/div[2]")).click(); // this is for hdfc greetings window message
			//driver.findElement(By.linkText("Demat Account")).click();
			
			driver.findElement(By.xpath(".//*[@id='link-signup']/a")).click();
			driver.findElement(By.xpath(".//*[@id='wrapper']/div[2]/div/div[1]/p/a")).click();
			
			
			// To get window IDs we have to use Java Collections
			//Set and Iterator: these collections will print the window IDs in Sort-Order
			
			Set<String> allwindowids = driver.getWindowHandles();
			Iterator<String> iter = allwindowids.iterator();
			
			//now print Window ID
			 while(iter.hasNext()){
				System.out.println(iter.next());
			}
			 
			   // allwindowids = driver.getWindowHandles();
				//iter = allwindowids.iterator();
				
			
			String MainWindow = iter.next();
			String NewWindow1 = iter.next();
			String NewWindow2 = iter.next();
			
						
			driver.switchTo().window(NewWindow1);
			driver.findElement(By.xpath("html/body/div[2]/header/div[3]/div/div/div/span/a/span")).click();
			
			driver.switchTo().window(NewWindow2);
			driver.findElement(By.xpath(".//*[@id='view_container']/div/div[3]/a/div[2]/span")).click();
			
			driver.switchTo().window(MainWindow);
			driver.close();
	       
			driver.switchTo().window(NewWindow2);
			driver.close();
			
						
			driver.switchTo().window(NewWindow1);
			driver.findElement(By.id("FirstName")).sendKeys("vijay");
			
			
			//driver.close();
			
			//to close both or all the windows together
		}			// driver.quit();  //
			

}
