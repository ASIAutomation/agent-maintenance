package Automation.AGM.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Automation.AGM.testBase.TestBase;

public class Birthdays extends TestBase {
	
	public static final Logger log = Logger.getLogger(Birthdays.class.getName());
	
	WebDriver driver;
	
	@FindBy(id="tbBirthdayName1")//Text Box
	WebElement birthdayname1;
	
	@FindBy(id="tbBirthdayMonthDay1")//Text Box
	WebElement birthdaydate1;
	
	@FindBy(id="tbBirthdayName2")//Text Box
	WebElement birthdayname2;
	
	@FindBy(id="tbBirthdayMonthDay2")//Text Box
	WebElement birthdaydate2;
	
	@FindBy(id="tbBirthdayName3")//Text Box
	WebElement birthdayname3;
	
	@FindBy(id="tbBirthdayMonthDay3")//Text Box
	WebElement birthdaydate3;
	
	@FindBy(id="tbBirthdayName4")//Text Box
	WebElement birthdayname4;
	
	@FindBy(id="tbBirthdayMonthDay4")//Text Box
	WebElement birthdaydate4;
	
	@FindBy(id="tbBirthdayName5")//Text Box
	WebElement birthdayname5;
	
	@FindBy(id="tbBirthdayMonthDay5")//Text Box
	WebElement birthdaydate5;
	
	@FindBy(id="tbBirthdayName6")//Text Box
	WebElement birthdayname6;
	
	@FindBy(id="tbBirthdayMonthDay6")//Text Box
	WebElement birthdaydate6;
	
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

	@FindBy(xpath="//a[@id='SideBarButton' and text()='User Information']")//Button
	WebElement userinfo;

	@FindBy(xpath="//a[@id='SideBarButton' and text()='Notes and Messages']")//Button
	WebElement notesandmessages;

	@FindBy(xpath="//a[@id='SideBarButton' and text()='Confirmation']")//Button
	WebElement confirmation;
	
	//Constructor
	public Birthdays(WebDriver driver)	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	//Types into "Birthday Name 1" text box
	public void TypeBirthdayName1(String TypeBirthdayName1) {
		birthdayname1.clear();
		birthdayname1.sendKeys(TypeBirthdayName1);
			Log("Entered Birthday Name 1: " + TypeBirthdayName1);
	}
	
	//Types into "Birthday (MM/DD) 1" text box
	public void TypeBirthdayDate1(String TypeBirthdayDate1) {
		birthdaydate1.clear();
		birthdaydate1.sendKeys(TypeBirthdayDate1);
			Log("Entered Birthday (MM/DD) 1: " + TypeBirthdayDate1);
	}
	
	//Types into "Birthday Name 2" text box
	public void TypeBirthdayName2(String TypeBirthdayName2) {
		birthdayname2.clear();
		birthdayname2.sendKeys(TypeBirthdayName2);
			Log("Entered Birthday Name 2: " + TypeBirthdayName2);
	}
		
	//Types into "Birthday (MM/DD) 2" text box
	public void TypeBirthdayDate2(String TypeBirthdayDate2) {
		birthdaydate2.clear();
		birthdaydate2.sendKeys(TypeBirthdayDate2);
			Log("Entered Birthday (MM/DD) 2: " + TypeBirthdayDate2);
	}
	
	//Types into "Birthday Name 3" text box
	public void TypeBirthdayName3(String TypeBirthdayName3) {
		birthdayname3.clear();
		birthdayname3.sendKeys(TypeBirthdayName3);
			Log("Entered Birthday Name 3: " + TypeBirthdayName3);
	}
		
	//Types into "Birthday (MM/DD) 3" text box
	public void TypeBirthdayDate3(String TypeBirthdayDate3) {
		birthdaydate3.clear();
		birthdaydate3.sendKeys(TypeBirthdayDate3);
			Log("Entered Birthday (MM/DD) 3: " + TypeBirthdayDate3);
	}
	
	//Types into "Birthday Name 4" text box
	public void TypeBirthdayName4(String TypeBirthdayName4) {
		birthdayname4.clear();
		birthdayname4.sendKeys(TypeBirthdayName4);
			Log("Entered Birthday Name 4: " + TypeBirthdayName4);
	}
		
