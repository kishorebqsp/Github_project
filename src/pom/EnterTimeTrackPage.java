package pom;

import generic.Base_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class EnterTimeTrackPage extends Base_Page{

	@FindBy(id="logoutLink")
	private WebElement logout;
	
	@FindBy(xpath="(//div[@class='popup_menu_arrow'])[3]")
	private WebElement help;
	
	@FindBy(xpath="//a[.='About actiTIME']")
	private WebElement actitime;
	
	@FindBy(xpath="//span[.='actiTIME 2014 Pro']")
	private WebElement version;
	
	@FindBy(xpath="//img[@title='Close']")
	private WebElement close;
	
	public EnterTimeTrackPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void clickhelp()
	{
		help.click();
	}
	
	public void clickabout()
	{
		actitime.click();
	}
	
	public void verifyversion()
	{
		String aversion = version.getText();
		Assert.assertEquals(aversion,"actiTIME 2014 Pro");
		Reporter.log("version is same",true);
	}
									  
	public void clickclose()
	{
		close.click();
	}
	
	public void clicklogout()
	{
		logout.click();
		
	}
	
	public void verifyhomepagetitle(String hp)
	{
		verifyTitle(hp);
	}

}
