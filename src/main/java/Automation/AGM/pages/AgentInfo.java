package Automation.AGM.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import Automation.AGM.testBase.TestBase;

public class AgentInfo extends TestBase {
	
	public static final Logger log = Logger.getLogger(AgentInfo.class.getName());
	
	WebDriver driver;
	
	@FindBy(id="tbAgentID")//Text Box
	WebElement agentid;
	
	@FindBy(id="ddStatus")//Drop Down
	WebElement status;
	
	@FindBy(id="tbAgentName")//Text Box
	WebElement agentname;
	
	@FindBy(id="tbCommonName")//Text Box
	WebElement dbaname;
	
	@FindBy(id="tbLicensedAgentName")//Text Box
	WebElement licensedagentname;
	
	@FindBy(id="lbLanguagesSpoken")//List Box
	WebElement agentconvlang;
	
	@FindBy(id="tbOfficeHours")//Text Box
	WebElement officehours;
	
	@FindBy(id="tbWebsite")//Text Box
	WebElement website;
	
	@FindBy(id="tbLocAddress1")//Text Box
	WebElement locaddy1;
	
	@FindBy(id="tbLocAddress2")//Text Box
	WebElement locaddy2;
	
	@FindBy(id="tbLocCity")//Text Box
	WebElement loccity;
	
	@FindBy(id="ddLocState")//Drop Down
	WebElement locstate;
	
	@FindBy(id="tbLocZipCode")//Text Box
	WebElement loczip;
	
	@FindBy(id="ddlocCounty")//Drop Down
	WebElement loccounty;
	
	@FindBy(id="chkServicedByASI")//Check Box
	WebElement servicedbyasi;
	
	@FindBy(id="ddNationalRep")//Drop Down
	WebElement nationalaccountrep;
	
	@FindBy(id="ddDriveRep")//Drop Down
	WebElement driverep;
	
	@FindBy(id="ddCorpRep")//Drop Down
	WebElement corpservicerep;
	
	@FindBy(id="chkBlueAgent")
	WebElement blueagent;
	
	@FindBy(id="ddPrimaryCompany")//Drop Down
	WebElement primarycomp;
	
	@FindBy(id="ddAgentType")//Drop Down
	WebElement agenttype;
	
	@FindBy(id="ddAccountType")//Drop Down
	WebElement accounttype;
	
	@FindBy(id="lbCoveringState")//Drop Down
	WebElement coveringstate;
	
	@FindBy(id="ddMarketingRep")//Drop Down
	WebElement marketingrep;
	
	@FindBy(id="ddProgramType")//Drop Down
	WebElement programtype;
	
	@FindBy(id="ddBusinessType")//Drop Down
	WebElement businesstype;
	
	@FindBy(id="ddTaxIDType")//Drop Down
	WebElement taxidtype;
	
	@FindBy(id="tbTaxID")//Text Box
	WebElement taxidssn;
	
	@FindBy(id="tbChangeEffectiveDate")//Text Box
	WebElement trackdate;
	
	@FindBy(id="ddCaptiveAgency")//Drop Down
	WebElement captiveagency;
	
	@FindBy(id="tbPLAgentGrade")//Text Box
	WebElement plagentgrade;
	
	@FindBy(id="tbDateRegWithDOI")//Text Box
	WebElement dateregorapptdoi;
	
	@FindBy(id="tbDateTermedDOI")//Text Box
	WebElement datetermeddoi;
	
	@FindBy(id="tbFirstContractDate")//Text Box
	WebElement firstcontractdate;
	
	@FindBy(id="tbLastReviewDate")//Text Box
	WebElement effterminationdate;	
	
	@FindBy(id="tbLicenseNumber")//Text Box
	WebElement licensenum;
	
	@FindBy(id="tbLicenseType")//Text Box
	WebElement licensetype;	
	
	@FindBy(id="tbLicenseExpireDate")//Text Box
	WebElement licenseexpdate;
	
	@FindBy(id="rblDTCAgent_0")//Radio Button
	WebElement agentdtcy;	
	
	@FindBy(id="rblDTCAgent_1")//Radio Button
	WebElement agentdtcn;
	
	@FindBy(id="rblReportsToIVANS_0")//Radio Button
	WebElement agentreportivansy;
	
