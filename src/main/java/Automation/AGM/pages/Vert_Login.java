package Automation.AGM.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Automation.AGM.testBase.TestBase;

public class Vert_Login extends TestBase {
	
	public static final Logger log = Logger.getLogger(Vert_Login.class.getName());
	
	WebDriver driver;
	
	@FindBy(id="accountId")//Text Box
	WebElement vert_accountid;
	
	@FindBy(id="loginName")//Text Box
	WebElement vert_loginname;
	
	@FindBy(id="password")//Text Box
	WebElement vert_password;
	
	@FindBy(xpath="//a[@id='page-content' and text()='Login']")//Button
	WebElement vert_login;
		
	@FindBy(id="quickSearchQueryField")//Text Box
	WebElement vert_quicksearchqueryfield;

	@FindBy(xpath="//a[@id='quickSearchQueryFieldContainer' and class='matcher']")//Button
	WebElement vert_select;
	
	//Constructor
	public Vert_Login(WebDriver driver)	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	//Types into "Account ID" text box
	public void TypeAccountID(String TypeAccountID) {
		vert_accountid.clear();
		vert_accountid.sendKeys(TypeAccountID);
			Log("Entered Account ID: " + TypeAccountID);
	}
	
	//Types into "Username" text box
	public void TypeUserName(String TypeUserName) {
		vert_loginname.clear();
		vert_loginname.sendKeys(TypeUserName);
			Log("Entered Username: " + TypeUserName);
	}
	
	//Types into "Password" text box
	public void TypePassword(String TypePassword) {
		vert_password.clear();
		vert_password.sendKeys(TypePassword);
			Log("Entered Username: " + TypePassword);
	}
	
	//Clicks the "Login" button
	public void ClickLogin() {
		vert_login.click();
			Log("Clicked the \"Login\" button on the Vertafore Login page");
	}
	
	//Types into "Producer Quick Search" text box
	public void TypeProducerQuickSearch(String TypeProducerQuickSearch) {
		vert_quicksearchqueryfield.clear();
		vert_quicksearchqueryfield.sendKeys(TypeProducerQuickSearch);
			Log("Entered Producer Quick Search: " + TypeProducerQuickSearch);
	}
	
	//Clicks the first result
	public void ClickSelect() {
		vert_select.click();
			Log("Clicked the first result on the Producer Manager page");
	}
}