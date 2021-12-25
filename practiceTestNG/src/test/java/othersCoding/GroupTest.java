package othersCoding;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupTest {
	
	@Test(groups = {"Smoke Testing","Regression Testing"}) 
	public void createUser() {
		Reporter.log("Created ");
	}
	
	
	@Test(groups = {"Regression Testing"})
	public void editUser() {
		Reporter.log("Edited ");
	}
	

	@Test
	public void deletUser() {
		Reporter.log("Delete ");
	}

}
