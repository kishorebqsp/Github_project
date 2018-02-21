package scripts;

import org.testng.annotations.Test;

import pom.EnterTimeTrackPage;
import pom.LoginPage;
import generic.Base_Test;
import generic.Excel;

public class ValidLoginLogout extends Base_Test {
	
	@Test
	public void testValidLoginLogout() throws InterruptedException
	{
		String un = Excel.getCellValue(PATH,"ValidLoginLogout",1,0);
		String pwd = Excel.getCellValue(PATH,"ValidLoginLogout",1,1);
		String lp_title = Excel.getCellValue(PATH,"ValidLoginLogout",1,2);
		String ep_title = Excel.getCellValue(PATH,"ValidLoginLogout",1,3);
		
		//pass the Login page control
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
		
		//pass the Home page control
		EnterTimeTrackPage ep=new EnterTimeTrackPage(driver);
		
		//verify home page
		ep.verifyhomepagetitle(ep_title);
		
		Thread.sleep(2000);
		
		//click on logout
		ep.clicklogout();
		
		Thread.sleep(2000);
		
		//verify login page
		lp.verifyLoginPage(lp_title);
		
	}

}
