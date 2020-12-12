package DataFeed.CP;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import ExcelUtils;

public class DataFeedingOstia {
	WebDriver drv;

	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Jars\\ChromeDriver\\chromedriver.exe");
		drv = new ChromeDriver(options);
	//	drv.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Thread.sleep(6000);
		drv.get("https://docs.google.com/forms/d/e/1FAIpQLSck7LDQOarbftxCJhYMrolDSSLi6Yg-qNJFsiIr_axV2vATMQ/viewform");
		
	
	}
	
		@Test(dataProvider="entry")
		public void enterdata( String caname,String email,String conum,String city,String loca,String role,String quali, String skiexcel) throws  Exception{
		drv.findElement(By.name("entry.188382649")).sendKeys(caname);
		drv.findElement(By.name("entry.1980116513")).sendKeys(email);
		drv.findElement(By.name("entry.1366591038")).sendKeys(conum);
		drv.findElement(By.name("entry.514197731")).sendKeys(city);
		drv.findElement(By.name("entry.1925451438")).sendKeys(loca);
		drv.findElement(By.name("entry.212057681")).sendKeys(role);
		drv.findElement(By.name("entry.759549307")).sendKeys(quali);
		drv.findElement(By.name("entry.1748921611")).sendKeys(skiexcel);
		
	//	drv.findElement(By.xpath("//*[@id='mG61Hd']/div/div[2]/div[3]/div[1]/div/div/content/span")).click();
		drv.findElement(By.xpath("//*[@id='mG61Hd']/div/div[2]/div[3]/div[1]/div[1]/div/content/span")).click();
	
		drv.quit();
	}


		 @DataProvider
		 
		    public Object[][] entry() throws Exception{
		 
		       Object[][] testObjArray = ExcelUtils.getTableArray("D:\\Downloads\\Docs\\DataFeed\\Copy Paste Basic 1.xlsx","basic 1");
	      return (testObjArray);
		 
				}

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeSuite
	public void beforeSuite() {
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("Quitting"); // will get you all the image urls on
										// the page
		// drv.switchTo().defaultContent();
	drv.quit();
	}

}
