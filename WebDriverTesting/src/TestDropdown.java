import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDropdown {

	public static void main(String[] args) {


		WebDriver driver = new FirefoxDriver();
		driver.get("http://wikipedia.org");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		
		/*
		 * 
		 *  English - US
		 *  English - UK
		 * 
		 * 
		 */
		//driver.findElement(By.xpath("//*[@id='searchLanguage']")).sendKeys("Dansk");
		
		WebElement dropdown = driver.findElement(By.xpath("//*[@id='searchLanguage']"));
		Select select = new Select(driver.findElement(By.xpath("//*[@id='searchLanguage']")));
		//select.selectByVisibleText("Dansk");
		select.selectByValue("hi");
		
		//select.getOptions()
		
		
		
		
		List<WebElement> options = dropdown.findElements(By.tagName("option"));
		
		System.out.println(options.get(0).getAttribute("value"));
		
		System.out.println("Total values in dropdown are :"+options.size());
		
		for(int i=0; i<options.size();i++){
			
			System.out.println(options.get(i).getAttribute("lang"));
			
		}
	
		
		
		System.out.println("---------Printing all links----------");
		
		
		WebElement block = driver.findElement(By.xpath("//*[@id='www-wikipedia-org']/div[12]"));
		//block.sendKeys(keysToSend);
		
		List<WebElement> links = block.findElements(By.tagName("a"));
		
		System.out.println("Total links in page are :"+links.size());
		
		for(int i=0; i<links.size();i++){
			
			System.out.println(links.get(i).getAttribute("href"));
			
		}
	
		
		
	
		//driver.findElement(By.linkText("English")).click();
	
	}

}
