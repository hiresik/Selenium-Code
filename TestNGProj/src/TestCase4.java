import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase4 {
	
	
	@Test
	public void validateTitlesTest(){
		
		String actual_title = "Gmail.com"; //website
		String expected_title = "Yahoo.com"; //specs excel
		
		Assert.assertEquals(actual_title, expected_title);
		
		/*
		if(actual_title.equals(expected_title)){
			
			
			System.out.println("PASS");
		}else{
			
			
			System.out.println("FAIL");
		}*/
		
		
		
		
	}

}
