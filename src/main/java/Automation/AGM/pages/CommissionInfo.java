package Automation.AGM.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import Automation.AGM.testBase.TestBase;

public class CommissionInfo extends TestBase {
	
	public static final Logger log = Logger.getLogger(CommissionInfo.class.getName());
	
	WebDriver driver;
	
	@FindBy(id="tbCommissionAttentionTo")//Text Box
	WebElement commissionattto;
	
	@FindBy(id="tbCommissionEmail")//Text Box
	WebElement commissionemailaddy;
	
	@FindBy(id="chkACHAgentCheckAuthorization")//Check Box
	WebElement achagentcheckauth;
	
	@FindBy(id="chkCommissionByDirectDeposit")//Check Box
	WebElement reccommissionschecksbydirectdeposit;
	
	@FindBy(id="chkUseMail")//Check Box
	WebElement sameasmailaddy;
	
	@FindBy(id="tbCommissionAddress1")//Text Box
	WebElement commissionsmailaddy1;
	
	@FindBy(id="tbCommissionAddress2")//Text Box
	WebElement commissionsmailaddy2;
	
	@FindBy(id="tbCommissionCity")//Text Box
	WebElement commissionsmailcity;
	
	@FindBy(id="ddCommissionState")//Drop Down
	WebElement commissionsmailstate;
	
	@FindBy(id="tbCommissionZipCode")//Text Box
	WebElement commissionsmailzip;
	
	@FindBy(id="btnNext")//Button
	WebElement next;
	
	@FindBy(xpath="//a[@id='SideBarButton' and text()='Agent Information']")//Button
	WebElement agentinfo;
		
	@FindBy(xpath="//a[@id='SideBarButton' and text()='Agent Contact Information']")//Button
	WebElement agentcontactinfo;

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
	public CommissionInfo(WebDriver driver)	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	//Types into "Commission Attention To" text box
	public void TypeCommissionsAttentionTo(String TypeCommissionsAttentionTo) {
		commissionattto.clear();
		commissionattto.sendKeys(TypeCommissionsAttentionTo);
			Log("Entered Commission Attention To: " + TypeCommissionsAttentionTo);
	}
	
	//Types into "Commission Email Address" text box
	public void TypeCommissionEmailAddress(String TypeCommissionEmailAddress) {
		commissionemailaddy.clear();
		commissionemailaddy.sendKeys(TypeCommissionEmailAddress);
			Log("Entered Commission Email Address: " + TypeCommissionEmailAddress);
	}
	
	//Checks the "ACH Agent Check Authorization" check box
	public void CheckACHAgentCheckAuthorization(String CheckACHAgentCheckAuthorization) {
		switch(CheckACHAgentCheckAuthorization.toUpperCase()) {		
			case "Y": case "YES":	achagentcheckauth.click();
									Log("\"ACH Agent Check Authorization\" check box marked");
									break;
									
			case "N": case "NO":	Log("\"ACH Agent Check Authorization\" check box NOT marked");
									break;
									
			default:				System.out.println("Invalid value for CheckACHAgentCheckAuthorization()");
									Log("Invalid value for CheckACHAgentCheckAuthorization()");
									break;
		}		
	}
	
	//Checks the "Receiving Commission Checks by Direct Deposit" check box
	public void CheckReceivingCommissionChecksbyDirectDeposit(String CheckReceivingCommissionChecksbyDirectDeposit) {
		switch(CheckReceivingCommissionChecksbyDirectDeposit.toUpperCase()) {		
			case "Y": case "YES":	reccommissionschecksbydirectdeposit.click();
									Log("\"Receiving Commission Checks by Direct Deposit\" check box marked");
									break;
									
			case "N": case "NO":	Log("\"Receiving Commission Checks by Direct Deposit\" check box NOT marked");
									break;
									
			default:				System.out.println("Invalid value for CheckReceivingCommissionChecksbyDirectDeposit()");
									Log("Invalid value for CheckReceivingCommissionChecksbyDirectDeposit()");
									break;
		}		
	}
	
	//Checks the "Same as Mailing Address?" check box
	public void CheckSameasMailingAddress(String CheckSameasMailingAddress) {
		switch(CheckSameasMailingAddress.toUpperCase()) {		
			case "Y": case "YES":	sameasmailaddy.click();
									Log("\"Same as Mailing Address?\" check box marked");
									break;
									
			case "N": case "NO":	Log("\"Same as Mailing Address?\" check box NOT marked");
									break;
									
			default:				System.out.println("Invalid value for CheckSameasMailingAddress()");
									Log("Invalid value for CheckSameasMailingAddress()");
									break;
		}		
	}
	
