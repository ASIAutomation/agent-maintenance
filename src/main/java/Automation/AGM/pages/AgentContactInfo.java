package Automation.AGM.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import Automation.AGM.testBase.TestBase;

public class AgentContactInfo extends TestBase {
	
	public static final Logger log = Logger.getLogger(AgentContactInfo.class.getName());
	
	WebDriver driver;
	
	@FindBy(id="tbContactName")//Text Box
	WebElement contactname;
	
	@FindBy(id="tbContactNickname")//Text Box
	WebElement contactnickname;
	
	@FindBy(id="tbPrincipalName")//Text Box
	WebElement principalname;
	
	@FindBy(id="tbPrincipalNickname")//Text Box
	WebElement principalnickname;
	
	@FindBy(id="chkNoDailyEmail")//Check Box
	WebElement receivenodailyemail;
	
	@FindBy(id="tbEmailAddress")//Text Box
	WebElement genemailaddy;
	
	@FindBy(id="tbPhone1")//Text Box
	WebElement primaryphone;
	
	@FindBy(id="tbPrincipalEmailAddress")//Text Box
	WebElement principalemailaddy;
	
	@FindBy(id="tbPhone2")//Text Box
	WebElement secondaryphone;
	
	@FindBy(id="tbFloodEmailAddress")//Text Box
	WebElement fldemailaddy;
	
	@FindBy(id="tbFax")//Text Box
	WebElement fax;
	
	@FindBy(id="tbSalesLeadEmail")//Text Box
	WebElement salesldemailaddy;
	
	@FindBy(id="tbSalesLeadsPhone")//Text Box
	WebElement phonenumforsaleslead;
	
	@FindBy(id="chkUseGeneralEmail")//Check Box
	WebElement sameasgenemailaddy;
	
	@FindBy(id="tbAgentMemoEmail")//Text Box
	WebElement agentmemoemailaddy;
	
	@FindBy(id="chkUseLocation")//Check Box
	WebElement sameaslocaddy;
	
	@FindBy(id="tbMailAddress1")//Text Box
	WebElement mailaddy1;
	
	@FindBy(id="tbMailAddress2")//Text Box
	WebElement mailaddy2;
	
	@FindBy(id="tbMailCity")//Text Box
	WebElement mailcity;
	
	@FindBy(id="ddMailState")//Drop Down
	WebElement mailstate;
	
	@FindBy(id="tbMailZipcode")//Text Box
	WebElement mailzip;
	
	@FindBy(id="btnNext")//Button
	WebElement next;
	
	@FindBy(xpath="//a[@id='SideBarButton' and text()='Agent Information']")//Button
	WebElement agentinfo;
	
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
	public AgentContactInfo(WebDriver driver)	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	//Types into "Contact Name" text box
	public void TypeContactName(String TypeContactName) {
		contactname.clear();
		contactname.sendKeys(TypeContactName);
			Log("Entered Contact Name: " + TypeContactName);
	}
	
	//Types into "Contact Nickname" text box
	public void TypeContactNickname(String TypeContactNickname) {
		contactnickname.clear();
		contactnickname.sendKeys(TypeContactNickname);
			Log("Entered Contact Nickname: " + TypeContactNickname);
	}
	
	//Types into "Principal Name" text box
	public void TypePrincipalName(String TypePrincipalName) {
		principalname.clear();
		principalname.sendKeys(TypePrincipalName);
			Log("Entered Principal Name: " + TypePrincipalName);
	}
	
	//Types into "Principal Nickname" text box
	public void TypePrincipalNickname(String TypePrincipalNickname) {
		principalnickname.clear();
		principalnickname.sendKeys(TypePrincipalNickname);
			Log("Entered Principal Nickname: " + TypePrincipalNickname);
	}
	
	//Checks the "Receive No Daily Email" check box
	public void CheckReceiveNoDailyEmail(String CheckReceiveNoDailyEmail) {
		switch(CheckReceiveNoDailyEmail.toUpperCase()) {		 	
			case "Y": case "YES":	receivenodailyemail.click();
									Log("\"Receive No Daily Email\" check box marked");
					  				break;
			  		  	
			case "N": case "NO":	Log("\"Receive No Daily Email\" check box NOT marked");
									break;
			  		  	
			default:				System.out.println("Invalid value for CheckReceiveNoDailyEmail()");
									Log("Invalid value for CheckReceiveNoDailyEmail()");
									break;
		}
	}
	