	@FindBy(id="rblReportsToIVANS_1")//Radio Button
	WebElement agentreportivansn;
	
	@FindBy(id="chkApptForFlood")//Check Box
	WebElement apptforfld;
	
	@FindBy(id="tbFloodAgentID")//Text Box
	WebElement fldagentid;
	
	@FindBy(id="tbFloodPinID")//Text Box
	WebElement fldpinid;
	
	@FindBy(id="tbFloodEffectiveDate")//Text Box
	WebElement fldeffdate;
	
	@FindBy(id="tbEOLimit")//Text Box
	WebElement eolimit;
	
	@FindBy(id="tbEOExpireDate")//Text Box
	WebElement eoexpiredate;

	@FindBy(id="tbEOCarrierName")//Text Box
	WebElement eocarriername;
	
	@FindBy(id="btnNext")//Button
	WebElement next;
	
	@FindBy(id="btnCopyAgent")
	WebElement copyagent;
	
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
	public AgentInfo(WebDriver driver)	{
		PageFactory.initElements(driver, this);
		this.driver=driver; 
	}
	
	//Returns the AgentID value
	public String GetAgentID() {
			Log("AgentID value: " + agentid.getAttribute("value"));
		return agentid.getAttribute("value");
	}
	
	public void ClickCopyAgent()
	{
		copyagent.click();
	}
	
	//Selects "Status" from drop down
	public void SelectStatus(String SelectStatus) {
		new Select(status).selectByVisibleText(SelectStatus);
			Log("Entered Status: " + SelectStatus);
	}

	//Types into "Agent Name" text box
	public void TypeAgentName(String TypeAgentName) {
		agentname.clear();
		agentname.sendKeys(TypeAgentName);
			Log("Entered Agent Name: " + TypeAgentName);
	}

	//Types into "Common/DBA Name" text box
	public void TypeCommonDBAName(String TypeCommonDBAName) {
		dbaname.clear();
		dbaname.sendKeys(TypeCommonDBAName);
			Log("Entered Common/DBA Name: " + TypeCommonDBAName);
	}

	//Types into "Licensed Agent Name" text box
	public void TypeLicensedAgentName(String TypeLicensedAgentName) {
		licensedagentname.clear();
		licensedagentname.sendKeys(TypeLicensedAgentName);
			Log("Entered Licensed Agent Name: " + TypeLicensedAgentName);
	}
	
	//Selects "Agent Conversant Language(s)" from list box
	public void SelectAgentConversantLanguage(String Lang1, String Lang2, String Lang3, String Lang4, String Lang5, String Lang6, String Lang7, String Lang8, String Lang9,
	String Lang10, String Lang11, String Lang12, String Lang13, String Lang14, String Lang15, String Lang16, String Lang17, String Lang18, String Lang19, String Lang20,
	String Lang21, String Lang22, String Lang23, String Lang24, String Lang25, String Lang26, String Lang27, String Lang28, String Lang29, String Lang30, String Lang31,
	String Lang32, String Lang33) {
		new Select(agentconvlang).selectByVisibleText(Lang1);
		new Select(agentconvlang).selectByVisibleText(Lang2);
		new Select(agentconvlang).selectByVisibleText(Lang3);
		new Select(agentconvlang).selectByVisibleText(Lang4);
		new Select(agentconvlang).selectByVisibleText(Lang5);
		new Select(agentconvlang).selectByVisibleText(Lang6);
		new Select(agentconvlang).selectByVisibleText(Lang7);
		new Select(agentconvlang).selectByVisibleText(Lang8);
		new Select(agentconvlang).selectByVisibleText(Lang9);
		new Select(agentconvlang).selectByVisibleText(Lang10);
		new Select(agentconvlang).selectByVisibleText(Lang11);
		new Select(agentconvlang).selectByVisibleText(Lang12);
		new Select(agentconvlang).selectByVisibleText(Lang13);
		new Select(agentconvlang).selectByVisibleText(Lang14);
		new Select(agentconvlang).selectByVisibleText(Lang15);
		new Select(agentconvlang).selectByVisibleText(Lang16);
		new Select(agentconvlang).selectByVisibleText(Lang17);
		new Select(agentconvlang).selectByVisibleText(Lang18);
		new Select(agentconvlang).selectByVisibleText(Lang19);
		new Select(agentconvlang).selectByVisibleText(Lang20);
		new Select(agentconvlang).selectByVisibleText(Lang21);
		new Select(agentconvlang).selectByVisibleText(Lang22);
		new Select(agentconvlang).selectByVisibleText(Lang23);
		new Select(agentconvlang).selectByVisibleText(Lang24);
		new Select(agentconvlang).selectByVisibleText(Lang25);
		new Select(agentconvlang).selectByVisibleText(Lang26);
		new Select(agentconvlang).selectByVisibleText(Lang27);
		new Select(agentconvlang).selectByVisibleText(Lang28);
		new Select(agentconvlang).selectByVisibleText(Lang29);
		new Select(agentconvlang).selectByVisibleText(Lang30);
		new Select(agentconvlang).selectByVisibleText(Lang31);
		new Select(agentconvlang).selectByVisibleText(Lang32);
		new Select(agentconvlang).selectByVisibleText(Lang33);
			Log("Entered Agent Conversant Language(s): " + Lang1 + " " + Lang2 + " " + Lang3 + " " + Lang4 + " " + Lang5 + " " + Lang6 + " " + Lang7 + " " + Lang8 + " " 
			+ Lang9 + " " + Lang10 + " " + Lang11 + " " + Lang12 + " " + Lang13 + " " + Lang14 + " " + Lang15 + " " + Lang16 + " " + Lang17 + " " + Lang18 + " " + Lang19 + " "
			+ Lang20 + " " + Lang21 + " " + Lang22 + " " + Lang23 + " " + Lang24 + " " + Lang25 + " " + Lang26 + " " + Lang27 + " " + Lang28 + " " + Lang29 + " " + Lang30 + " " 
			+ Lang31 + " " + Lang32	+ " " + Lang33);
	}

