package Automation.AGM;

import org.apache.log4j.Logger;
import org.testng.annotations.*;

import Automation.AGM.maintenancepages.*;
import Automation.AGM.testBase.TestBase;

public class Link_MultiState_Global extends TestBase 
{
	public static final Logger log = Logger.getLogger(Link_MultiState_Global.class.getName());

	GlobalAgentSetup GAS;
	
	
	@DataProvider(name="AGM_Master")
	public String[][] GetAGMData() {
		String[][] data = GetData("Link_AgentID", "AGM_Master");
		return data;
	}
	
	@BeforeTest
	public void SetUp() {
		SetLog();
		Log("====================================== Starting Link Agents Batch ======================================");
		InitAGM("Chrome");
		
		GAS = new GlobalAgentSetup(driver);
	}

	/**
	 * 
	 * @param casenum
	 * @param agentid
	 */
	@Test(dataProvider="AGM_Master")
	public void Run_Link_Global_Agents(String casenum, String agentid) 
	{
		Log("\n======= Starting Case: " + casenum + " =======");
		
		GetURL("https://policy.americanstrategic.com/Maintenance/GlobalAgentSetup.aspx");
		
		GAS.clickAddAgent();
		GAS.TypeGlobalAgentId("");
		GAS.TypeAgentId(agentid);
		
		Log("======= Case: " + casenum + " successfully executed =======");
	}
	
	@AfterTest
	public void EndBatch() {
		//QuitBrowser();
		Log("\n====================================== End Link Agents Batch ======================================");
	}
}
