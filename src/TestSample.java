import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestSample {

	public static void main(String[] args) {

		System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
		
		
		

	}

}