	//Types into "General Email Address" text box
	public void TypeGeneralEmailAddress(String TypeGeneralEmailAddress) {
		genemailaddy.clear();
		genemailaddy.sendKeys(TypeGeneralEmailAddress);
			Log("Entered General Email Address: " + TypeGeneralEmailAddress);
	}
	
	//Types into "Phone (Primary)" text box
	public void TypePrimaryPhone(String TypePrimaryPhone) {
		primaryphone.clear();
		primaryphone.sendKeys(TypePrimaryPhone);
			Log("Entered Phone (Primary): " + TypePrimaryPhone);
	}
	
	//Types into "Principal Email Address" text box
	public void TypePrincipalEmailAddress(String TypePrincipalEmailAddress) {
		principalemailaddy.clear();
		principalemailaddy.sendKeys(TypePrincipalEmailAddress);
			Log("Entered Principal Email Address: " + TypePrincipalEmailAddress);
	}
	
	//Types into "Phone (Secondary)" text box
	public void TypeSecondaryPhone(String TypeSecondaryPhone) {
		secondaryphone.clear();
		secondaryphone.sendKeys(TypeSecondaryPhone);
			Log("Entered Phone (Secondary): " + TypeSecondaryPhone);
	}
	
	//Types into "Flood Email Address" text box
	public void TypeFloodEmailAddress(String TypeFloodEmailAddress) {
		fldemailaddy.clear();
		fldemailaddy.sendKeys(TypeFloodEmailAddress);
			Log("Entered Flood Email Address: " + TypeFloodEmailAddress);
	}
	
	//Types into "Fax #" text box
	public void TypeFax(String TypeFax) {
		fax.clear();
		fax.sendKeys(TypeFax);
			Log("Entered Fax #: " + TypeFax);
	}
	
	//Types into "Sales Lead Email Address" text box
	public void TypeSalesLeadEmailAddress(String TypeSalesLeadEmailAddress) {
		salesldemailaddy.clear();
		salesldemailaddy.sendKeys(TypeSalesLeadEmailAddress);
			Log("Entered Sales Lead Email Address: " + TypeSalesLeadEmailAddress);
	}
	
	//Types into "Phone Number for Sales Leads:" text box
	public void TypePhoneNumberforSalesLeads(String TypePhoneNumberforSalesLeads) {
		phonenumforsaleslead.clear();
		phonenumforsaleslead.sendKeys(TypePhoneNumberforSalesLeads);
			Log("Entered Phone Number for Sales Leads: " + TypePhoneNumberforSalesLeads);
	}
	
	//Checks the "Same as General Email Address?" check box
	public void CheckSameasGeneralEmailAddress(String CheckSameasGeneralEmailAddress) {
		switch(CheckSameasGeneralEmailAddress.toUpperCase()) {		
			case "Y": case "YES":	sameasgenemailaddy.click();
									Log("\"Same as General Email Address?\" check box marked");
									break;						
 
						
			case "N": case "NO": 	Log("\"Same as General Email Address?\" check box NOT marked");
									break;
												
			default:				System.out.println("Invalid value for CheckSameasGeneralEmailAddress()");
									Log("Invalid value for CheckSameasGeneralEmailAddress()");
									break;
		}		
	}
	
	//Types into "Agent Memo Email Address" text box
	public void TypeAgentMemoEmailAddress(String TypeAgentMemoEmailAddress) {
		agentmemoemailaddy.clear();
		agentmemoemailaddy.sendKeys(TypeAgentMemoEmailAddress);
			Log("Entered Agent Memo Email Address: " + TypeAgentMemoEmailAddress);
	}
	
	//Checks the "Same as Location Address?" check box
	public void CheckSameasLocationAddress(String CheckSameasLocationAddress) {
		switch(CheckSameasLocationAddress.toUpperCase()) {		
			case "Y": case "YES":	sameaslocaddy.click();
									Log("\"Same as Location Address?\" check box marked");
									break;						
						
			case "N": case "NO":	Log("\"Same as Location Address?\" check box NOT marked");
									break; 	
						
			default:				System.out.println("Invalid value for CheckSameasLocationAddress()");
									Log("Invalid value for CheckSameasLocationAddress()");
									break;
		}		
	}
	
