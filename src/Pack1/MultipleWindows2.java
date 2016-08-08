package Pack1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MultipleWindows2 {

		public static String x;
		public static WebDriver driver;
		public static void loop() {
			
			Set<String> allwindowids = driver.getWindowHandles();
			Iterator<String> iter = allwindowids.iterator();

				while(iter.hasNext()) {
				System.out.println(iter.next());
				}
				driver.switchTo().window(x);
				}

	@Test
		public void MultipleWindows() throws InterruptedException {

			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("http://www.paddypowerplc.com/");
			Thread.sleep(3000);
			
			
			driver.findElement(By.xpath("//*[@id='block-menu-menu-media-links']/ul/li[1]/a")).click();
			loop();
			driver.findElement(By.xpath("html/body/header/div[1]/div/div[2]/ul/li[3]/a")).click();
			loop();
			driver.findElement(By.xpath("html/body/div[1]/div/section/p[1]/a")).click();
			loop();
			driver.findElement(By.xpath("html/body/div[2]/section/div/div[3]/div/div[1]/p[3]/a")).click();
			driver.close();
			driver.switchTo().window(x);
			driver.close();
			}
	}		
	

