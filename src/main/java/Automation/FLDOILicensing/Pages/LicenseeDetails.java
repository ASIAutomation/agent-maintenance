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

public class LicenseeDetails extends FLTestBase{

	WebDriver driver;

	public LicenseeDetails(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;	
	}

	public void ClickChooseAnotherLicensee()
	{	
		WebElement chooseanotherlicenseebuttoon = driver.findElement(By.id("btnLicensee"));
		chooseanotherlicenseebuttoon.click();
		Log("Clicked the \"Choose Another Licensee\" button on the Licensee Details page");
	}

	public void ClickContinue()
	{	
		WebElement continuebutton = driver.findElement(By.id("btnContinue"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", continuebutton);
		Log("Clicked the \"Continue\" button on the Licensee Details page");
	}
}
