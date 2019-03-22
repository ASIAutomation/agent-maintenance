package Automation.FLDOILicensing.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import Automation.FLDOILicensing.testbase.FLTestBase;

public class NewSubmittalCreated extends FLTestBase{

WebDriver driver;
	
	//@FindBy(name="txtOptionalFilingName")//Text Box
	//WebElement submittalname;

	public NewSubmittalCreated(WebDriver driver)
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
		
	public void TypeSubmittalName(String name)
	{
		WebElement submittalname = driver.findElement(By.name("txtOptionalFilingName"));
		submittalname.clear();
		submittalname.sendKeys(name);
		Log("Entered SubmittalName: " + "Batch 1300 - 1309"); //Log("Entered SubmittalName: " + name);
	}
	
	public void ClickDone()
	{	
		WebElement donebutton = driver.findElement(By.xpath("//*[@id=\"frmData\"]/table/tbody/tr[5]/td/button[1]"));
		donebutton.click();
		Log("Clicked the \"Done\" button on the New Submittal Created page");
	}
	
	public void ClickNext()
	{	
		WebElement nextbutton = driver.findElement(By.xpath("//*[@id=\"frmData\"]/table/tbody/tr[5]/td/button[2]"));
		nextbutton.click();
		Log("Clicked the \"Next\" button on the New Submittal Created page");
	}
}
