package othersCoding;

import org.testng.annotations.Test;

public class PriorityTest {
  @Test 
  public void createUser() {
	  System.out.println("user created successfully -============================");
	  
  }
  
  @Test(dependsOnMethods= "createUser")
  public void updateUser() {
	  System.out.println("user updated successfully----==============================");
  }
  
  @Test(dependsOnMethods = "updateUser")
  public void deleteUser() {
	  System.out.println("user deleted successfully");
  }
  
  
}

