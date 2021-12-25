package othersCoding;

import org.testng.annotations.Test;

public class AppDemo {

	@Test 
	public void createUser() {
		System.out.println("Created ");
	}
	
	
	@Test
	public void editUser() {
		System.out.println("Edited ");
	}
	
	//
	@Test
	public void deletUser() {
		System.out.println("Delete ");
	}


}

// default priority is  0
// negative number also allow.. 
// @Test(invocationCount = 5) // it runs 5 time
// @Test(enabled=false)   // Not to run


/*
@Test (priority=1)
	public void createUser() {
		System.out.println("Created ");
	}
	
	//@Test(priority=2)
	
	@Test(enabled=false)   // Not to run
	public void editUser() {
		System.out.println("Edited ");
	}
	
	//@Test(priority=3)
	@Test(invocationCount = 5) // it runs 5 time
	public void deletUser() {
		System.out.println("Delete ");
	}


*/