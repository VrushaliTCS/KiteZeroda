package KiteTest;

import org.testng.Assert;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base1;
import POM_classes.Pom1;
import POM_classes.Pom2;
import POM_classes.Pom3;
import Utility.Utility_class;

public class Test_class extends Base1 {
//declare all useful memeber as global
	Pom1 login1;
	Pom2 login2;
	Pom3 login3;
	
	@BeforeClass
	public void openBrowser()throws Throwable {
		initializeBrowser();
		
		//all objects of pom classes
		login1=new Pom1(driver);
		login2=new Pom2(driver);
		login3=new Pom3(driver);
	}
	
	@BeforeMethod
	public void loginToApp() throws Throwable{
		//enterUn
		login1.enterUN(Utility_class.getTD(0, 0));//DPG458
		System.out.println(Utility_class.getTD(0, 0));
		
		//enterPWD
		login1.enterPWD(Utility_class.getTD(0, 1));
		System.out.println(Utility_class.getTD(0, 1));
		
		//loginclick
		login1.clickloginBTN();
		
		//pin
		login2.enterPIN(Utility_class.getTD(0, 3));
		System.out.println(Utility_class.getTD(0, 3));
		
		//continue
		login2.clickcntbtn();
		
	}
	
	@Test
	public void enteruserID() throws Throwable {
		Reporter.log("running verify user id",true);
		String actID=login3.enteruserID();
		String expID=Utility_class.getTD(0, 0);
		Assert.assertEquals(expID,actID);
	}
	@AfterMethod
	public void logoutApp() {
		Reporter.log("logout",true);
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("close browser",true);
	}
}