	//Types into "Office Hours" text box
	public void TypeOfficeHours(String TypeOfficeHours) {
		officehours.clear();
		officehours.sendKeys(TypeOfficeHours);
			Log("Entered Office Hours: " + TypeOfficeHours);
	}

	//Types into "Website" text box
	public void TypeWebsite(String TypeWebsite) {
		website.clear();
		website.sendKeys(TypeWebsite);
			Log("Entered Website: " + TypeWebsite);
	}

	//Types into "Location Address 1" text box
	public void TypeLocationAddress1(String TypeLocationAddress1) {
		locaddy1.clear();
		locaddy1.sendKeys(TypeLocationAddress1);
			Log("Entered Location Address 1: " + TypeLocationAddress1);
	}

	//Types into "Location Address 2" text box
	public void TypeLocationAddress2(String TypeLocationAddress2) {
		locaddy2.clear();
		locaddy2.sendKeys(TypeLocationAddress2);
			Log("Entered Location Address 2: " + TypeLocationAddress2);
	}

	//Types into "Location City" text box
	public void TypeLocationCity(String TypeLocationCity) {
		loccity.clear();
		loccity.sendKeys(TypeLocationCity);
			Log("Entered Location City: " + TypeLocationCity);
	}
	
	//Selects "Location State" from drop down
	public void SelectLocationState(String SelectLocationState) {
		new Select(locstate).selectByVisibleText(SelectLocationState);
			Log("Entered Location State: " + SelectLocationState);
	}

	//Types into "Location Zip Code" text box
	public void TypeLocationZipCode(String TypeLocationZipCode) {
		loczip.clear();
		loczip.sendKeys(TypeLocationZipCode);
			Log("Entered Location Zip Code: " + TypeLocationZipCode);
	}
	
	//Selects "Location County" from drop down
	public void SelectLocationCounty(String SelectLocationCounty) {
		new Select(loccounty).selectByVisibleText(SelectLocationCounty);
			Log("Entered Location County: " + SelectLocationCounty);
	}
	
	//Checks the "Serviced By ASI" check box
	public void CheckServicedByASI(String CheckServicedByASI) {
		switch(CheckServicedByASI.toUpperCase()) {		
			case "Y": case "YES": 	servicedbyasi.click();
									Log("\"Serviced By ASI\" check box marked");
									break;
						
			case "N": case "NO": 	Log("\"Serviced By ASI\" check box NOT marked");
									break;
						
			default:				System.out.println("Invalid value for CheckServicedByASI()");
									Log("Invalid value for CheckServicedByASI()");
									break;
		}		
	}
	