	//Types into "Commission Mail Address 1" text box
	public void TypeCommissionMailAddress1(String TypeCommissionMailAddress1) {
		commissionsmailaddy1.clear();
		commissionsmailaddy1.sendKeys(TypeCommissionMailAddress1);
			Log("Entered Commission Mail Address 1: " + TypeCommissionMailAddress1);
	}
	
	//Types into "Commission Mail Address 2" text box
	public void TypeCommissionMailAddress2(String TypeCommissionMailAddress2) {
		commissionsmailaddy2.clear();
		commissionsmailaddy2.sendKeys(TypeCommissionMailAddress2);
			Log("Entered Commission Mail Address 2: " + TypeCommissionMailAddress2);
	}
	
	//Types into "Commission Mail City" text box
	public void TypeCommissionMailCity(String TypeCommissionMailCity) {
		commissionsmailcity.clear();
		commissionsmailcity.sendKeys(TypeCommissionMailCity);
			Log("Entered Commission Mail City: " + TypeCommissionMailCity);
	}
	
	//Selects "Commission State" from drop down
	public void SelectCommissionState(String SelectCommissionState) {
		new Select(commissionsmailstate).selectByVisibleText(SelectCommissionState);
			Log("Entered Commission State: " + SelectCommissionState);
	}
	
	//Types into "Commission Mail Zip Code" text box
	public void TypeCommissionMailZipCode(String TypeCommissionMailZipCode) {
		commissionsmailzip.clear();
		commissionsmailzip.sendKeys(TypeCommissionMailZipCode);
			Log("Entered Commission Mail Zip Code: " + TypeCommissionMailZipCode);
	}
	
	//Clicks the "Next" button
	public void ClickNext() {
		next.click();
			Log("Clicked the \"Next\" button on the Commission Information page");
	}
	
	//Clicks the "Agent Information" button
	public void ClickAgentInformationPage() {
		agentinfo.click();
			Log("Clicked the \"Agent Information\" button on the Commission Information page");
	}
	
	//Clicks the "Agent Contact Information" button
	public void ClickAgentContactInformationPage() {
		agentcontactinfo.click();
			Log("Clicked the \"Agent Contact Information\" button on the Commission Information page");
	}
	
	//Clicks the "Plans Offered" button
	public void ClickPlansOfferedPage() {
		plansoffered.click();
			Log("Clicked the \"Plans Offered\" button on the Commission Information page");
	}
	
	//Clicks the "Commission Rates" button
	public void ClickCommissionRatesPage() {
		commissionrates.click();
			Log("Clicked the \"Commission Rates\" button on the Commission Information page");
	}
	
	//Clicks the "Partner Information" button
	public void ClickPartnerInformationPage() {
		partnerinfo.click();
			Log("Clicked the \"Partner Information\" button on the Commission Information page");
	}
	
	//Clicks the "IVANS Information" button
	public void ClickIVANSInformationPage() {
		ivansinfo.click();
			Log("Clicked the \"IVANS Information\" button on the Commission Information page");
	}
	
	//Clicks the "Birthdays" button
	public void ClickBirthdaysPage() {
		birthdays.click();
			Log("Clicked the \"Birthdays\" button on the Commission Information page");
	}
	
	//Clicks the "User Information" button
	public void ClickUserInformationPage() {
		userinfo.click();
			Log("Clicked the \"User Information\" button on the Commission Information page");
	}
		
	//Clicks the "Notes and Messages" button
	public void ClickNotesAndMessagesPage() {
		notesandmessages.click();
			Log("Clicked the \"Notes and Messages\" button on the Commission Information page");
	}
		
	//Clicks the "Confirmation" button
	public void ClickConfirmationPage() {
		confirmation.click();
			Log("Clicked the \"Confirmation\" button on the Commission Information page");
	}
	
	//Clicks the page button that is supplied into the parameter
	public void ClickToNavigateTo(String ClickToNavigateTo) {
		driver.findElement(By.xpath("//a[@id='SideBarButton' and text()='" + ClickToNavigateTo + "']")).click();
			Log("Clicked the \"'" + ClickToNavigateTo + "'\" button on the Commission Information page");
	}
}
