import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCheckboxes {

	public static void main(String[] args) {


		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
	
		/*
		 * 
		 * math.random()
		 * 
		 * 
		 */
		
		WebElement block = driver.findElement(By.xpath("html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]"));
		
		List<WebElement> checkboxes = block.findElements(By.name("sports"));

		
		System.out.println("Total checkboxes are : "+checkboxes.size());
		
		
	/*	
		
		for(int i=0; i<checkboxes.size(); i++){
			
			checkboxes.get(i).click();
			
		}
		*/
		
		for(WebElement check: checkboxes){
			
			check.click();
		}
		
		
		
	}

}
