
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;


//@Listeners(Screenshot.TestNGCustom.class)

public class TestNG_test1 {
	 SoftAssert sa = new SoftAssert ();
  @AfterClass
  public void afterClass() {
	  System.out.println("@AfterClass");

  }
  @AfterGroups
  public void afterGroups() {
	  System.out.println("@AfterGroups");

  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("@AfterMethod");
	 
  }
  

  @AfterSuite
  public void afterSuite() {
	  System.out.println("@AfterSuite");

  }


  @AfterTest
  public void afterTest() {
	  System.out.println("@AfterTest");

  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("@BeforeClass");
  
  }

  @BeforeGroups
  public void beforeGroups() {
	  System.out.println("@BeforeGroups");
  
  }

  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("@BeforeMethod");
	  System.out.println("Soft Assert");

		
		

       
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("@BeforeSuite");

  }

  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("@BeforeTest");

  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
   //   new Object[] { 2, "b" },
   };
	//  System.out.println("@DataProvider");

  }

  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  System.out.println("@Test(dataProvider = 'dp')");
	 // Assert.fail();
	  

  }

  @Test
  public void test1(){

	  sa.assertTrue(true == false);
		System.out.println("Assert failed 1");
      sa.assertEquals("SoftAssert", "SoftAsserti");
      System.out.println("Assert failed 2");
      sa.assertEquals(0, 1);
      System.out.println("Assert failed 3");

		sa.assertTrue(1>2);
      System.out.println("Assert failed 4");
      
      sa.assertAll();
      
  }

}
