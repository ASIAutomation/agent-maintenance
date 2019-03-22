package Automation.AGM.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Automation.AGM.testBase.TestBase;

public class AgentLookup extends TestBase {
	
	public static final Logger log = Logger.getLogger(AgentLookup.class.getName());
	
	WebDriver driver;
	
	@FindBy(xpath="//a[@id='SideBarButton' and text()='Agent Information']")//Button
	WebElement agentinfo;
	
	@FindBy(xpath="//a[@id='SideBarButton' and text()='Agent Summary']")//Button
	WebElement agentsumm;
	
	@FindBy(id="txtSearchID")//Text Box
	WebElement agentid;
	
	@FindBy(id="btnAddNew")//Button
	WebElement addnew;
	
	@FindBy(id="btnLookup")//Button
	WebElement lookup;
	
	//Constructor
	public AgentLookup(WebDriver driver)	{
		PageFactory.initElements(driver, this);
		this.driver=driver; 
	}
	
	//Lookup AgentID - Can land on either Agent Summary or Agent Information
	public void LookupAgent(String LookupAgent) {
		driver.get("https://policy.americanstrategic.com/AgentMaintenance/Lookup.aspx");
			Log("Navigated to Agent Maintenance Lookup (https://policy.americanstrategic.com/AgentMaintenance/Lookup.aspx)");
		agentid.clear();
		agentid.sendKeys(LookupAgent);
			Log("Entered AgentID: " + LookupAgent);
		lookup.click();
			Log("Looked up AgentID: " + LookupAgent);
	}
	
	//Lookup AgentID - Lands on Agent Information page 100%
	public void LookupAgentToAgentInfo(String LookupAgent) {
		driver.get("https://policy.americanstrategic.com/AgentMaintenance/Lookup.aspx");
			Log("Navigated to Agent Maintenance Lookup (https://policy.americanstrategic.com/AgentMaintenance/Lookup.aspx)");
		agentid.clear();
		agentid.sendKeys(LookupAgent);
			Log("Entered AgentID: " + LookupAgent);
		lookup.click();
			Log("Looked up AgentID: " + LookupAgent);
		agentinfo.click();		
	}
	
	//Lookup AgentID - Lands on Agent Summary page 100% - *WILL ONLY WORK IF MULTI-STATE*
	public void LookupAgentToAgentSummary(String LookupAgent) {
		driver.get("https://policy.americanstrategic.com/AgentMaintenance/Lookup.aspx");
			Log("Navigated to Agent Maintenance Lookup (https://policy.americanstrategic.com/AgentMaintenance/Lookup.aspx)");
		agentid.clear();
		agentid.sendKeys(LookupAgent);
			Log("Entered AgentID: " + LookupAgent);
		lookup.click();
			Log("Looked up AgentID: " + LookupAgent);
		agentsumm.click();		
	}

	//Click "Add New" button
	public void ClickAddNew() {
		addnew.click();
			Log("Clicked the \"Add New\" button on the Agent Lookup page");
	}
}
