package Automation.AGM;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
//import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Automation.AGM.pages.AgentInfo;
import Automation.AGM.pages.AgentLookup;
import Automation.AGM.pages.Confirmation;
import Automation.AGM.pages.NotesAndMessages;
import Automation.AGM.testBase.TestBase;
import Automation.AGM.excelReader.*;

public class LicenseFieldUpdate extends TestBase {
	
	public static final Logger log = Logger.getLogger(LicenseFieldUpdate.class.getName());
	Excel_Writer exceldata = new Excel_Writer();	
	AgentInfo AI;
	AgentLookup AL;
	Confirmation C;
	NotesAndMessages NAM;
	
	@DataProvider(name="AGM_Master")
	public String[][] GetLicenseFieldUpdateData() {
		String[][] data = GetData("License_Field_Update", "AGM_Master");
		return data;
	}
	
	@BeforeTest
	public void StartBatch() {
		SetLog();
			Log("====================================== Starting LicenseFieldUpdate Batch ======================================");
		InitAGM("Chrome");
		//Initialize Drivers
		AI = new AgentInfo(driver);
		AL = new AgentLookup(driver);
		C = new Confirmation(driver);
		NAM = new NotesAndMessages(driver);
		
	}

	
	@Test(dataProvider="AGM_Master")
	public void RunLicenseFieldUpdate(String casenum, String agentid, String licensenum, String licensetype, String licensedate, String notetext) throws FileNotFoundException, IOException {
		
		casenum = casenum + 1;
			Log("========================= Starting Case " + casenum + " =========================");
		AL.LookupAgentToAgentInfo(agentid);
		AI.TypeLicenseNumber(licensenum);
		AI.TypeLicenseType(licensetype);
		AI.TypeLicenseExpireDate(licensedate);
		AI.ClickNotesAndMessagesPage();
		NAM.TypeNote(notetext);
		NAM.ClickNext();
		C.ClickFinish(); 
		
		//exceldata.writedata(agentid, licensenum, licensetype);
		
			Log("========================= End Case " + casenum + " =========================");			
	}
	
	@AfterTest
	public void EndBatch() throws IOException {
		exceldata.output();
			Log("====================================== End LicenseFieldUpdate Batch ======================================");
	}
}
