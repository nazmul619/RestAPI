package othersCoding;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationTest {

	@BeforeSuite
	public void beforeSuiteMethod() {
		Reporter.log("-- @BeforeSuite -- Connection to the DB or download the input file from server, Established a connecion to the server",true);
	}


	@BeforeTest
	public void beforeTestMethod() {

		Reporter.log("--@BeforeTest --This method gets executed before each and every test block in testng.xml file",true);
	}

	@BeforeClass
	public void beforeClassMethod() {

		Reporter.log("--@BeforeClass --This method gets executed before each and every class in testng.xml file",true);
	}

	@BeforeMethod
	public void preCondition() {
		Reporter.log("-- @BeforeMethod -- This gets executed before each and every test method in testng.xml file",true);
	}

	@Test
	public void testCase1(){
		Reporter.log("-- testCase1 -- This is executable block of code",true);
	}

	@Test
	public void testCase2(){
		Reporter.log("-- testCase2 -- This is second test case",true);
	}
	@AfterMethod
	public void postCondition() {
		Reporter.log("-- @AfterMethod -- This gets executed after each and every test method in testng.xml file",true);	
	}

	@AfterClass
	public void afterClassMethod() {

		Reporter.log("-- @AfterClass -- This method gets executed after each and every class in testng.xml file",true);

	}
	@AfterTest
	public void afterTestMethod() {
		Reporter.log("-- @AfterTest -- This method gets executed after each and every test block in testng.xml file",true);
	}

	@AfterSuite	
	public void afterSuiteMethod() {
		Reporter.log("-- @AfterSuite -- Send reports after the execution of the framework to the steackholders",true);
	}


}
