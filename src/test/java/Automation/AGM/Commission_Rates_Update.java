package Automation.AGM;

import java.util.NoSuchElementException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import Automation.AGM.pages.AgentInfo;
import Automation.AGM.pages.AgentLookup;
import Automation.AGM.pages.Commission_Rates;
import Automation.AGM.pages.Confirmation;
import Automation.AGM.pages.NotesAndMessages;
import Automation.AGM.testBase.TestBase;

public class Commission_Rates_Update extends TestBase 
{
	public static final Logger log = Logger.getLogger(Commission_Rates_Update.class.getName());
	
	AgentInfo AI;
	AgentLookup AL;
	Commission_Rates CR;
	Confirmation C;
	NotesAndMessages this_isnt_NAM_there_are_rules;
	
	@BeforeTest
	public void SetUp() 
	{
		SetLog();
		Log("====================================== Starting Commission rates Test ======================================");
		InitAGM("Chrome");
	
		AI = new AgentInfo(driver);
		AL = new AgentLookup(driver);
		CR = new Commission_Rates(driver);
		C = new Confirmation(driver);
		this_isnt_NAM_there_are_rules = new NotesAndMessages(driver);
		
	}
	
	@Test
	public void Run_cr()
	{

		//AL.LookupAgentToAgentInfo("454051");
		GetURL("https://policy.americanstrategic.com/Maintenance/Agents/AgentMaintenance.aspx?agentid=" + "454051");
		AI.ClickCommissionRatesPage();
		String currurl = driver.getCurrentUrl();
		System.out.println("Current Url: " + currurl);
		
		while (currurl.contains("454051")) 
		{
			System.out.println("IT WORKED");
		}
		//        agent, comp, plan,      date,     std, xwind, rstd,  rx,   wr,   li,  nbh,  rnh,  nbeq, rneq
		CR.Update("foo", "29", "HO3", "09/12/2017", "8",  "9",  "10", "11", "12", "13", "14", "15", "16", "17");
		
	}
	
	@AfterTest
	public void EndBatch() {
		//QuitBrowser();
		Log("====================================== End Contact Assist Batch ======================================");
	}
}
