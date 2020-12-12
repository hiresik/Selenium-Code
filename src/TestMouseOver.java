import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;

public class TestMouseOver {

	public static void main(String[] args) throws InterruptedException {

		
		
		 File pathToBinary = new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
	        FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
	        ProfilesIni prof=new ProfilesIni();//profiling
	        FirefoxProfile firefoxProfile = prof.getProfile("selenium");       
	        WebDriver driver = new FirefoxDriver(ffBinary,firefoxProfile);
		driver.get("http://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
	
		
		
		//driver.findElement(By.cssSelector("html/body/div[8]/div[2]/div/div/div/div/div[2]/form[1]/input[1]")).sendKeys("234234324");
		driver.findElement(By.xpath("html/body/div[8]/div[2]/span")).click();;
	
		
		
		WebElement menu = driver.findElement(By.xpath("//*[@id='fk-mainhead-id']/div[2]/div/div/ul/li[2]"));
		
		Actions action = new Actions(driver);
		action.moveToElement(menu).perform();
		
		driver.findElement(By.xpath("//*[@id='menu-men-tab-0-content']/ul[2]/li[6]/a")).click();
		
		
		
		/*	System.out.println(driver.findElement(By.cssSelector("span.close-icon.close")).isDisplayed());
		
		driver.findElements(By.cssSelector("span.close-icon.close")).size();
	
		driver.findElement(By.cssSelector("span.close-icon.close")).click();
*/
	}

}
