package Automation.AGM;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Automation.AGM.maintenancepages.*;
import Automation.AGM.testBase.TestBase;

public class Delete_Banc_Users extends TestBase 
{

	public static final Logger log = Logger.getLogger(Delete_Banc_Users.class.getName());
	
	Maintenance MA;
	LoginMaintenance LM;
	
	@DataProvider(name="AGM_Master")
	public String[][] GetAGMData() {
		String[][] data = GetData("Delete_Banc_Users", "AGM_Master");
		return data;
	}
	
	@BeforeTest
	public void SetUp() {
		SetLog();
		Log("====================================== Starting Delete Banc Users Batch ======================================");
		InitAGM("Chrome");
		
		MA = new Maintenance(driver);
		LM = new LoginMaintenance(driver);
	}

	@Test(dataProvider="AGM_Master")
	public void Run_Delete_Banc_Users(String casenum, String userid) throws InterruptedException 
	{
		Log("\n======= Starting Case: " + casenum + " =======");
		
		GetURL("https://policy.americanstrategic.com/Maintenance/LoginMnt.aspx");
		
		LM.TypeCurrentUser(userid);
		LM.ClickLookup();
		Pause(2000);
		LM.ClickDelete();
		Pause(2000);
		
		Log("======= Case: " + casenum + " successfully executed =======");
	}
	
	@AfterTest
	public void EndBatch() {
		//QuitBrowser();
		Log("\n====================================== End Delete Banc Users Batch ======================================");
	}
}
