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

public class AppointmentDate extends FLTestBase{

WebDriver driver;
	
	public AppointmentDate(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;	
	}
	
	public void ClickReturnToComponentList()
	{	
		WebElement returntocomponentbutton = driver.findElement(By.xpath("//*[@id=\"main-area\"]/form/table/tbody/tr[2]/td/input[1]"));
		returntocomponentbutton.click();
		Log("Clicked the \"Choose Return to Component\" button on the Appointment Date page");
	}
	
	public void ClickContinue()
	{	
		WebElement continuebutton = driver.findElement(By.id("btnContinue"));
		continuebutton.click();
		Log("Clicked the \"Continue\" button on the Appointment Date page");
	}
}
