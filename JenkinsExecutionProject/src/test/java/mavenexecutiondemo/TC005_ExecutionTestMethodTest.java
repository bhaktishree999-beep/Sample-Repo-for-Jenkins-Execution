package mavenexecutiondemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC005_ExecutionTestMethodTest {
	
	@Test
	public void test1() {

		Reporter.log("*********************>>>>>>>>>>>>>>>>>>>>Hi From MAVEN<<<<<<<<<<<<<<<<<<<<<<****************************",true);
		
	}
	
	@Test
	public void test2() {
		Reporter.log("****2nd test******8888",true);

	}

}
