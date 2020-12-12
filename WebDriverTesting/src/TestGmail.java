import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestGmail {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(10L, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		//ctrl + shift + o
		//driver.get("http://gmail.com");
		/*Navigation nav = driver.navigate();
		nav.to("http://gmail.com");*/
		
		driver.navigate().to("http://gmail.com");
		driver.manage().window().maximize();
		
		/*Thread.sleep(5000);
		
		driver.navigate().refresh();*/
		
		String actual_title = driver.getTitle();
		String expected_title = "Yahoo.com";
		
		
		
		
		if(actual_title.equals(expected_title)){
			
			System.out.println("Test case pass");
			
		}else{
			
			System.out.println("Test case fail");
			
		}
		
		
	/*	WebElement username = driver.findElement(By.xpath("//*[@id='Email']"));
		
		username.sendKeys("trainer@way2automation.com");

		
		WebElement btn = driver.findElement(By.id("next"));
		btn.click();*/
		
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("trainer@way2automation.com");
		driver.findElement(By.id("next")).click();
		
		
		driver.findElement(By.name("Passwd")).sendKeys("sdfsjdfgsd");
		driver.findElement(By.xpath("//*[@id='signIn']")).click();
		
		System.out.println(driver.findElement(By.xpath("//*[@id='errormsg_0_Passwd']")).getText());
		
		//driver.close(); //current window
		//driver.quit(); //current window + all related windows
		
		
	}

}
