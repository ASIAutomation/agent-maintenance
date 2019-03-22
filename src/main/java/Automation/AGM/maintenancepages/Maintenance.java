package Automation.AGM.maintenancepages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Automation.AGM.testBase.TestBase;

public class Maintenance extends TestBase {

	WebDriver driver;

	public Maintenance(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;	
	}
	
	public void ClickMaintenance()
	{
		WebElement clickmaint = driver.findElement(By.xpath("//*[@id=\"dgMenuOptions\"]/tbody/tr[8]/td"));
		clickmaint.click();
	}
	
	public void ClickUserMaintenance()
	{
		WebElement clickusermaint = driver.findElement(By.xpath("//*[@id=\"dgMenuMaintenanceOptions\"]/tbody/tr[1]/td"));
		clickusermaint.click();
	}
}
