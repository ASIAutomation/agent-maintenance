package Automation.AGM.maintenancepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Automation.AGM.testBase.TestBase;

public class LoginMaintenance extends TestBase 
{

	WebDriver driver;

	public LoginMaintenance(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;	
	}
	
	public void TypeCurrentUser(String typecurrentuser)
	{
		WebElement curruser = driver.findElement(By.id("txtSearchID"));
		curruser.clear();
		curruser.sendKeys(typecurrentuser);
		Log("Current User: " + typecurrentuser + " typed in");
	}
	
	public void ClickLookup()
	{
		WebElement lookup = driver.findElement(By.id("btnLookup"));
		lookup.click();
		Log("Clicked 'Lookup' on the login maintenance page");
	}
	
	public void ClickDelete()
	{
		WebElement delete = driver.findElement(By.id("btnDeleteTop"));
		delete.click();
		Log("Clicked 'Delete' on the login maintenance page");
	}
}