	//Selects "National Account Rep" from drop down
	public void SelectNationalAccountRep(String SelectNationalAccountRep) {
		new Select(nationalaccountrep).selectByVisibleText(SelectNationalAccountRep);
			Log("Entered National Account Rep: " + SelectNationalAccountRep);
	}
	
	//Selects "Drive Rep" from drop down
	public void SelectDriveRep(String SelectDriveRep) {
		new Select(driverep).selectByVisibleText(SelectDriveRep);
			Log("Entered Drive Rep: " + SelectDriveRep);
	}
	
	//Selects "Corp Service Rep" from drop down
	public void SelectCorpServiceRep(String SelectCorpServiceRep) {
		new Select(corpservicerep).selectByVisibleText(SelectCorpServiceRep);
			Log("Entered Corp Service Rep: " + SelectCorpServiceRep);
	}
	
	public void CheckBlueAgent()
	{
		blueagent.click();
		Log("Checked Blue Agent Indicator");
	}
	
	
	//Selects "Primary Company" from drop down
	public void SelectPrimaryCompany(String SelectPrimaryCompany) {
		new Select(primarycomp).selectByVisibleText(SelectPrimaryCompany);
			Log("Entered Primary Company: " + SelectPrimaryCompany);
	}
	
	//Selects "Agent Type" from drop down
	public void SelectAgentType(String SelectAgentType) {
		new Select(agenttype).selectByVisibleText(SelectAgentType);
			Log("Entered Agent Type: " + SelectAgentType);
	}
	
	//Selects "Account Type" from drop down
	public void SelectAccountType(String SelectAccountType) {
		new Select(accounttype).selectByVisibleText(SelectAccountType);
			Log("Entered Account Type: " + SelectAccountType);
	}
	
	//Selects "Covering State" from drop down
	public void SelectCoveringState(String SelectCoveringState) {
		new Select(coveringstate).selectByVisibleText(SelectCoveringState);
			Log("Entered Covering State: " + SelectCoveringState);
	}
	
	//Selects "Marketing Rep" from drop down
	public void SelectMarketingRep(String SelectMarketingRep) {
		new Select(marketingrep).selectByVisibleText(SelectMarketingRep);
			Log("Entered Marketing Rep: " + SelectMarketingRep);
	}
	
	//Selects "Program Type" from drop down
	public void SelectProgramType(String SelectProgramType) {
		new Select(programtype).selectByVisibleText(SelectProgramType);
			Log("Entered Program Type: " + SelectProgramType);
	}
	
	//Selects "Business Type" from drop down
	public void SelectBusinessType(String SelectBusinessType) {
		new Select(businesstype).selectByVisibleText(SelectBusinessType);
			Log("Entered Business Type: " + SelectBusinessType);
	}
	
	//Selects "Tax ID Type" from drop down
	public void SelectTaxIDType(String SelectTaxIDType) {
		new Select(taxidtype).selectByVisibleText(SelectTaxIDType);
			Log("Entered Tax ID Type: " + SelectTaxIDType);
	}

	//Types into "Tax ID or SSN" text box
	public void TypeTaxIDSSN(String TypeTaxIDSSN) {
		taxidssn.clear();
		taxidssn.sendKeys(TypeTaxIDSSN);
			Log("Entered Tax ID or SSN: " + TypeTaxIDSSN);
	}
	
	//Types into "Tracking Effective Date" text box
	public void TypeTrackingEffectiveDate(String TypeTrackingEffectiveDate) {
		trackdate.clear();
		trackdate.sendKeys(TypeTrackingEffectiveDate);
			Log("Entered Tracking Effective Date: " + TypeTrackingEffectiveDate);
	}
	
	//Selects "Captive Agency" from drop down
	public void SelectCaptiveAgency(String SelectCaptiveAgency) {
		new Select(captiveagency).selectByVisibleText(SelectCaptiveAgency);
			Log("Entered Captive Agency: " + SelectCaptiveAgency);
	}

	//Types into "PL Agent Grade" text box
	public void TypePLAgentGrade(String TypePLAgentGrade) {
		plagentgrade.clear();
		plagentgrade.sendKeys(TypePLAgentGrade);
			Log("Entered PL Agent Grade: " + TypePLAgentGrade);
	}

