import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestDay1 {

	
	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new FirefoxDriver();
		//driver.manage().timeouts().pageLoadTimeout(1L, TimeUnit.SECONDS);
		driver.get("http://gmail.com");
		
		/*Options opt = driver.manage();
		Timeouts time = opt.timeouts();
		time.implicitlyWait(20L, TimeUnit.SECONDS);*/
		
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		
		String actual_title = driver.getTitle();
		System.out.println(actual_title);
		
		
		String expected_title = "Yahoo.com";
		
		
		
		if(actual_title.equals(expected_title)){
			
			System.out.println("Test case pass");
		}else{
			
			System.out.println("Test case fail");
			
		}
		
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("trainer@way2automation.com");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.name("Passwd")).sendKeys("sdfdf");
		driver.findElement(By.cssSelector("#signIn")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id='errormsg_0_Passwd']")).getText());
		
		
	/*	WebElement email = driver.findElement(By.xpath("//*[@id='Email']"));
		email.sendKeys("trainer@way2automation.com");
		
		WebElement btn = driver.findElement(By.id("next"));
		btn.click();
		
		Thread.sleep(2000);
		
		WebElement pass = driver.findElement(By.name("Passwd"));
		pass.sendKeys("sdhfsiodjf");
		
		
		WebElement signIn = driver.findElement(By.cssSelector("#signIn"));
		signIn.click();
		
		
		WebElement errMsg = driver.findElement(By.xpath("//*[@id='errormsg_0_Passwd']"));
		System.out.println(errMsg.getText());*/
		/*driver.close();
		driver.quit();*/
		
		
		
		
		
		

	}

}
