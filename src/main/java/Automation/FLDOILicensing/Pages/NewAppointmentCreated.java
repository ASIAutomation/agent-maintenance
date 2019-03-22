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

public class NewAppointmentCreated extends FLTestBase{

WebDriver driver;
	
	public NewAppointmentCreated(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;	
	}
	
	public void ClickReviewSubmission()
	{	
		WebElement reviewsubmissionbutton = driver.findElement(By.id("btnReviewSubmission"));
		reviewsubmissionbutton.click();
		Log("Clicked the \"Review Submission\" button on the New Appointment Created page");
	}
	
	public void ClickReturntoWorkBench()
	{	
		WebElement returntoworkbenchbutton = driver.findElement(By.id("btnReturntoWorkbench"));
		returntoworkbenchbutton.click();
		Log("Clicked the \"Return to WorkBench\" button on the New Appointment Created page");
	}
	
	public void ClickReturntoSubmissions()
	{	
		WebElement returntosubmissionsbutton = driver.findElement(By.id("btnReturntoSubmissions"));
		returntosubmissionsbutton.click();
		Log("Clicked the \"Return to Submissions\" button on the New Appointment Created page");
	}
	
	public void ClickAddAnotherAppointment()
	{	
		WebElement addanotherappointmentbutton = driver.findElement(By.id("btnNewAppt"));
		addanotherappointmentbutton.click();
		Log("Clicked the \"Add Another Appointment\" button on the New Appointment Created page");
	}
	
	public void ClickPayAndSubmit()
	{	
		WebElement payandsubmitbutton = driver.findElement(By.xpath("//*[@id=\"btnPay&Submit\"]"));
		payandsubmitbutton.click();
		Log("Clicked the \"Pay & Submit\" button on the New Appointment Created page");
	}
	
}
