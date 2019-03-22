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

public class TYCLofTheAppointment extends FLTestBase{

	WebDriver driver;

	public TYCLofTheAppointment(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;	
	}

	/*public void AppointmentTypeClass(String selectappointmenttypeclass)
	{
		WebElement appointmenttype = driver.findElement(By.id("cboTYCL"));
		new Select(appointmenttype).selectByVisibleText(selectappointmenttypeclass);
		Log("Appointment Type / Class: " + selectappointmenttypeclass + " Selected");

	}
	 */
	public String ReturnAppointmentTypeClass() 
	{
		WebElement appointmenttype = driver.findElement(By.id("cboTYCL"));
		return (appointmenttype).getText();
	}

	public void AppointmentTypeClass(String selectappointmenttypeclass) {
		WebElement appointmenttype = driver.findElement(By.xpath("//select[@id=\"cboTYCL\"]"));
		if(!selectappointmenttypeclass.toUpperCase().equals("")) {
			switch(selectappointmenttypeclass.toUpperCase()) {

			case "0220":	driver.findElement(By.xpath("//select[contains(@id,'cboTYCL')]//option[contains(text(),'0220')]")).click();
			break;

			case "2044":	driver.findElement(By.xpath("//select[contains(@id,'cboTYCL')]//option[contains(text(),'2044')]")).click();
			break;

			case "0920":	driver.findElement(By.xpath("//select[contains(@id,'cboTYCL')]//option[contains(text(),'0920')]")).click();
			break;

			case "9044":	driver.findElement(By.xpath("//select[contains(@id,'cboTYCL')]//option[contains(text(),'9044')]")).click();
			break;
			}
			Log(new Select(appointmenttype).getFirstSelectedOption().getText());
			Log("TYCL Dropdown selection was successful");
		}
	}

	public void ClickContinue()
	{	
		WebElement continuebutton = driver.findElement(By.xpath("//*[@id=\"btnContinue\"]"));
		continuebutton.click();
		Log("Clicked the \"Continue\" button on the TYCL of the Appointment page");
	}
}
