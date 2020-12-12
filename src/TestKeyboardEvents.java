import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestKeyboardEvents {

	public static void main(String[] args) throws InterruptedException {


		   WebDriver driver = new FirefoxDriver();
		   driver.get("http://gmail.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);

			
			driver.findElement(By.id("Email")).sendKeys("trainer@way2automation.com");
	
	
			Actions action = new Actions(driver);
			action.sendKeys(Keys.ENTER).perform();
			Thread.sleep(4000);
			driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]")).click();
			action.sendKeys(Keys.BACK_SPACE).perform();
			Thread.sleep(4000);
			driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]")).click();
			action.sendKeys(Keys.chord(Keys.CONTROL+"a")).perform();
			action.sendKeys(Keys.chord(Keys.CONTROL+"c")).perform();
			driver.findElement(By.xpath("//*[@id='Email']")).click();
			action.sendKeys(Keys.chord(Keys.CONTROL+"v")).perform();
	
	}

}
