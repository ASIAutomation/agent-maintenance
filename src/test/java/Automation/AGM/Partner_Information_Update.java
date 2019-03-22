package Automation.AGM;

import org.apache.log4j.Logger;
import org.testng.annotations.*;
import java.text.*;
import java.util.*;
import Automation.AGM.pages.*;
import Automation.AGM.testBase.TestBase;

public class Partner_Information_Update extends TestBase
{
	public static final Logger log = Logger.getLogger(Partner_Information_Update.class.getName());

	AgentSummary AS;
	AgentInfo AI;
	AgentContactInfo AC;
	PartnerInfo PI;
	Birthdays BD;
	Confirmation CF;
	
	@DataProvider(name="AGM_Master")
	public String[][] GetData() {
		String[][] data = GetData("Update_Partner", "AGM_Master");
		return data;
	}
	
	
	@BeforeTest
	public void SetUp() {
		SetLog();
		Log("====================================== Starting Update Partner Information Batch ======================================");
		InitAGM("Chrome");
		
		AS = new AgentSummary(driver);
		AI = new AgentInfo(driver);
		AC = new AgentContactInfo(driver);
		PI = new PartnerInfo(driver);
		BD = new Birthdays(driver);
		CF = new Confirmation(driver);
	}

	/**
	 * 
	 * @param casenum
	 * @param agentid
	 */
	@Test(dataProvider="AGM_Master")
	public void Run_Link_Global_Agents(String casenum, String agentid, String partnerid, String partnername, String partnertype, 
			String action, String plat, String blue) 
	
	{
		Log("\n======= Starting Case: " + casenum + " =======");
		
		GetURL("https://policy.americanstrategic.com/Maintenance/Agents/AgentMaintenance.aspx?agentid=" + agentid);
		
		AI.ClickAgentInformationPage();
		
		if (blue.equals("Y"))
		{
			AI.CheckBlueAgent();
		}
		
		AI.ClickNext();
		AC.ClickPartnerInformationPage();
		
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		String strDate = formatter.format(date);
		
		PI.TypeDateAppointedPGRPHA(strDate);
		PI.TypePartnerID(partnerid);
		PI.SelectPartnerName(partnername);
		
		if (partnertype.equals("1"))
		{
			PI.SelectPartnerType("Child");
		}
		else
		{
			PI.SelectPartnerType("Parent");
		}
		
		if (action.equals("Add"))
		{
			PI.ClickAddPartner();
		}
		
		if (plat.equals("Y"))
		{
			PI.ClickAddPlatinum();
			PI.CheckHasPlatinumQuoting("Y");
		}
		
		PI.ClickNext();
		BD.ClickConfirmationPage();
		//CF.ClickFinish();
		
		Log("======= Case: " + casenum + " successfully executed =======");
	}
	
	@AfterTest
	public void EndBatch() {
		//QuitBrowser();
		Log("\n====================================== End Partner Information Batch ======================================");
	}
}
