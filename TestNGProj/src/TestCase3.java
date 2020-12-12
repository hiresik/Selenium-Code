import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestCase3 {
	
	@Test(groups="mid")
	public void doLogin(){
		
		System.out.println("Executing login test");
		//Assert.fail();
	}
	
	@Test(dependsOnMethods="doLogin",groups="mid")
	public void doUserReg(){
		
		System.out.println("User registeration test");
		
	}
	
	@Test(groups="high")
	public void validateData(){
		
		System.out.println("Validating data");
		throw new SkipException("Skipping the testcase as the condition is not valid");
		
	}

}
