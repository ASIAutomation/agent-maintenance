package Automation.AGM;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Automation.AGM.pages.*;
import Automation.AGM.pages.NotesAndMessages;
import Automation.AGM.testBase.TestBase;

public class Bulk_Agency_Setup extends TestBase
{
	public static final Logger log = Logger.getLogger(Bulk_Agency_Setup.class.getName());


	// Fill Agent Summary Fields
	AgentContactInfo AC;
	AgentInfo AI;
	AgentLookup AL;
	Confirmation C;
	CommissionInfo CI;
	IVANSInfo IV;
	NotesAndMessages NAM;
	PartnerInfo PI;

	@DataProvider(name="AGM_Master")
	public String[][] GetBulkAgencySetupData() {
		String[][] data = GetData("Bulk_Agency_Setup", "AGM_Master");
		return data;
	}

	@BeforeTest
	public void StartBatch() {
		SetLog();
		Log("====================================== Starting LicenseFieldUpdate Batch ======================================");
		InitAGM("Chrome");
		//Initialize Drivers
		AC = new AgentContactInfo(driver);
		AI = new AgentInfo(driver);
		AL = new AgentLookup(driver);
		C = new Confirmation(driver);
		CI = new CommissionInfo(driver);
		IV = new IVANSInfo(driver);
		NAM = new NotesAndMessages(driver);
		PI = new PartnerInfo(driver);
	}

