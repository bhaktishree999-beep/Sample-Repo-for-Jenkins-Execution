package mavenexecutiondemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC003_ExecutionTest {
	
	@Test
	public void tc001_ExecutionTest() throws InterruptedException {

		Reporter.log("*********************>>>>>>>>>>>>>>>>>>>>Hi From MAVEN<<<<<<<<<<<<<<<<<<<<<<****************************",true);

		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
