import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class TestDropDowns {

	
	public static void main(String[] args) {

		/*
		 * 
		 * Assignment - Handle multiple checkboxes
		 * 
		 */
		//http://www.tizag.com/htmlT/htmlcheckboxes.php


		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		
	//	driver.findElement(By.xpath("//*[@id='searchLanguage']")).sendKeys("Dansk");
	
		WebElement dropdown = driver.findElement(By.xpath("//*[@id='searchLanguage']"));
		Select select = new Select(driver.findElement(By.xpath("//*[@id='searchLanguage']")));
		//select.selectByVisibleText("Dansk");
		select.selectByValue("hi");
		
		System.out.println("--------Printing all dropdown valuees----");
		
		
		List<WebElement> values = dropdown.findElements(By.tagName("option"));
		
		System.out.println(values.get(4).getText());
		
		System.out.println(values.size());
		
		for(int i=0; i<values.size(); i++){
			
			
			System.out.println(values.get(i).getAttribute("lang"));
		}
		
		
		System.out.println("-----Print all URLs from the page--------");
		
		WebElement block = driver.findElement(By.xpath("//*[@id='www-wikipedia-org']/div[12]"));
		
		
		
	List<WebElement> links = block.findElements(By.tagName("a"));
		
			System.out.println(links.size());
		
		for(int i=0; i<links.size(); i++){
			
			
			System.out.println(links.get(i).getAttribute("href"));
		}
		
		
		
	}

}
