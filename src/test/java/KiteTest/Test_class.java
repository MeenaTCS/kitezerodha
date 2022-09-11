package KiteTest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pom_classes.Pom1;
import Pom_classes.Pom2;
import Pom_classes.Pom3;
import Utility.Utility_class;

public class Test_class extends BaseClass {
	//declare all usefull member as global
	Pom1 login1;
	Pom2 login2;
	Pom3 home;
	
	@BeforeClass
	public void openBrowser() {
		initilizeBrowser();
		//all objects of pom classes
		login1=new Pom1(driver);
		login2=new Pom2(driver);
		home=new Pom3(driver);
	}
	@BeforeMethod
	public void logintoapp() throws Throwable {
		//enter un
		login1.enterUN(Utility_class.getTD(0, 0));
		System.out.println((Utility_class.getTD(0, 0)));
		//enter pwd
		login1.enterpwd(Utility_class.getTD(0, 1));
		//click on login btn
		login1.enterloginbtn();
		//enter pin
		login2.enterpin(Utility_class.getTD(0, 2));
		//click on ctnbtn
		login2.enterctnbtn();
		
	}
	
	@Test
	public void verifyuserid() throws Throwable {
		Reporter.log("running verify userid",true);
		String actID=home.verifyuserid();
		String expID=Utility_class.getTD(0, 0);
		Assert.assertEquals(expID, actID,"both are different tc is failed");
	}
	
	@AfterMethod
	public void logoutapp() {
		Reporter.log("logout the appication",true);
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("close the app",true);
	}

}
