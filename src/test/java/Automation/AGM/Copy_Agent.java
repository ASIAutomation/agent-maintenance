package Automation.AGM;

import Automation.AGM.testBase.TestBase;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import Automation.AGM.pages.*;


public class Copy_Agent extends TestBase
{

	public static final Logger log = Logger.getLogger(Copy_Agent.class.getName());
	
	AgentInfo AI;
	PartnerInfo PI;
	
	@DataProvider(name="AGM_Master")
	public String[][] GetData() {
		String[][] data = GetData("Copy_Agent", "AGM_Master");
		return data;
	}
	
	
	@BeforeTest
	public void SetUp() 
	{
		SetLog();
		Log("====================================== Starting Copy Agent Batch ======================================");
		InitAGM("Chrome");
		
		AI = new AgentInfo(driver);
		PI = new PartnerInfo(driver);
	}

	@Test(dataProvider="AGM_Master")
	public void Copy_Agents(String casenum, String agentid) throws InterruptedException 
	{
		Log("\n======= Starting Case: " + casenum + " =======");
		
		GetURL("https://policy.americanstrategic.com/Maintenance/Agents/AgentMaintenance.aspx?agentid=" + agentid);

		AI.ClickCopyAgent();
		String newagentcode = driver.findElement(By.className("stdLnk")).getText();
		Pause(2500);
		Log("\nCase: " + casenum + " - Agentid: " + agentid + " - New Agent code: " + newagentcode);
		Log("======= Case: " + casenum + " successfully executed =======");
	}
	
	@AfterTest
	public void EndBatch() {
		//QuitBrowser();
		Log("\n====================================== End Copy Agent Batch ======================================");
	}
}
