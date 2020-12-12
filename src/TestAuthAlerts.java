import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestAuthAlerts {

	public static void main(String[] args) {


		WebDriver driver = new FirefoxDriver();
		driver.get("http://grcdev:nearlythere@getproactiv-ca.stg01.grdev.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
	

	}

}
