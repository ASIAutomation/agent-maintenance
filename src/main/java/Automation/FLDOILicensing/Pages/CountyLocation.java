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

public class CountyLocation extends FLTestBase {
	
WebDriver driver;
	
	public CountyLocation(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;	
	}
	
	public void SelectCountyLocation(String selectcountylocation)
	{
		WebElement countylocation = driver.findElement(By.id("cboCounty"));
		new Select(countylocation).selectByVisibleText(selectcountylocation);
		Log("County Location: " + selectcountylocation + " Selected");
	}
	
	public void TypeCLDate(String typecldate)	{
		WebElement date = driver.findElement(By.id("txtAppDate"));
		date.clear();
		date.sendKeys(typecldate);
			Log("Date: " + typecldate + " Typed in");
	}
	
	public void ClickContinue()
	{	
		WebElement continuebutton = driver.findElement(By.id("btnContinue"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", continuebutton);
		Log("Clicked the \"Continue\" button on the County Location page");
	}

}
