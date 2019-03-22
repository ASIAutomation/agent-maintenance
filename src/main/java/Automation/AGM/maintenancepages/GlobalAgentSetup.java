package Automation.AGM.maintenancepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Automation.AGM.testBase.TestBase;

public class GlobalAgentSetup extends TestBase
{
	WebDriver driver;

	public GlobalAgentSetup(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;	
	}
	
	public void clickAddAgent()
	{
		WebElement addagent = driver.findElement(By.id("btnAddNew"));
		addagent.click();
		Log("Clicked 'Add Agent' on Global Agent Setup Page");
	}
	
	public void TypeGlobalAgentId(String typeglobalagentid)
	{
		WebElement globalagentid = driver.findElement(By.id("txtGlobalAgentID"));
		globalagentid.clear();
		globalagentid.sendKeys(typeglobalagentid);
		Log("Typed Global AgentID: " + typeglobalagentid + " into Global AgentID text box");
	}
	
	public void TypeAgentId(String typeagentid)
	{
		WebElement agentid = driver.findElement(By.id("txtAgentID"));
		agentid.clear();
		agentid.sendKeys(typeagentid);
		Log("Typed AgentID: " + typeagentid + " into agentID textbox");
	}
	
	public void clickInsert()
	{
		WebElement insert = driver.findElement(By.id("btnInsert"));
		insert.click();
		Log("Clicked 'Insert' on Global Agent Setup Page");
	}
}
