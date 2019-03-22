package Automation.AGM.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Automation.AGM.testBase.TestBase;

public class PartnerInfo extends TestBase {
	
	public static final Logger log = Logger.getLogger(PartnerInfo.class.getName());
	
	WebDriver driver;
	
	@FindBy(id="tbProgressivePHA")//Text Box
	WebElement dateapptpgrpha;
	
	@FindBy(id="tbPartnerID")//Text Box
	WebElement partnerid;
	
	@FindBy(id="ddlNewPartnerName")//Drop Down
	WebElement partnername;
	
	@FindBy(id="ddlNewPartnerType")//Drop Down
	WebElement partnertype;
	
	@FindBy(id="btnAddPartner")//Button
	WebElement addpartner;
	
	@FindBy(id="btnAddPlatinum")//Button
	WebElement addplatinum;
	
	@FindBy(xpath="rblHasPlatinumQuoting_0")//Radio Button
	WebElement hasplatinumquotingy;
	
	@FindBy(xpath="rblHasPlatinumQuoting_1")//Radio Button
	WebElement hasplatinumquotingn;
	
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
	public PartnerInfo(WebDriver driver)	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	//Types into "Date Appointed Progressive PHA" text box
	public void TypeDateAppointedPGRPHA(String TypeDateAppointedPGRPHA) {
		dateapptpgrpha.clear();
		dateapptpgrpha.sendKeys(TypeDateAppointedPGRPHA);
			Log("Entered Date Appointed Progressive PHA: " + TypeDateAppointedPGRPHA);
	}
	
	//Types into "Partner ID" text box
	public void TypePartnerID(String TypePartnerID) {
		partnerid.clear();
		partnerid.sendKeys(TypePartnerID);
			Log("Entered Partner ID: " + TypePartnerID);
	}
	
	//Selects "Partner Name" from drop down
	public void SelectPartnerName(String SelectPartnerName) {
		new Select(partnername).selectByVisibleText(SelectPartnerName);
			Log("Entered Partner Name: " + SelectPartnerName);
	}
	
	//Selects "Partner Type" from drop down
	public void SelectPartnerType(String SelectPartnerType) {
		new Select(partnertype).selectByVisibleText(SelectPartnerType);
			Log("Entered Partner Type: " + SelectPartnerType);
	}
	
	//Clicks the "Add Partner" button
	public void ClickAddPartner() {
		addpartner.click();	
			Log("Clicked the \"Add Partner\" button on the Partner Information page");
	}
	
	//Clicks the "Add Platinum" button
	public void ClickAddPlatinum() {
		addplatinum.click();	
			Log("Clicked the \"Add Platinum\" button on the Partner Information page");
	}
	
	//Selects the appropriate "Has Platinum Quoting" radio button
	public void CheckHasPlatinumQuoting(String CheckHasPlatinumQuoting) {
		switch(CheckHasPlatinumQuoting.toUpperCase()) {		
			case "Y": case "YES":		hasplatinumquotingy.click();
										Log("\"Has Platinum Quoting\" marked as Yes");
										break;
											
			case "N": case "NO":		hasplatinumquotingn.click();
										Log("\"Has Platinum Quoting\" marked as No");
										break;
											
			default:					System.out.println("Invalid value for CheckHasPlatinumQuoting()");
										Log("Invalid value for CheckHasPlatinumQuoting()");
										break;
		}		
	}
	
	//Clicks the "Next" button
	public void ClickNext() {
		next.click();
			Log("Clicked the \"Next\" button on the Partner Information page");
	}
	
	//Clicks the "Agent Information" button
	public void ClickAgentInformationPage() {
		agentinfo.click();
			Log("Clicked the \"Agent Information\" button on the Partner Information page");
	}
	
	//Clicks the "Agent Contact Information" button
	public void ClickAgentContactInformationPage() {
		agentcontactinfo.click();
			Log("Clicked the \"Agent Contact Information\" button on the Partner Information page");
	}
	
	//Clicks the "Commission Information" button
	public void ClickCommissionInformationPage() {
		commissioninfo.click();
			Log("Clicked the \"Commission Information\" button on the Partner Information page");
	}
	
	//Clicks the "Plans Offered" button
	public void ClickPlansOfferedPage() {
		plansoffered.click();
			Log("Clicked the \"Plans Offered\" button on the Partner Information page");
	}
	
	//Clicks the "Commission Rates" button
	public void ClickCommissionRatesPage() {
		commissionrates.click();
			Log("Clicked the \"Commission Rates\" button on the Partner Information page");
	}
	
	//Clicks the "IVANS Information" button
	public void ClickIVANSInformationPage() {
		ivansinfo.click();
			Log("Clicked the \"IVANS Information\" button on the Partner Information page");
	}
	
	//Clicks the "Birthdays" button
	public void ClickBirthdaysPage() {
		birthdays.click();
			Log("Clicked the \"Birthdays\" button on the Partner Information page");
	}
	
	//Clicks the "User Information" button
	public void ClickUserInformationPage() {
		userinfo.click();
			Log("Clicked the \"User Information\" button on the Partner Information page");
	}
	
	//Clicks the "Notes and Messages" button
	public void ClickNotesAndMessagesPage() {
		notesandmessages.click();
			Log("Clicked the \"Notes and Messages\" button on the Partner Information page");
	}
	
	//Clicks the "Confirmation" button
	public void ClickConfirmationPage() {
		confirmation.click();
			Log("Clicked the \"Confirmation\" button on the Partner Information page");
	}
	
	//Clicks the page button that is supplied into the parameter
	public void ClickToNavigateTo(String ClickToNavigateTo) {
		driver.findElement(By.xpath("//a[@id='SideBarButton' and text()='" + ClickToNavigateTo + "']")).click();
			Log("Clicked the \"'" + ClickToNavigateTo + "'\" button on the Partner Information page");
	}
}