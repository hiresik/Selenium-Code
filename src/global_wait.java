import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class global_wait {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
	
		
		System.out.println("Hello!!! how are you?");
		
	//	Thread.sleep(5000L);
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.cricbuzz.com/cricket-scorecard-archives/scorecard/10719");
		
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		
		
		
		System.out.println("I am good!!!");
		
	}

}
