package Test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBrowsers {

	public static String browser = "ie";
	public static WebDriver driver;
	
	
	public static void main(String[] args) {


		if(browser.equals("firefox")){

			driver = new FirefoxDriver();
			
			}else if(browser.equals("ie")){

			driver = new InternetExplorerDriver();
				
			}else if(browser.equals("chrome")){

				driver = new ChromeDriver();
					
			}
		
		
		
		driver.get("http://google.com");
		driver.getTitle();
		driver.click("sdfsd");
		driver.sendKeys("sdfdsf");
	}

}
