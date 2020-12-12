
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class TestNG_01 {

	
  @Test 
  public void test_01() {
		SoftAssert sa = new SoftAssert ();
		sa.assertTrue(true == false);
		System.out.println("Assert failed 1");
		sa.assertEquals("SoftAssert", "SoftAsserti");
		System.out.println("Assert failed 2");
		sa.assertEquals(1, 1);
		System.out.println("Assert passed 3");

		sa.assertTrue(1 > 2);
		System.out.println("Assert failed 4");

		sa.assertAll();
  }
  
  @Test 
  public void test_02() {
		
		SoftAssert sa = new SoftAssert ();
	sa.assertTrue(true == true);
		System.out.println("Assert test02 passed 1");
		sa.assertEquals("SoftAssert", "SoftAssert");
		System.out.println("Assert test02 passed 2");
		sa.assertEquals(0, 0);
		System.out.println("Assert test02 passed 3");

		sa.assertTrue(1 < 2);
		System.out.println("Assert test02 passed 4");

		sa.assertAll();
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
		//sa.assertAll();
  }


  
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
