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

public class StateAppointment extends FLTestBase{

	WebDriver driver;

	@FindBy(xpath="//input[@type='radio' and @value='2']")//Radio Button No
	WebElement countystatetype;

	@FindBy(id="txtApptDate")//Text Box
	WebElement apptdate;

	@FindBy(id="btnContinue")//Button
	WebElement continuebutton;


	public StateAppointment(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;	
	}



	public void ClickNoCounties()
	{	
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", countystatetype);
		Log("Clicked the \"No\" radio button to deny choosing counties on the State Appointment page");
	}

	public void TypeAppointmentDate(String typeappointmentdate)
	{
		apptdate.clear();
		apptdate.sendKeys(typeappointmentdate);
		Log("Entered Appointment Date: " + typeappointmentdate +"on State Appointments Page");
	}

	public void ClickContinue()
	{	
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", continuebutton);
		Log("Clicked the \"Continue\" button on the State Appointments page");
	}
}
