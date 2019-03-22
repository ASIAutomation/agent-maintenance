package Automation.AGM;

import java.util.NoSuchElementException;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Automation.AGM.pages.Vert_Login;
import Automation.AGM.testBase.TestBase;

public class Vert_SearchTest extends TestBase 
{

	public static final Logger log = Logger.getLogger(Vert_SearchTest.class.getName());
	
	Vert_Login VL;
	
	@BeforeTest
	public void SetUp() {
		SetLog();
		Log("====================================== Starting Vert_TEST Batch ======================================");
		InitAGM("Chrome");
		VL = new Vert_Login(driver);
	}

	@Test()
	public void Run_Vert_SearchTest() 
	{
		Log("\n======= Starting Case: " + "Vert_TEST" + " =======");
		
		GetURL("https://www.sircon.com/ComplianceExpress/index.jsp");
		VL.TypeAccountID("23735");
		VL.TypeUserName("vlazaro");
		VL.TypePassword("Fran191!");
		VL.ClickLogin();
		VL.TypeProducerQuickSearch("ASI HOME INSURANCE CORP");
		VL.ClickSelect();
		
		Log("======= Case: " + "Vert_TEST" + " successfully executed =======");
	}
	
	@AfterTest
	public void EndBatch() {
		//QuitBrowser();
		Log("\n====================================== End Vert_TEST Batch ======================================");
	}
}