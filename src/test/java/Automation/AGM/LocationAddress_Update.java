package Automation.AGM;

import Automation.AGM.testBase.TestBase;
import java.io.IOException;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import Automation.AGM.pages.*;

public class LocationAddress_Update extends TestBase{
	public static final Logger log = Logger.getLogger(LocationAddress_Update.class.getName());

	AgentInfo AI;
	AgentLookup AL;
	NotesAndMessages NAM;
	Confirmation C;

	@DataProvider(name="AGM_Master")
	public String[][] GetData() 
	{
		String[][] data = GetData("LocationAddress_Update", "AGM_Master");
		return data;
	}

	@BeforeTest
	public void SetUp() {
		SetLog();
		Log("====================================== Starting LocationAddress Update Batch ======================================");
		InitAGM("Chrome");
		//Initialize Drivers

		AI = new AgentInfo(driver);
		AL = new AgentLookup(driver);
		NAM = new NotesAndMessages(driver);
		C = new Confirmation(driver);
	}

	@Test(dataProvider="AGM_Master")
	public void Run_LocationAddress_Update(String casenum, String agentid, String locadd1, String locadd2, String loccity, String locstate, String loczip, String loccounty, String note) throws InterruptedException 
	{
		Log("\n======= Starting Case: " + casenum + " =======");

		GetURL("https://policy.americanstrategic.com/Maintenance/Agents/AgentMaintenance.aspx?agentid=" + agentid);

		AL.LookupAgentToAgentInfo(agentid);
		AI.ClickAgentInformationPage();
		AI.TypeLocationAddress1(locadd1);
		Pause(2000);
		AI.TypeLocationAddress2(locadd2);
		Pause(2000);
		AI.TypeLocationCity(loccity);
		Pause(2000);
		AI.SelectLocationState(locstate);
		Pause(2000);
		AI.TypeLocationZipCode(loczip);
		Pause(2000);
		AI.SelectLocationCounty(loccounty);
		Pause(2000);
		AI.ClickNotesAndMessagesPage();
		NAM.TypeNote(note);
		Pause(2000);
		NAM.ClickNext();
		Pause(2000);
		C.ClickFinish();
		Log("========================= End Case " + casenum + " =========================");
	}	

	@AfterTest
	public void EndBatch() {
		//QuitBrowser();
		Log("\n====================================== End LocationAddress Update Batch ======================================");
	}


}