	//Types into "Mailing Address 1" text box
	public void TypeMailingAddress1(String TypeMailingAddress1) {
		mailaddy1.clear();
		mailaddy1.sendKeys(TypeMailingAddress1);
			Log("Entered Mailing Address 1: " + TypeMailingAddress1);
	}
	
	//Types into "Mailing Address 2" text box
	public void TypeMailingAddress2(String TypeMailingAddress2) {
		mailaddy2.clear();
		mailaddy2.sendKeys(TypeMailingAddress2);
			Log("Entered Mailing Address 2: " + TypeMailingAddress2);
	}
	
	//Types into "Mailing City" text box
	public void TypeMailingCity(String TypeMailingCity) {
		mailcity.clear();
		mailcity.sendKeys(TypeMailingCity);
			Log("Entered Mailing City: " + TypeMailingCity);
	}
	
	//Selects "Mailing State" from drop down
	public void SelectMailingState(String SelectMailingState) {
		new Select(mailstate).selectByVisibleText(SelectMailingState);
			Log("Entered Mailing State: " + SelectMailingState);
	}
	
	//Types into "Mailing Zip Code" text box
	public void TypeMailingZipCode(String TypeMailingZipCode) {
		mailzip.clear();
		mailzip.sendKeys(TypeMailingZipCode);
			Log("Entered Mailing Zip Code: " + TypeMailingZipCode);
	}
	
	//Clicks the "Next" button
	public void ClickNext() {
		next.click();
			Log("Clicked the \"Next\" button on the Agent Contact Information page");
	}
	
	//Clicks the "Agent Information" button
	public void ClickAgentInformationPage() {
		agentinfo.click();
			Log("Clicked the \"Agent Information\" button on the Agent Contact Information page");
	}
	
	//Clicks the "Commission Information" button
	public void ClickCommissionInformationPage() {
		commissioninfo.click();
			Log("Clicked the \"Commission Information\" button on the Agent Contact Information page");
	}
	
	//Clicks the "Plans Offered" button
	public void ClickPlansOfferedPage() {
		plansoffered.click();
			Log("Clicked the \"Plans Offered\" button on the Agent Contact Information page");
	}
	
	//Clicks the "Commission Rates" button
	public void ClickCommissionRatesPage() {
		commissionrates.click();
			Log("Clicked the \"Commission Rates\" button on the Agent Contact Information page");
	}
	
	//Clicks the "Partner Information" button
	public void ClickPartnerInformationPage() {
		partnerinfo.click();
			Log("Clicked the \"Partner Information\" button on the Agent Contact Information page");
	}
	
	//Clicks the "IVANS Information" button
	public void ClickIVANSInformationPage() {
		ivansinfo.click();
			Log("Clicked the \"IVANS Information\" button on the Agent Contact Information page");
	}
	
	//Clicks the "Birthdays" button
	public void ClickBirthdaysPage() {
		birthdays.click();
			Log("Clicked the \"Birthdays\" button on the Agent Contact Information page");
	}
	
	//Clicks the "User Information" button
	public void ClickUserInformationPage() {
		userinfo.click();
			Log("Clicked the \"User Information\" button on the Agent Contact Information page");
	}
	
	//Clicks the "Notes and Messages" button
	public void ClickNotesAndMessagesPage() {
		notesandmessages.click();
			Log("Clicked the \"Notes and Messages\" button on the Agent Contact Information page");
	}
	
	//Clicks the "Confirmation" button
	public void ClickConfirmationPage() {
		confirmation.click();
			Log("Clicked the \"Confirmation\" button on the Agent Contact Information page");
	}
	
	//Clicks the page button that is supplied into the parameter
	public void ClickToNavigateTo(String ClickToNavigateTo) {
		driver.findElement(By.xpath("//a[@id='SideBarButton' and text()='" + ClickToNavigateTo + "']")).click();
			Log("Clicked the \"'" + ClickToNavigateTo + "'\" button on the Agent Contact Information page");
	}	
}
