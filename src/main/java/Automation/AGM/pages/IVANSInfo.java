package Automation.AGM.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import Automation.AGM.testBase.TestBase;

public class IVANSInfo extends TestBase {
	
	public static final Logger log = Logger.getLogger(IVANSInfo.class.getName());

	WebDriver driver;

	@FindBy(id="rblHOIvansRunType_0")//Radio Button
	WebElement hoinitial;

	@FindBy(id="rblHOIvansRunType_1")//Radio Button
	WebElement hodaily;

	@FindBy(id="rblHOIvansRunType_2")//Radio Button
	WebElement hohold;

	@FindBy(id="rblFloodIvansRunType_0")//Radio Button
	WebElement fldinitial;

	@FindBy(id="rblFloodIvansRunType_1")//Radio Button
	WebElement flddaily;

	@FindBy(id="rblFloodIvansRunType_2")//Radio Button
	WebElement fldhold;

	@FindBy(id="rblDailyCommissionsRunType_0")//Radio Button
	WebElement dcinitial;

	@FindBy(id="rblDailyCommissionsRunType_1")//Radio Button
	WebElement dcdaily;

	@FindBy(id="rblDailyCommissionsRunType_2")//Radio Button
	WebElement dchold;

	@FindBy(id="rblDirectBillRunType_0")//Radio Button
	WebElement dirinitial;

	@FindBy(id="rblDirectBillRunType_1")//Radio Button
	WebElement dirdaily;

	@FindBy(id="rblDirectBillRunType_2")//Radio Button
	WebElement dirhold;

	@FindBy(id="tbIVANSAgencyName")//Text Box
	WebElement agencyname;

	@FindBy(id="chkUseAgentContactInfo")//Check Box
	WebElement sameasmailingaddy;

	@FindBy(id="tbIVANSAddress")//Text Box
	WebElement address;

	@FindBy(id="tbIVANSCity")//Text Box
	WebElement city;

	@FindBy(id="ddIVANSState")//Drop Down
	WebElement state;

	@FindBy(id="tbIVANSZip")//Text Box
	WebElement zipcode;

	@FindBy(id="tbIVANSContactPhone")//Text Box
	WebElement contactphone;

	@FindBy(id="tbIVANSContactPhoneExt")//Text Box
	WebElement phoneext;

	@FindBy(id="tbIVANSContactEmail")//Text Box
	WebElement contactemail;

	@FindBy(id="tbAccount")//Text Box
	WebElement accountnum;

	@FindBy(id="tbUserID")//Text Box
	WebElement userid;

	@FindBy(id="tbUserClass")//Text Box
	WebElement userclass;

	@FindBy(id="tbFormalAddress")//Text Box
	WebElement formaladdy;

	@FindBy(id="tbInformalAddress")//Text Box
	WebElement informaladdy;

	@FindBy(id="tbDestinationAddress")//Text Box
	WebElement destinationaddy;

	@FindBy(id="tbContractNumber")//Text Box
	WebElement contractnum;

	@FindBy(id="tbPassword")//Text Box
	WebElement password;

	@FindBy(id="tbOther1")//Text Box
	WebElement other1;

	@FindBy(id="tbOther2")//Text Box
	WebElement other2;

	@FindBy(id="tbOther3")//Text Box
	WebElement other3;

	@FindBy(id="tbOther4")//Text Box
	WebElement other4;

	@FindBy(id="tbOther5")//Text Box
	WebElement other5;	

	@FindBy(id="ddlVendor")//Drop Down
	WebElement vendor;

	@FindBy(id="ddlVendorProduct")//Drop Down
	WebElement vendorproduct;

	@FindBy(id="tbVendorProductVersion")//Drop Down
	WebElement productver;

	@FindBy(id="ddlFormat")//Drop Down
	WebElement format;

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
	
	@FindBy(xpath="//a[@id='SideBarButton' and text()='Birthdays']")//Button
	WebElement birthdays;
	
	@FindBy(xpath="//a[@id='SideBarButton' and text()='User Information']")//Button
	WebElement userinfo;
	
