package Automation.AGM.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import Automation.AGM.testBase.TestBase;

public class AgentSummary extends TestBase {
	
public static final Logger log = Logger.getLogger(AgentSummary.class.getName());
	
	WebDriver driver;
	
	@FindBy(id="lbNewCoveringStates")//List Box
	WebElement newcoveringstates;
	
	@FindBy(id="btnSubmitNewStates")//Button
	WebElement addstates;
	
	@FindBy(id="btnNext")//Button
	WebElement next;
	
	@FindBy(xpath="//a[@id='SideBarButton' and text()='Agent Information']")//Button
	WebElement agentinfo;
	
	@FindBy(xpath="//a[@id='SideBarButton' and text()='Agent Contact Information']")//Button
	WebElement agentcontactinfo;
	
	@FindBy(xpath="//a[@id='SideBarButton' and text()='Commission Information']")//Button
	WebElement commissioninfo;
	
	@FindBy(xpath="//a[@id='SideBarButton' and text()='Plans Offered']")//Button
	WebElement plansoffered;
	
	@FindBy(xpath="//a[@id='SideBarButton' and text()='Commission Rates']")//Button
	WebElement commissionrates;
	
	@FindBy(xpath="//a[@id='SideBarButton' and text()='Partner Information']")//Button
	WebElement partnerinfo;
	
	@FindBy(xpath="//a[@id='SideBarButton' and text()='IVANS Information']")//Button
	WebElement ivansinfo;
	
	@FindBy(xpath="//a[@id='SideBarButton' and text()='Birthdays']")//Button
	WebElement birthdays;
	
	@FindBy(xpath="//a[@id='SideBarButton' and text()='User Information']")//Button
	WebElement userinfo;
	
	@FindBy(xpath="//a[@id='SideBarButton' and text()='Notes and Messages']")//Button
	WebElement notesandmessages;
	
	@FindBy(xpath="//a[@id='SideBarButton' and text()='Confirmation']")//Button
	WebElement confirmation;
	
	//Constructor
	public AgentSummary(WebDriver driver)	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	//Selects "New Covering State" from list box
	public void SelectNewCoveringState(String ST1, String ST2, String ST3, String ST4, String ST5, String ST6, String ST7, String ST8, String ST9,
	String ST10, String ST11, String ST12, String ST13, String ST14, String ST15, String ST16, String ST17, String ST18, String ST19, String ST20,
	String ST21, String ST22, String ST23, String ST24, String ST25, String ST26, String ST27, String ST28, String ST29, String ST30, String ST31,
	String ST32, String ST33, String ST34, String ST35, String ST36, String ST37, String ST38, String ST39, String ST40, String ST41, String ST42,
	String ST43, String ST44, String ST45, String ST46, String ST47, String ST48, String ST49, String ST50) {
		new Select(newcoveringstates).selectByVisibleText(ST1);
		new Select(newcoveringstates).selectByVisibleText(ST2);
		new Select(newcoveringstates).selectByVisibleText(ST3);
		new Select(newcoveringstates).selectByVisibleText(ST4);
		new Select(newcoveringstates).selectByVisibleText(ST5);
		new Select(newcoveringstates).selectByVisibleText(ST6);
		new Select(newcoveringstates).selectByVisibleText(ST7);
		new Select(newcoveringstates).selectByVisibleText(ST8);
		new Select(newcoveringstates).selectByVisibleText(ST9);
		new Select(newcoveringstates).selectByVisibleText(ST10);
		new Select(newcoveringstates).selectByVisibleText(ST11);
		new Select(newcoveringstates).selectByVisibleText(ST12);
		new Select(newcoveringstates).selectByVisibleText(ST13);
		new Select(newcoveringstates).selectByVisibleText(ST14);
		new Select(newcoveringstates).selectByVisibleText(ST15);
		new Select(newcoveringstates).selectByVisibleText(ST16);
		new Select(newcoveringstates).selectByVisibleText(ST17);
		new Select(newcoveringstates).selectByVisibleText(ST18);
		new Select(newcoveringstates).selectByVisibleText(ST19);
		new Select(newcoveringstates).selectByVisibleText(ST20);
		new Select(newcoveringstates).selectByVisibleText(ST21);
		new Select(newcoveringstates).selectByVisibleText(ST22);
		new Select(newcoveringstates).selectByVisibleText(ST23);
		new Select(newcoveringstates).selectByVisibleText(ST24);
		new Select(newcoveringstates).selectByVisibleText(ST25);
		new Select(newcoveringstates).selectByVisibleText(ST26);
		new Select(newcoveringstates).selectByVisibleText(ST27);
		new Select(newcoveringstates).selectByVisibleText(ST28);
		new Select(newcoveringstates).selectByVisibleText(ST29);
		new Select(newcoveringstates).selectByVisibleText(ST30);
		new Select(newcoveringstates).selectByVisibleText(ST31);
		new Select(newcoveringstates).selectByVisibleText(ST32);
		new Select(newcoveringstates).selectByVisibleText(ST33);
		new Select(newcoveringstates).selectByVisibleText(ST34);
		new Select(newcoveringstates).selectByVisibleText(ST35);
		new Select(newcoveringstates).selectByVisibleText(ST36);
		new Select(newcoveringstates).selectByVisibleText(ST37);
		new Select(newcoveringstates).selectByVisibleText(ST38);
		new Select(newcoveringstates).selectByVisibleText(ST39);
		new Select(newcoveringstates).selectByVisibleText(ST40);
		new Select(newcoveringstates).selectByVisibleText(ST41);
		new Select(newcoveringstates).selectByVisibleText(ST42);
		new Select(newcoveringstates).selectByVisibleText(ST43);
		new Select(newcoveringstates).selectByVisibleText(ST44);
		new Select(newcoveringstates).selectByVisibleText(ST45);
		new Select(newcoveringstates).selectByVisibleText(ST46);
		new Select(newcoveringstates).selectByVisibleText(ST47);
		new Select(newcoveringstates).selectByVisibleText(ST48);
		new Select(newcoveringstates).selectByVisibleText(ST49);
		new Select(newcoveringstates).selectByVisibleText(ST50);
			Log("Entered New Covering State(s): " + ST1 + " " + ST2 + " " + ST3 + " " + ST4 + " " + ST5 + " " + ST6 + " " + ST7 + " " + ST8 + " " 
			+ ST9 + " " + ST10 + " " + ST11 + " " + ST12 + " " + ST13 + " " + ST14 + " " + ST15 + " " + ST16 + " " + ST17 + " " + ST18 + " " + ST19 + " "
			+ ST20 + " " + ST21 + " " + ST22 + " " + ST23 + " " + ST24 + " " + ST25 + " " + ST26 + " " + ST27 + " " + ST28 + " " + ST29 + " " + ST30 + " " 
			+ ST31 + " " + ST32	+ " " + ST33 + " " + ST34 + " " + ST35 + " " + ST36 + " " + ST37 + " " + ST38 + " " + ST39 + " " + ST40 + " " + ST41 + " "
			+ ST42 + " " + ST43 + " " + ST44 + " " + ST45 + " " + ST46 + " " + ST47 + " " + ST48 + " " + ST49 + " " + ST50);
	}
	
