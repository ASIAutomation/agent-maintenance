package Automation.FLDOILicensing.Pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import Automation.FLDOILicensing.testbase.FLTestBase;

public class FLDOILicenseNumber extends FLTestBase{
	
	WebDriver driver;
	
	public FLDOILicenseNumber(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;	
	}
	
	public void TypeLicenseNumber(String typelicensenumber)
	{
		WebElement licensenumber = driver.findElement(By.id("txtLicenseeLicenseNumber"));
		licensenumber.clear();
		licensenumber.sendKeys(typelicensenumber);
		Log("Entered License Number: " + typelicensenumber);
	}
	
	public void ClickContinue()
	{	
		WebElement continuebutton = driver.findElement(By.id("btnSearch"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", continuebutton);
		Log("Clicked the \"Continue\" button on the License Number page");
	}
}
