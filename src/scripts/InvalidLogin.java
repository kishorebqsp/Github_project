package scripts;

import org.testng.annotations.Test;

import pom.LoginPage;
import generic.Base_Test;
import generic.Excel;

public class InvalidLogin extends Base_Test{
	
	@Test
	public void testInvalidLogin() throws InterruptedException
	{
	
		String un = Excel.getCellValue(PATH,"InvalidLogin",1,0);
		String pwd = Excel.getCellValue(PATH,"InvalidLogin",1,1);
		
		//pass the Login page control
		LoginPage lp=new LoginPage(driver);
		
		//enter invalid un
		lp.setUsername(un);
		
		Thread.sleep(2000);
		
		//enter invalid pwd
		lp.setPassword(pwd);
		
		Thread.sleep(2000);
		
		//click on login
		lp.clickLogin();
		
		Thread.sleep(2000);
		
		//verify errmsg
		lp.verifyeermsg();
	}

}
