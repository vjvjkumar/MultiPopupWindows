package Pack2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ExceptionTryCatchVJ {
	
	@Test
	public void exception_IFcondition() throws IOException, InterruptedException{
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
	try{
		driver.get("http://gmail.com");
		driver.findElement(By.id("Email")).sendKeys("vkumar.plr");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("test1234");
		driver.findElement(By.id("sign33In")).click();
	}catch(Throwable a){
	
	File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(srcFile, new File("V:/testfile/gmail.jpg"));
	
	System.out.println("Element not found" +a);
	}
	
	driver.findElement(By.linkText("Forgot password?")).click();
	
}
}