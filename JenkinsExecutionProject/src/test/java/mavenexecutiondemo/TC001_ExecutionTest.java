package mavenexecutiondemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC001_ExecutionTest {
	
	@Test
	public void tc001_ExecutionTest() {

		Reporter.log("*********************>>>>>>>>>>>>>>>>>>>>Hi From MAVEN<<<<<<<<<<<<<<<<<<<<<<****************************",true);
		
		String URL = System.getProperty("url");  //https://www.google.com/
		String USERNAME = System.getProperty("username");  //admin
		String PASSWORD = System.getProperty("password");  //admin
		
		Reporter.log(">>>>>>>"+URL,true);
		Reporter.log(">>>>>>>"+USERNAME,true);
		Reporter.log(">>>>>>>"+PASSWORD,true);
		
		//maven command for exceuting test case with parameters
		//mvn -Dtest=classname test -Durl=https://www.google.com/ -Dusername -Dpassword=admin
		
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
			
	}

}
