package Base_Utility_ActiTest;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Acti_classes.Login_class1;

public class ActiTest extends BaseActi {
	Login_class1 log1;
	
	@BeforeClass
	public void openBrowser()throws Throwable {
	
	initialiseBrowser();
	 log1=new Login_class1(driver);
	}
	
	@BeforeMethod
	public void loginToapp()throws Throwable {
		log1.enterUName(UtilityActi.getTD(0, 0));
		System.out.println(UtilityActi.getTD(0, 0));
		
		log1.enterPWD(UtilityActi.getTD(0, 1));
		System.out.println(UtilityActi.getTD(0, 1));
		log1.clickLoginbtn();
		
	}
	
	@Test
	public void nothing() throws Throwable{
		Reporter.log("running TC",true);
	}
	@AfterMethod 
	public void logOut() throws Throwable{
		Reporter.log("running from llogout",true);
	}
	@AfterClass
	public void closeBrowser()throws Throwable {
		Reporter.log("running from close Browser",true);
	}
	
	
}