	//Types into "Date Reg or Appt w/DOI" text box
	public void TypeDateRegorApptDOI(String TypeDateRegorApptDOI) {
		dateregorapptdoi.clear();
		dateregorapptdoi.sendKeys(TypeDateRegorApptDOI);
			Log("Entered Date Reg or Appt w/DOI: " + TypeDateRegorApptDOI);
	}

	//Types into "Date Termed w/ DOI" text box
	public void TypeDateTermedDOI(String TypeDateTermedDOI) {
		datetermeddoi.clear();
		datetermeddoi.sendKeys(TypeDateTermedDOI);
			Log("Entered Date Termed w/ DOI: " + TypeDateTermedDOI);
	}

	//Types into "First Contract Date" text box
	public void TypeFirstContractDate(String TypeFirstContractDate) {
		firstcontractdate.clear();
		firstcontractdate.sendKeys(TypeFirstContractDate);	
			Log("Entered First Contract Date: " + TypeFirstContractDate);
	}

	//Types into "Effective Termination Date" text box
	public void TypeEffectiveTerminationDate(String TypeEffectiveTerminationDate) {
		effterminationdate.clear();
		effterminationdate.sendKeys(TypeEffectiveTerminationDate);
			Log("Entered Effective Termination Date: " + TypeEffectiveTerminationDate);
	}

	//Types into "License Number" text box
	public void TypeLicenseNumber(String TypeLicenseNumber) {
		licensenum.clear();
		licensenum.sendKeys(TypeLicenseNumber);
			Log("Entered License Number: " + TypeLicenseNumber);
	}

	//Types into "License Type" text box
	public void TypeLicenseType(String TypeLicenseType) {
		licensetype.clear();
		licensetype.sendKeys(TypeLicenseType);
			Log("Entered License Type: " + TypeLicenseType);
	}

	//Types into "License Expire Date" text box
	public void TypeLicenseExpireDate(String TypeLicenseExpireDate) {
		licenseexpdate.clear();
		licenseexpdate.sendKeys(TypeLicenseExpireDate);
			Log("Entered License Expire Date: " + TypeLicenseExpireDate);
	}
	
	//Selects the appropriate "Is Agent DTC?" radio button
	public void CheckIsAgentDTC(String CheckIsAgentDTC) {
		switch(CheckIsAgentDTC.toUpperCase()) {		
			case "Y": case "YES": 	agentdtcy.click();
									Log("\"Is Agent DTC?\" marked as Yes");
									break;
						
			case "N": case "NO": 	agentdtcn.click();
									Log("\"Is Agent DTC?\" marked as No");
									break;
						
			default:				System.out.println("Invalid value for CheckIsAgentDTC()");
									Log("Invalid value for CheckIsAgentDTC()");
									break;	
		}		
	}
	
	//Selects the appropriate "Agent Reports to IVANS?" radio button
	public void CheckAgentReportstoIVANS(String CheckAgentReportstoIVANS) {
		switch(CheckAgentReportstoIVANS.toUpperCase()) {		
			case "Y": case "YES": 	agentreportivansy.click();
									Log("\"Agent Reports to IVANS?\" marked as Yes");
									break;
									
			case "N": case "NO":	agentreportivansn.click();
									Log("\"Agent Reports to IVANS?\" marked as Yes");
									break;
									
			default:				System.out.println("Invalid value for CheckAgentReportstoIVANS()");
									Log("Invalid value for CheckAgentReportstoIVANS()");
									break;
		}		
	}
	
	//Checks the "Appt For Flood" check box
	public void CheckApptForFlood(String CheckApptForFlood) {
		switch(CheckApptForFlood.toUpperCase()) {		
			case "Y": case "YES":	apptforfld.click();
									Log("\"Appt For Flood\" check box marked");
									break;
									
			case "N": case "NO":	Log("\"Appt For Flood\" check box NOT marked");
									break;
									
			default:				System.out.println("Invalid value for CheckApptForFlood()");
									Log("Invalid value for CheckApptForFlood()");
									break;
		}		
	}

	//Types into "Flood Agent ID" text box
	public void TypeFloodAgentID(String TypeFloodAgentID) {
		fldagentid.clear();
		fldagentid.sendKeys(TypeFloodAgentID);
			Log("Entered Flood Agent ID: " + TypeFloodAgentID);
	}