	//Types into "Birthday (MM/DD) 4" text box
	public void TypeBirthdayDate4(String TypeBirthdayDate4) {
		birthdaydate4.clear();
		birthdaydate4.sendKeys(TypeBirthdayDate4);
			Log("Entered Birthday (MM/DD) 4: " + TypeBirthdayDate4);
	}
	
	//Types into "Birthday Name 5" text box
	public void TypeBirthdayName5(String TypeBirthdayName5) {
		birthdayname5.clear();
		birthdayname5.sendKeys(TypeBirthdayName5);
			Log("Entered Birthday Name 5: " + TypeBirthdayName5);
	}
		
	//Types into "Birthday (MM/DD) 5" text box
	public void TypeBirthdayDate5(String TypeBirthdayDate5) {
		birthdaydate5.clear();
		birthdaydate5.sendKeys(TypeBirthdayDate5);
			Log("Entered Birthday (MM/DD) 5: " + TypeBirthdayDate5);
	}
	
	//Types into "Birthday Name 6" text box
	public void TypeBirthdayName6(String TypeBirthdayName6) {
		birthdayname6.clear();
		birthdayname6.sendKeys(TypeBirthdayName6);
			Log("Entered Birthday Name 6: " + TypeBirthdayName6);
	}
		
	//Types into "Birthday (MM/DD) 6" text box
	public void TypeBirthdayDate6(String TypeBirthdayDate6) {
		birthdaydate6.clear();
		birthdaydate6.sendKeys(TypeBirthdayDate6);
			Log("Entered Birthday (MM/DD) 6: " + TypeBirthdayDate6);
	}
	
	//Clicks the "Next" button
	public void ClickNext() {
		next.click();
			Log("Clicked the \"Next\" button on the Birthdays page");
	}
	
	//Clicks the "Agent Information" button
	public void ClickAgentInformationPage() {
		agentinfo.click();
			Log("Clicked the \"Agent Information\" button on the Birthdays page");
	}
	
	//Clicks the "Agent Contact Information" button
	public void ClickAgentContactInformationPage() {
		agentcontactinfo.click();
			Log("Clicked the \"Agent Contact Information\" button on the Birthdays page");
	}
	
	//Clicks the "Commission Information" button
	public void ClickCommissionInformationPage() {
		commissioninfo.click();
			Log("Clicked the \"Commission Information\" button on the Birthdays page");
	}
	
	//Clicks the "Plans Offered" button
	public void ClickPlansOfferedPage() {
		plansoffered.click();
			Log("Clicked the \"Plans Offered\" button on the Birthdays page");
	}
	
	//Clicks the "Commission Rates" button
	public void ClickCommissionRatesPage() {
		commissionrates.click();
			Log("Clicked the \"Commission Rates\" button on the Birthdays page");
	}
	
	//Clicks the "Partner Information" button
	public void ClickPartnerInformationPage() {
		partnerinfo.click();
			Log("Clicked the \"Partner Information\" button on the Birthdays page");
	}
	
	//Clicks the "IVANS Information" button
	public void ClickIVANSInformationPage() {
		ivansinfo.click();
			Log("Clicked the \"IVANS Information\" button on the Birthdays page");
	}
	
	//Clicks the "User Information" button
	public void ClickUserInformationPage() {
		userinfo.click();
			Log("Clicked the \"User Information\" button on the Birthdays page");
	}
	
	//Clicks the "Notes and Messages" button
	public void ClickNotesAndMessagesPage() {
		notesandmessages.click();
			Log("Clicked the \"Notes and Messages\" button on the Birthdays page");
	}
		
	//Clicks the "Confirmation" button
	public void ClickConfirmationPage() {
		confirmation.click();
			Log("Clicked the \"Confirmation\" button on the Birthdays page");
	}
	
	//Clicks the page button that is supplied into the parameter
	public void ClickToNavigateTo(String ClickToNavigateTo) {
		driver.findElement(By.xpath("//a[@id='SideBarButton' and text()='" + ClickToNavigateTo + "']")).click();
			Log("Clicked the \"'" + ClickToNavigateTo + "'\" button on the Birthdays page");
	}
}
