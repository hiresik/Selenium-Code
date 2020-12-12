

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import ErrorCollectors.ErrorCollector;


public class TestValidateTitles {
	
	
	@Test
	public void ValidteTitle(){
		try{
		System.out.println("Beginning");
		
		String actual_title = "Gmail.com";
		String expected_title = "Yahoo.com";
		
		AssertJUnit.assertEquals(expected_title, actual_title);
		}catch(Throwable t){
			
			System.out.println("Error Occurred");
			ErrorCollector.addVerificationFailure(t);
			
		}
		System.out.println("Ending");
		
	}

}
