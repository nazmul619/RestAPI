package basicCoding;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

public class SimpleAnnotationExamples {
  @Test
  public void testMethod() {
	  System.out.println("from test method-- 1");
  }
  @Test
  public void testMethod1() {
	  System.out.println("from test method-- 2");
  }
  @Test
  public void testMethod2() {
	  System.out.println("from test method -- 3");
  }
  @Test
  public void testMethod3() {
	  System.out.println("from test method --- 4");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println(" * Before method * ");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println(" ** After method **");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("==== Before Class ===== ");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println(" ===== After Class =====");
  }
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println(" Before Suite  ");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println(" After Suite");
  }
  
  
  
}