	//Clicks the "Add States" button
	public void ClickAddStates() {
		addstates.click();
			Log("Clicked the \"Add States\" button on the Agent Summary page");
	}	
	
	//Clicks the "Next" button
	public void ClickNext() {
		next.click();
			Log("Clicked the \"Next\" button on the Agent Summary page");
	}
	
	//Clicks the "Agent Information" button
	public void ClickAgentInformationPage() {
		agentinfo.click();
			Log("Clicked the \"Agent Information\" button on the Agent Summary page");
	}
	
	//Clicks the "Agent Contact Information" button
	public void ClickAgentContactInformationPage() {
		agentcontactinfo.click();
			Log("Clicked the \"Agent Contact Information\" button on the Agent Summary page");
	}
	
	//Clicks the "Commission Information" button
	public void ClickCommissionInformationPage() {
		commissioninfo.click();
			Log("Clicked the \"Commission Information\" button on the Agent Summary page");
	}
	
	//Clicks the "Plans Offered" button
	public void ClickPlansOfferedPage() {
		plansoffered.click();
			Log("Clicked the \"Plans Offered\" button on the Agent Summary page");
	}
	
	//Clicks the "Commission Rates" button
	public void ClickCommissionRatesPage() {
		commissionrates.click();
			Log("Clicked the \"Commission Rates\" button on the Agent Summary page");
	}
	
	//Clicks the "Partner Information" button
	public void ClickPartnerInformationPage() {
		partnerinfo.click();
			Log("Clicked the \"Partner Information\" button on the Agent Summary page");
	}
	
	//Clicks the "IVANS Information" button
	public void ClickIVANSInformationPage() {
		ivansinfo.click();
			Log("Clicked the \"IVANS Information\" button on the Agent Summary page");
	}
	
	//Clicks the "Birthdays" button
	public void ClickBirthdaysPage() {
		birthdays.click();
			Log("Clicked the \"Birthdays\" button on the Agent Summary page");
	}
	
	//Clicks the "User Information" button
	public void ClickUserInformationPage() {
		userinfo.click();
			Log("Clicked the \"User Information\" button on the Agent Summary page");
	}
	
	//Clicks the "Notes and Messages" button
	public void ClickNotesAndMessagesPage() {
		notesandmessages.click();
			Log("Clicked the \"Notes and Messages\" button on the Agent Summary page");
	}
	
	//Clicks the "Confirmation" button
	public void ClickConfirmationPage() {
		confirmation.click();
			Log("Clicked the \"Confirmation\" button on the Agent Summary page");
	}
	
	//Clicks the page button that is supplied into the parameter
	public void ClickToNavigateTo(String ClickToNavigateTo) {
		driver.findElement(By.xpath("//a[@id='SideBarButton' and text()='" + ClickToNavigateTo + "']")).click();
			Log("Clicked the \"'" + ClickToNavigateTo + "'\" button on the Agent Summary page");
	}
}
