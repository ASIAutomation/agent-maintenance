package Automation.AGM;

import Automation.AGM.testBase.TestBase;
import java.io.IOException;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import Automation.AGM.pages.*;

public class EOInfo_Update extends TestBase
{
	public static final Logger log = Logger.getLogger(EOInfo_Update.class.getName());

	AgentInfo AI;
	AgentLookup AL;
	NotesAndMessages NAM;
	Confirmation C;

	@DataProvider(name="AGM_Master")
	public String[][] GetData() 
	{
		String[][] data = GetData("EOInfo_Update", "AGM_Master");
		return data;
	}

	@BeforeTest
	public void SetUp() {
		SetLog();
		Log("====================================== Starting EOInfo Update Batch ======================================");
		InitAGM("Chrome");
		//Initialize Drivers

		AI = new AgentInfo(driver);
		AL = new AgentLookup(driver);
		NAM = new NotesAndMessages(driver);
		C = new Confirmation(driver);
	}
	
	@Test(dataProvider="AGM_Master")
	public void Run_DriveRep_Update(String casenum, String agentid, String eolimit, String eoexpiredate, String eocarriername, String note) throws InterruptedException 
	{
		Log("\n======= Starting Case: " + casenum + " =======");

		GetURL("https://policy.americanstrategic.com/Maintenance/Agents/AgentMaintenance.aspx?agentid=" + agentid);

		AL.LookupAgentToAgentInfo(agentid);
		AI.ClickAgentInformationPage();
		AI.TypeEOLimit(eolimit);
		AI.TypeEOExpirationDate(eoexpiredate);
		AI.TypeEOCarrierName(eocarriername);
		Pause(2000);
		AI.ClickNext();
		AI.ClickNotesAndMessagesPage();
		NAM.TypeNote(note);
		Pause(2000);
		NAM.ClickNext();
		C.ClickFinish();
		Log("========================= End Case " + casenum + " =========================");
	}	

	@AfterTest
	public void EndBatch() {
		QuitBrowser();
		Log("\n====================================== End EOInfo Update Batch ======================================");
	}
}
