package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RediffRegistrationVJ {

	@Test
	public void rediffregistration() throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://rediff.com");
		driver.findElement(By.linkText("Create a Rediffmail account")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[3]/td[3]/input")).sendKeys("vijay kumar");
		driver.findElement(By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[7]/td[3]/input[1]")).sendKeys("vjvjkumar@rediff.com");
		driver.findElement(By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[9]/td[3]/input")).sendKeys("testing123");
		driver.findElement(By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[11]/td[3]/input")).sendKeys("testing123");
		
		driver.findElement(By.xpath("//*[@id='mobno']")).sendKeys("9972306406");
		
		driver.findElement(By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[23]/td[3]/select[1]")).sendKeys("01");
		driver.findElement(By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[23]/td[3]/select[2]")).sendKeys("JAN");
		driver.findElement(By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[23]/td[3]/select[3]")).sendKeys("2010");
		driver.findElement(By.xpath("//*[@id='country']")).sendKeys("India");
		driver.findElement(By.xpath("//*[@id='Register']")).click();
		
		
		
		
	}
}
