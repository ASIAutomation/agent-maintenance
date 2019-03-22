package Automation.AGM.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Automation.AGM.testBase.TestBase;

public class Confirmation extends TestBase {
	
	public static final Logger log = Logger.getLogger(Confirmation.class.getName());
	
	WebDriver driver;
	
	@FindBy(id="btnFinish")//Button
	WebElement finish;
	
	//Constructor
	public Confirmation(WebDriver driver)	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	//Clicks the "Finish" button
	public void ClickFinish() {
		finish.click();
			Log("Clicked the \"Finish\" button on the Confirmation page");
	}
}
