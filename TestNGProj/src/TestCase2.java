import org.testng.annotations.Test;

public class TestCase2 {
	
	@Test(priority=1,groups="high")
	public void one(){
		
		System.out.println("Executing test one");
	}
	
	@Test(priority=2,groups="high")
	public void two(){
		
		System.out.println("Executing test two");
	}
	
	@Test(priority=3,groups="mid")
	public void three(){
		
		System.out.println("Executing test three");
	}
	
	@Test(priority=4,groups="low")
	public void four(){
		
		System.out.println("Executing test four");
	}

}