	@Test(dataProvider="AGM_Master")
	public void Run_Bulk_Agency_Setup(String casenum, String agentname, String commonname, String licagentname, String officehours, String locaddr1, String locaddr2, 
			String loccity, String locstate, String loczip, String loccounty, String firstcontractdate, String efftermdate, String licenum, 
			String licetype, String liceexp, String agentdtc, String agentivans, String appflood, String floodagentid, 
			String floodpinid, String floodeffdate, String status, String website, String servbyasi, String nataccountrep, String corpservrep, 
			String primcomp, String agenttype, String accounttype, String covstate, String markrep, String progtype, String bustype, 
			String taxidtype, String ssn, String captiveagency, String plagentgrade, String datereg, String dateterm, String eolimit, String eoexpdate, 
			String eocarriername, String contactname, String contactnickname, String principalname, String principalnickname, String nodailyemail,
			String genemailaddr, String primphone, String princemailaddr, String secphone, String floodemailaddr, String faxnum, String salesleademailaddr, 
			String phonenumsales, String sameasloc, String mailaddr1, String mailaddr2, String mailcity, String mailstate, String mailzip, String comattention,
			String commemail, String achagentcheck, String commcheckdirectdep, String sameasmail, String commmailaddr1, String commmailaddr2, 
			String commmailcity, String commstate, String commailzip, String dateappprogpha, String partnerid, String partnername, String parterntype,
			String agencyname, String add, String city, String state, String zip, String contactphone, String homeowners, String flood, String dailycomm,
			String directbill, String vendor, String venderproduct, String prodversion, String format, String account, String userid, String userclass,
			String formaddr, String informaddr, String destaddr, String contract,  String level2userid)
	{
		Log("\n======= Starting Case: " + casenum + " =======");

		AL.ClickAddNew();
		AI.TypeAgentName(agentname);
		AI.TypeCommonDBAName(commonname);
		AI.TypeLicensedAgentName(licagentname);
		AI.TypeOfficeHours(officehours);
		AI.TypeLocationAddress1(locaddr1);
		AI.TypeLocationAddress2(locaddr2);
		AI.TypeLocationCity(loccity);
		AI.SelectLocationState(locstate);
		AI.TypeLocationZipCode(loczip);
		AI.SelectLocationCounty(loccounty);
		AI.TypeFirstContractDate(firstcontractdate);
		AI.TypeEffectiveTerminationDate(dateterm);
		AI.TypeLicenseNumber(licenum);
		AI.TypeLicenseType(licetype);
		AI.TypeLicenseExpireDate(liceexp);
		AI.CheckIsAgentDTC(agentdtc);
		AI.CheckAgentReportstoIVANS(agentivans);
		AI.CheckApptForFlood(appflood);
		AI.TypeFloodAgentID(floodagentid);
		AI.TypeFloodPinID(floodpinid);
		AI.TypeFloodEffectiveDate(floodeffdate);
		AI.SelectStatus(status);
		AI.TypeWebsite(website);
		AI.CheckServicedByASI(servbyasi);
		AI.SelectNationalAccountRep(nataccountrep);
		AI.SelectCorpServiceRep(corpservrep);
		AI.SelectPrimaryCompany(primcomp);
		AI.SelectAgentType(agenttype);
		AI.SelectAccountType(accounttype);
		AI.SelectCoveringState(covstate);
		AI.SelectMarketingRep(markrep);
		AI.SelectProgramType(progtype);
		AI.SelectBusinessType(bustype);
		AI.SelectTaxIDType(taxidtype);
		AI.TypeTaxIDSSN(ssn);
		AI.SelectCaptiveAgency(captiveagency);
		AI.TypePLAgentGrade(plagentgrade);
		AI.TypeDateRegorApptDOI(datereg);
		AI.TypeDateTermedDOI(dateterm);
		AI.TypeEOLimit(eolimit);
		AI.TypeEOExpirationDate(eoexpdate);
		AI.TypeEOCarrierName(eocarriername);
		AI.ClickNext();
		
		AC.TypeContactName(contactname);
		AC.TypeContactNickname(contactnickname);
		AC.TypePrincipalName(principalname);
		AC.TypePrincipalNickname(principalnickname);
		AC.CheckReceiveNoDailyEmail(nodailyemail);
		AC.TypeGeneralEmailAddress(genemailaddr);
		AC.TypePrimaryPhone(primphone);
		AC.TypePrincipalEmailAddress(princemailaddr);
		AC.TypeSecondaryPhone(secphone);
		AC.TypeFloodEmailAddress(floodemailaddr);
		AC.TypeFax(faxnum);
		AC.TypeSalesLeadEmailAddress(salesleademailaddr);
		AC.TypePhoneNumberforSalesLeads(phonenumsales);
		AC.CheckSameasLocationAddress(sameasloc);
		AC.TypeMailingAddress1(mailaddr1);
		AC.TypeMailingAddress2(mailaddr2);
		AC.TypeMailingCity(mailcity);
		AC.SelectMailingState(mailstate);
		AC.TypeMailingZipCode(mailzip);
		AC.ClickNext();
		
		CI.TypeCommissionsAttentionTo(comattention);
		CI.TypeCommissionEmailAddress(commemail);
		CI.CheckACHAgentCheckAuthorization(achagentcheck);
		CI.CheckReceivingCommissionChecksbyDirectDeposit(commcheckdirectdep);
		CI.CheckSameasMailingAddress(sameasmail);
		CI.TypeCommissionMailAddress1(commmailaddr1);
		CI.TypeCommissionMailAddress2(commmailaddr2);
		CI.TypeCommissionMailCity(commmailcity);
		CI.SelectCommissionState(commstate);
		CI.TypeCommissionMailZipCode(commailzip);
		CI.ClickPartnerInformationPage();
		
		
		PI.TypePartnerID(partnerid);
		PI.SelectPartnerName(partnername);
		PI.SelectPartnerType(parterntype);
		PI.ClickAddPartner();
		PI.ClickNext();

		IV.TypeAgencyName(agencyname);
		IV.TypeAddressName(add);
		IV.TypeCity(city);
		IV.SelectState(state);
		IV.TypeZipcode(zip);
		IV.TypeContactPhone(contactphone);
		IV.CheckHomeOwners(homeowners);
		IV.CheckFlood(flood);
		IV.CheckDailyCommissions(dailycomm);
		IV.CheckDirectBill(directbill);
		IV.SelectVendorProduct(vendor);
		IV.SelectVendorProduct(venderproduct);
		IV.TypeProductVersion(prodversion);
		IV.SelectFormat(format);
		IV.TypeAccountNum(account);
		IV.TypeUserId(userid);
		IV.TypeUserClass(userclass);
		IV.TypeFormalAddress(formaddr);
		IV.TypeInformalAddress(informaddr);
		IV.TypeDestinationAddress(destaddr);
		IV.TypeContractNumber(contract);

		// Level 2 user id

		Log("======= Case: " + casenum + " successfully executed =======");
	}

	@AfterTest
	public void EndBatch() {
		//QuitBrowser();
		Log("\n====================================== End Link Agents Batch ======================================");
	}
}















