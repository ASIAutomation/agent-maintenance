package Automation.AGM.puspages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Automation.AGM.testBase.TestBase;

public class PrincipalUserSetup extends TestBase 
{
	WebDriver driver;
	
	public PrincipalUserSetup(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;	
	}
	
	public void ClickPus()
	{
		WebElement pus = driver.findElement(By.xpath("//*[@id=\"dgMenuOptions\"]/tbody/tr[10]/td"));
		pus.click();
		Log("Clicked 'Principal User Setup on Main Page");
	}
	
	public void ClickAddNew()
	{
		WebElement addnew = driver.findElement(By.id("btnAdd"));
		addnew.click();
		Log("Clicked 'add new' on Principal User Setup");
	}
	
	public void TypeUserID(String typeuserid)
	{
		WebElement userid = driver.findElement(By.id("txtUserID"));
		userid.clear();
		userid.sendKeys(typeuserid);
		Log("Typed: " + typeuserid + " in UserID textbox");
	}
	
	public void TypeFullName(String typefullname)
	{
		WebElement fullname = driver.findElement(By.id("txtFullName"));
		fullname.clear();
		fullname.sendKeys(typefullname);
		Log("Typed: " + typefullname + " in Full Name textbox");
	}
	
	public void TypeEmail(String typeemail)
	{
		WebElement email = driver.findElement(By.id("txtEmail"));
		email.clear();
		email.sendKeys(typeemail);
		Log("Typed: " + typeemail + " in Email textbox");
	}
	
	public void TypeSSN(String typessn)
	{
		WebElement ssn = driver.findElement(By.id("txtEIN"));
		ssn.clear();
		ssn.sendKeys(typessn);
		Log("Typed: " + typessn + " in SSN textbox");
	}
	
	public void TypePassword(String typepassword)
	{
		WebElement pw = driver.findElement(By.id("txtPassword"));
		pw.clear();
		pw.sendKeys(typepassword);
		Log("Typed: " + typepassword + " in Password textbox");
	}
	
	public void SelectSecurity(String selectsecurity)
	{
		WebElement sec = driver.findElement(By.id("ddlSecurity"));
		new Select(sec).selectByVisibleText(selectsecurity);
		Log("Selected: " + selectsecurity + " in the security dropdown");
	}
	
	public void SelectPosition(String selectposition)
	{
		WebElement position = driver.findElement(By.id("ddlUserPosition"));
		new Select(position).selectByVisibleText(selectposition);
		Log("Selected: " + selectposition + " in Position dropdown");
	}
	
	public void TypeDOB(String typedob)
	{
		WebElement dob = driver.findElement(By.id("txtDOB"));
		dob.clear();
		dob.sendKeys(typedob);
		Log("Typed: " + typedob + " in DOB textbox");
	}
	
	public void ClickSubmit()
	{
		WebElement submit = driver.findElement(By.id("btnSubmit"));
		submit.click();
		Log("Clicked on 'Submit' on Principal User Setup Page");
	}
	
	public void ClickLogout()
	{
		WebElement logout = driver.findElement(By.xpath("//*[@id=\"divFixedMenu\"]/div[2]/a[6]/div"));
		logout.click();
		Log("Clicked 'Log Out'");
	}
}
