package scripts;

import org.testng.annotations.Test;

import pom.EnterTimeTrackPage;
import pom.LoginPage;
import generic.Base_Test;
import generic.Excel;

public class VerifyActitimeVersion extends Base_Test{
	
  @Test
  public void testVerifyActitimeVersion() throws InterruptedException
  {
	String un = Excel.getCellValue(PATH,"VerifyActitimeVersion",1,0);
	String pwd = Excel.getCellValue(PATH,"VerifyActitimeVersion",1,1);
	String lp_title = Excel.getCellValue(PATH,"VerifyActitimeVersion",1,2);
	String ep_title = Excel.getCellValue(PATH,"VerifyActitimeVersion",1,3);
		
		//pass the control of login page
		LoginPage lp=new LoginPage(driver);
		
		//enter valid un
		lp.setUsername(un);
		
	    Thread.sleep(2000);
		
		//enter valid pwd
		lp.setPassword(pwd);
		Thread.sleep(2000);
		
		//click on login
		lp.clickLogin();
		Thread.sleep(2000);
		
		
		//pass the home page control
		EnterTimeTrackPage ep=new EnterTimeTrackPage(driver);
		
		//verify home page
		ep.verifyhomepagetitle(ep_title);
		Thread.sleep(2000);
		
		//click on help
		ep.clickhelp();
		Thread.sleep(2000);
		
		//click on about actitime
		ep.clickabout();
		Thread.sleep(2000);
		
		//verify the actitime version
		ep.verifyversion();
		Thread.sleep(2000);
		
		//click on close
		ep.clickclose();
		Thread.sleep(2000);
		
		//click on logout
		ep.clicklogout();
		Thread.sleep(2000);
		
		//verify login page
		lp.verifyLoginPage(lp_title);
		
	}

}
