package othersCoding;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupExample {
	
	@Test(groups={"regression"})
	public void testCase1() {
		Reporter.log("regression testcase");
	}

}
