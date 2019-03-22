package Automation.AGM;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Automation.AGM.pages.*;
import Automation.AGM.testBase.TestBase;

public class Non_Traditional_County_Update extends TestBase
{

	public static final Logger log = Logger.getLogger(Non_Traditional_County_Update.class.getName());
	
	AgentInfo AI;
	
	@DataProvider(name="AGM_Master")
	public String[][] GetAGMData() {
		String[][] data = GetData("Add_Level2_Users", "AGM_Master");
		return data;
	}
	
	@BeforeTest
	public void SetUp() 
	{
		SetLog();
		Log("====================================== Starting Add Level 2 Users Batch ======================================");
		SelectBrowser("Chrome");
	
		AI = new AgentInfo(driver);
	}
	
	@Test
	public void Run_Non_Traditional_Update()
	{
		GetURL("https://policy.americanstrategic.com/Maintenance/Agents/AgentMaintenance.aspx?agentid=453533" /*+ agentid */);
		
		AI.SelectLocationCounty("NON TRADITIONAL");
		AI.ClickConfirmationPage();
		
	}
}
