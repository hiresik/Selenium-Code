import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	
	
	
	
	
	@BeforeTest
	public void createDBConn(){
		
		System.out.println("Creating the DB Conn");
		
	}
	
	@AfterTest
	public void closeDBConn(){
		
		
		System.out.println("Closing the DB Conn");
		
		
		
	}
	
	@BeforeMethod
	public void openBrowser(){
		
		System.out.println("Opening the browser");
		
	}
	
	@AfterMethod
	public void closeBrowser(){
		
		System.out.println("Closing the browser");
	}
	
	@Test(groups="high")
	public void loginTest(){
		
		
		System.out.println("Executing Login Test");
		
	}
	
	@Test(groups="low")
	public void userRegTest(){
		
		System.out.println("Executing User Reg test");
		
	}
	

}
