import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ExpediaTest {

	public static void main(String[] args) {


		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.expedia.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='tab-flight-tab']")).click();
		driver.findElement(By.xpath("//*[@id='flight-origin']")).sendKeys("Delhi");
		new Actions(driver).sendKeys(Keys.BACK_SPACE).perform();
		driver.findElement(By.xpath("//*[@id='aria-option-0']")).click();
		driver.findElement(By.xpath("//*[@id='flight-departing']")).click();
		driver.findElement(By.xpath("//*[@id='home-page']/div[16]/div/div/section[1]/ul/li[30]/a")).click();
		
		
		
		
	}

}
