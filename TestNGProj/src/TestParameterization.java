import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterization {

	public static ExcelReader excel = null;
	public static WebDriver driver;
	
	@BeforeTest
	public void setUp(){
		
		driver = new FirefoxDriver();
		
	}
	
	@AfterTest
	public void tearDown(){
		
		driver.quit();
		
	}
	
	@Test(dataProvider="getData")
	public void testData(String username, String password){
		
		driver.get("http://gmail.com");
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys(username);
	}
	
	
	@DataProvider
	public static Object[][] getData(){
		
		
		if(excel ==null){
			
			excel = new ExcelReader("C:\\Users\\Selenium\\Desktop\\testdata.xlsx");
			
		}
		
		String sheetName = "LoginTest";
		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);
		
		System.out.println("Total rows are : "+rows);
		System.out.println("Total cols are : "+cols);
		
		Object[][] data = new Object[rows-1][cols];
		

		for(int rowNum = 2 ; rowNum <= rows ; rowNum++){ //2
			
			for(int colNum=0 ; colNum< cols; colNum++){
				data[rowNum-2][colNum]=excel.getCellData(sheetName, colNum, rowNum); //-2
			}
		}
		
		
			
		return data;
		
		
		
	}
	
}