	//Types into "Flood Pin ID" text box
	public void TypeFloodPinID(String TypeFloodPinID) {
		fldpinid.clear();
		fldpinid.sendKeys(TypeFloodPinID);
			Log("Entered Flood Pin ID: " + TypeFloodPinID);
	}

	//Types into "Flood Effective Date" text box
	public void TypeFloodEffectiveDate(String TypeFloodEffectiveDate) {
		fldeffdate.clear();
		fldeffdate.sendKeys(TypeFloodEffectiveDate);
			Log("Entered Flood Effective Date: " + TypeFloodEffectiveDate);
	}

	//Types into "EO Limit" text box
	public void TypeEOLimit(String TypeEOLimit) {
		eolimit.clear();
		eolimit.sendKeys(TypeEOLimit);
			Log("Entered EO Limit: " + TypeEOLimit);
	}

	//Types into "EO Expiration Date" text box
	public void TypeEOExpirationDate(String TypeEOExpirationDate) {
		eoexpiredate.clear();
		eoexpiredate.sendKeys(TypeEOExpirationDate);
			Log("Entered EO Expiration Date: " + TypeEOExpirationDate);
	}

	//Types into "EO Carrier Name" text box
	public void TypeEOCarrierName(String TypeEOCarrierName) {
		eocarriername.clear();
		eocarriername.sendKeys(TypeEOCarrierName);
			Log("Entered EO Carrier Name: " + TypeEOCarrierName);
	}
	
	//Clicks the "Next" button
	public void ClickNext() {
		next.click();
			Log("Clicked the \"Next\" button on the Agent Information page");
	}	
	
	public void ClickAgentInformationPage() {
		agentinfo.click();
			Log("Clicked the \"Agent Information\" button on the Agent Information page");
	}
	
	//Clicks the "Agent Contact Information" button
	public void ClickAgentContactInformationPage() {
		agentcontactinfo.click();
			Log("Clicked the \"Agent Contact Information\" button on the Agent Information page");
	}
		
	//Clicks the "Commission Information" button
	public void ClickCommissionInformationPage() {
		commissioninfo.click();
			Log("Clicked the \"Commission Information\" button on the Agent Information page");
	}
		
	//Clicks the "Plans Offered" button
	public void ClickPlansOfferedPage() {
		plansoffered.click();
			Log("Clicked the \"Plans Offered\" button on the Agent Information page");
	}
	
	//Clicks the "Commission Rates" button
	public void ClickCommissionRatesPage() {
		commissionrates.click();
			Log("Clicked the \"Commission Rates\" button on the Agent Information page");
	}
	
	//Clicks the "Partner Information" button
	public void ClickPartnerInformationPage() {
		partnerinfo.click();
			Log("Clicked the \"Partner Information\" button on the Agent Information page");
	}
	
	//Clicks the "IVANS Information" button
	public void ClickIVANSInformationPage() {
		ivansinfo.click();
			Log("Clicked the \"IVANS Information\" button on the Agent Information page");
	}
	
	//Clicks the "Birthdays" button
	public void ClickBirthdaysPage() {
		birthdays.click();
			Log("Clicked the \"Birthdays\" button on the Agent Information page");
	}
	
	//Clicks the "User Information" button
	public void ClickUserInformationPage() {
		userinfo.click();
			Log("Clicked the \"User Information\" button on the Agent Information page");
	}
	
	//Clicks the "Notes and Messages" button
	public void ClickNotesAndMessagesPage() {
		notesandmessages.click();
			Log("Clicked the \"Notes and Messages\" button on the Agent Information page");
	}
	
	//Clicks the "Confirmation" button
	public void ClickConfirmationPage() {
		confirmation.click();
			Log("Clicked the \"Confirmation\" button on the Agent Information page");
	}
	
	//Clicks the page button that is supplied into the parameter
	public void ClickToNavigateTo(String ClickToNavigateTo) {
		driver.findElement(By.xpath("//a[@id='SideBarButton' and text()='" + ClickToNavigateTo + "']")).click();
			Log("Clicked the \"'" + ClickToNavigateTo + "'\" button on the Agent Information page");
	}
}