	@FindBy(xpath="//a[@id='SideBarButton' and text()='Notes and Messages']")//Button
	WebElement notesandmessages;
	
	@FindBy(xpath="//a[@id='SideBarButton' and text()='Confirmation']")//Button
	WebElement confirmation;
	
	//Constructor
	public IVANSInfo(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	//Selects the appropriate "Home Owners" radio button 
	public void CheckHomeOwners(String CheckHomeOwners) {
		switch(CheckHomeOwners.toUpperCase()) {		
			case "I":  case "INITIAL":	hoinitial.click();
										Log("\"Home Owners\" marked as Initial");
										break;
										
			case "D": case "DAILY":		hodaily.click();
										Log("\"Home Owners\" marked as Daily");
										break;
										
			case "H": case "HOLD":		hohold.click();
										Log("\"Home Owners\" marked as Hold");
										break;
										
			default:					System.out.println("Invalid value for CheckHomeOwners()");
										Log("Invalid value for CheckHomeOwners()");
										break;
		}		
	}
	
	//Selects the appropriate "Flood" radio button
	public void CheckFlood(String CheckFlood) {
		switch(CheckFlood.toUpperCase()) {		
			case "I": case "INITIAL":	fldinitial.click();
										Log("\"Flood\" marked as Initial");
										break;
										
			case "D": case "DAILY":		flddaily.click();
										Log("\"Flood\" marked as Daily");
										break;
										
			case "H": case "HOLD":		fldhold.click();
										Log("\"Flood\" marked as Hold");
										break;
										
			default:					System.out.println("Invalid value for CheckFlood()");
										Log("Invalid value for CheckFlood()");
										break;
		}		
	}
	
	//Selects the appropriate "Daily Commissions" radio button
	public void CheckDailyCommissions(String CheckDailyCommissions) {
		switch(CheckDailyCommissions.toUpperCase()) {		
			case "I": case "INITIAL":	dcinitial.click();
										Log("\"Daily Commissions\" marked as Initial");
										break;
										
			case "D": case "DAILY":		dcdaily.click();
										Log("\"Daily Commissions\" marked as Daily");
										break;
										
			case "H": case "HOLD":		dchold.click();
										Log("\"Daily Commissions\" marked as Hold");
										break;
										
			default:					System.out.println("Invalid value for CheckDailyCommissions()");
										Log("Invalid value for CheckDailyCommissions()");
										break;
		}		
	}
	
	//Selects the appropriate "Direct Bill" radio button
	public void CheckDirectBill(String CheckDirectBill) {
		switch(CheckDirectBill.toUpperCase()) {		
			case "I": case "INITIAL":	dirinitial.click();
										Log("\"Direct Bill\" marked as Initial");
										break;
										
			case "D": case "DAILY":		dirdaily.click();
										Log("\"Direct Bill\" marked as Daily");
										break;
										
			case "H": case "HOLD":		dirhold.click();
										Log("\"Direct Bill\" marked as Hold");
										break;
										
			default:					System.out.println("Invalid value for CheckDirectBill()");
										Log("Invalid value for CheckDirectBill()");
										break;
		}		
	}
	
	//Types into "Agency Name" text box
	public void TypeAgencyName(String TypeAgencyName) {
		agencyname.clear();
		agencyname.sendKeys(TypeAgencyName);
			Log("Entered Agency Name: " + TypeAgencyName);
		
	}
	
	//Checks the "Same as Mailing Address?" check box
	public void SelectSameAsMailingAddress(String SelectSameAsMailingAddress) {
		switch(SelectSameAsMailingAddress.toUpperCase()) {
			case "Y": case "YES":		sameasmailingaddy.click();
										Log("\"Same as Mailing Address?\" check box marked");
										break;
										
			case "N": case "NO":		Log("\"Same as Mailing Address?\" check box NOT marked");
										break;
										
			default:					System.out.println("Invalid value for SelectSameAsMailingAddress()");
										Log("Invalid value for SelectSameAsMailingAddress()");
										break;
		}
	}
	
	//Types into "Address" text box
	public void TypeAddressName(String TypeAddress) {
		address.clear();
		address.sendKeys(TypeAddress);
			Log("Entered Address: " + TypeAddress);
	}
	
	//Types into "City" text box
	public void TypeCity(String TypeCity) {
		city.clear();
		city.sendKeys(TypeCity);
			Log("Entered City: " + TypeCity);
	}
	
	//Selects "State" from drop down
	public void SelectState(String SelectState) {
		new Select(state).selectByVisibleText(SelectState);
			Log("Entered State: " + SelectState);
	}
	
	//Types into "Zipcode" text box
	public void TypeZipcode(String TypeZipcode) {
		zipcode.clear();
		zipcode.sendKeys(TypeZipcode);
			Log("Entered Zipcode: " + TypeZipcode);
	}
	
	//Types into "Contact Phone" text box
	public void TypeContactPhone(String TypeContactPhone) {
		contactphone.clear();
		contactphone.sendKeys(TypeContactPhone);
			Log("Entered Contact Phone: " + TypeContactPhone);
	}
	
	//Types into "EXT" text box
	public void TypePhoneExtension(String TypePhoneExtension) {
		phoneext.clear();
		phoneext.sendKeys(TypePhoneExtension);
			Log("Entered EXT: " + TypePhoneExtension);
	}
	
	//Types into "Contact Email" text box
	public void TypeContactEmail(String TypeContactEmail) {
		contactemail.clear();
		contactemail.sendKeys(TypeContactEmail);
			Log("Entered Contact Email: " + TypeContactEmail);
	}
	
	//Types into "Account Number" text box
	public void TypeAccountNum(String TypeAccountNum) {
		accountnum.clear();
		accountnum.sendKeys(TypeAccountNum);
			Log("Entered Account Number: " + TypeAccountNum);
	}
	
	//Types into "User ID" text box
	public void TypeUserId(String TypeUserId) {
		userid.clear();
		userid.sendKeys(TypeUserId);
			Log("Entered User ID: " + TypeUserId);
	}
	
	//Types into "User Class" text box
	public void TypeUserClass(String TypeUserClass) {
		userclass.clear();
		userclass.sendKeys(TypeUserClass);
			Log("Entered User Class: " + TypeUserClass);
	}
	
	//Types into "Formal Address" text box
	public void TypeFormalAddress(String TypeFormalAddress) {
		formaladdy.clear();
		formaladdy.sendKeys(TypeFormalAddress);
			Log("Entered Formal Address: " + TypeFormalAddress);
	}
	
	//Types into "Informal Address" text box
	public void TypeInformalAddress(String TypeInformalAddress) {
		informaladdy.clear();
		informaladdy.sendKeys(TypeInformalAddress);
			Log("Entered Informal Address: " + TypeInformalAddress);
	}
	
	//Types into "Destination Address" text box
	public void TypeDestinationAddress(String TypeDestinationAddress) {
		destinationaddy.clear();
		destinationaddy.sendKeys(TypeDestinationAddress);
			Log("Entered Destination Address: " + TypeDestinationAddress);
	}
	
	//Types into "Contract Number" text box
	public void TypeContractNumber(String TypeContractNumber) {
		contractnum.clear();
		contractnum.sendKeys(TypeContractNumber);
			Log("Entered Contract Number: " + TypeContractNumber);
	}
	
	//Types into "Password" text box
	public void TypePassword(String TypePassword) {
		password.clear();
		password.sendKeys(TypePassword);
			Log("Entered Password: " + TypePassword);
	}
	
	//Selects "Vendor" from drop down
	public void SelectVendor(String SelectVendor) {
		new Select(vendor).selectByVisibleText(SelectVendor);
			Log("Entered Vendor: " + SelectVendor);
	}
	
	//Selects "Vendor Product" from drop down
	public void SelectVendorProduct(String SelectVendorProduct) {
		new Select(vendorproduct).selectByVisibleText(SelectVendorProduct);
			Log("Entered Vendor Product: " + SelectVendorProduct);
	}
	
	//Types into "Product Version Type" text box
	public void TypeProductVersion(String TypeProductVersion) {
		productver.clear();
		productver.sendKeys(TypeProductVersion);
			Log("Entered Product Version Type: " + TypeProductVersion);
	}
	
	//Selects "Format" from drop down
	public void SelectFormat(String SelectFormat) {
		new Select(format).selectByVisibleText(SelectFormat);
			Log("Entered Format: " + SelectFormat);
	}
	
	//Types into "Other 1" text box
	public void TypeOther1(String TypeOther1) {
		other1.clear();
		other1.sendKeys(TypeOther1);
			Log("Entered Other 1: " + TypeOther1);
	}
	
	//Types into "Other 2" text box
	public void TypeOther2(String TypeOther2) {
		other2.clear();
		other2.sendKeys(TypeOther2);
			Log("Entered Other 2: " + TypeOther2);
	}
	
	//Types into "Other 3" text box
	public void TypeOther3(String TypeOther3) {
		other3.clear();
		other3.sendKeys(TypeOther3);
			Log("Entered Other 3: " + TypeOther3);
	}
	
	//Types into "Other 4" text box
	public void TypeOther4(String TypeOther4) {
		other4.clear();
		other4.sendKeys(TypeOther4);
			Log("Entered Other 4: " + TypeOther4);
	}
	
	//Types into "Other 5" text box
	public void TypeOther5(String TypeOther5) {
		other5.clear();
		other5.sendKeys(TypeOther5);
			Log("Entered Other 5: " + TypeOther5);
	}
	
	//Clicks the "Next" button
	public void ClickNext() {
		next.click();
			Log("Clicked the \"Next\" button on the IVANS Information page");
	}
	
	//Clicks the "Agent Information" button
	public void ClickAgentInformationPage() {
		agentinfo.click();
			Log("Clicked the \"Agent Information\" button on the IVANS Information page");
	}
	
	//Clicks the "Agent Contact Information" button
	public void ClickAgentContactInformationPage() {
		agentcontactinfo.click();
			Log("Clicked the \"Agent Contact Information\" button on the IVANS Information page");
	}
	
	//Clicks the "Commission Information" button
	public void ClickCommissionInformationPage() {
		commissioninfo.click();
			Log("Clicked the \"Commission Information\" button on the IVANS Information page");
	}
	
	//Clicks the "Plans Offered" button
	public void ClickPlansOfferedPage() {
		plansoffered.click();
			Log("Clicked the \"Plans Offered\" button on the IVANS Information page");
	}
	
	//Clicks the "Commission Rates" button
	public void ClickCommissionRatesPage() {
		commissionrates.click();
			Log("Clicked the \"Commission Rates\" button on the IVANS Information page");
	}
	
	//Clicks the "Partner Information" button
	public void ClickPartnerInformationPage() {
		partnerinfo.click();
			Log("Clicked the \"Partner Information\" button on the IVANS Information page");
	}
	
	//Clicks the "Birthdays" button
	public void ClickBirthdaysPage() {
		birthdays.click();
			Log("Clicked the \"Birthdays\" button on the IVANS Information page");
	}
	
	//Clicks the "User Information" button
	public void ClickUserInformationPage() {
		userinfo.click();
			Log("Clicked the \"User Information\" button on the IVANS Information page");
	}
	
	//Clicks the "Notes and Messages" button
	public void ClickNotesAndMessagesPage() {
		notesandmessages.click();
			Log("Clicked the \"Notes and Messages\" button on the IVANS Information page");
	}
	
	//Clicks the "Confirmation" button
	public void ClickConfirmationPage() {
		confirmation.click();
			Log("Clicked the \"Confirmation\" button on the IVANS Information page");
	}
	
	//Clicks the page button that is supplied into the parameter
	public void ClickToNavigateTo(String ClickToNavigateTo) {
		driver.findElement(By.xpath("//a[@id='SideBarButton' and text()='" + ClickToNavigateTo + "']")).click();
			Log("Clicked the \"'" + ClickToNavigateTo + "'\" button on the IVANS Information page");
	}
}


