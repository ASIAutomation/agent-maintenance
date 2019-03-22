package Automation.FLDOILicensing.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import Automation.FLDOILicensing.testbase.FLTestBase;

public class eAppointWorkbench extends FLTestBase {
	
WebDriver driver;
	
	public eAppointWorkbench(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;	
	}
	 
	public void ClickNewAppointments()
	{	
		WebElement newappointmentsbutton = driver.findElement(By.xpath("//*[@id=\"frmData\"]/table/tbody/tr[4]/td/b[1]/a"));
		newappointmentsbutton.click();
		Log("Clicked the \"New Allpointments\" button on the eAppointment Workbench page");

	}
	
	public void ClickTerminateAppointments()
	{	
		WebElement terminateappointmentsbutton = driver.findElement(By.xpath("//*[@id=\"frmData\"]/table/tbody/tr[4]/td/b[2]/a"));
		terminateappointmentsbutton.click();
		Log("Clicked the \"Terminate Appointments\" button on the eAppointment Workbench page");
	}
	
	public void ClickNewExchangeOfBusiness()
	{	
		WebElement newexchangeofbusiness = driver.findElement(By.xpath("//*[@id=\"frmData\"]/table/tbody/tr[4]/td/b[3]/a"));
		newexchangeofbusiness.click();
		Log("Clicked the \"New Exchange of Business\" button on the eAppointment Workbench page");
	}
	
	public void ClickMultipleUploadFunction()
	{	
		WebElement multipleuploadfunction = driver.findElement(By.xpath("//*[@id=\"frmData\"]/table/tbody/tr[4]/td/b[4]/a"));
		multipleuploadfunction.click();
		Log("Clicked the \"Multiple Upload Function\" button on the eAppointment Workbench page");
	}
	
	public void ClickPrintLicenses()
	{	
		WebElement printlicenses = driver.findElement(By.xpath("//*[@id=\"frmData\"]/table/tbody/tr[4]/td/b[5]/a"));
		printlicenses.click();
		Log("Clicked the \"Print Licenses\" button on the eAppointment Workbench page");
	}
	
	public void ClickMaintainThirdPartyAccounts()
	{	
		WebElement maintainthirdpartyaccounts = driver.findElement(By.xpath("//*[@id=\"frmData\"]/table/tbody/tr[6]/td/b/a"));
		maintainthirdpartyaccounts.click();
		Log("Clicked the \"Maintain Third Party Accounts\" button on the eAppointment Workbench page");
	}
	
	public void ClickAddThirdParty()
	{	
		WebElement addthirdparty = driver.findElement(By.xpath("//*[@id=\"frmData\"]/table/tbody/tr[6]/td/b/b/a"));
		addthirdparty.click();
		Log("Clicked the \"Add a Third Party\" button on the eAppointment Workbench page");
	}
	
	public void ClickInProgressTransactions()
	{	
		WebElement inprogresstransactions = driver.findElement(By.xpath("//*[@id=\"main-area\"]/table/tbody/tr/td[1]/table/tbody/tr[4]/td[2]/a"));
		inprogresstransactions.click();
		Log("Clicked the \"In Progress Transactions\" button on the eAppointment Workbench page");
	}

	public void ClickPendingCompletionTransactions()
	{	
		WebElement pendingtransactions = driver.findElement(By.xpath("//*[@id=\"main-area\"]/table/tbody/tr/td[1]/table/tbody/tr[6]/td[2]/a"));
		pendingtransactions.click();
		Log("Clicked the \"Pending Completion Transactions\" button on the eAppointment Workbench page");
	}
	
	public void ClickCompletedTransactions()
	{	
		WebElement completedtransactions = driver.findElement(By.xpath("//*[@id=\"main-area\"]/table/tbody/tr/td[1]/table/tbody/tr[8]/td[2]/a"));
		completedtransactions.click();
		Log("Clicked the \"Completed Transactions\" button on the eAppointment Workbench page");
	}

}