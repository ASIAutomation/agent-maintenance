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

public class AppointmentErrors extends FLTestBase{

	WebDriver driver;

	public AppointmentErrors(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;	
	}

	public void ClickChooseAnotherLicensee()
	{	
		WebElement chooseanotherlicenseebuttoon = driver.findElement(By.xpath("//*[@id=\"main-area\"]/form/table/tbody/tr/td/table[2]/tbody/tr/td/input[1]"));
		chooseanotherlicenseebuttoon.click();
		Log("Clicked the \"Choose Another Licensee\" button on the Appointment Errors page");
	}

	public void ClickChooseAnotherTypeClass()
	{	
		WebElement chooseanothertypeclassbutton = driver.findElement(By.xpath("//*[@id=\"btnTYCL\"]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", chooseanothertypeclassbutton);
		Log("Clicked the \"Choose Another Type Class\" button on the Appointment Errors page");
	}
}

