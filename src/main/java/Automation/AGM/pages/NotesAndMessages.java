package Automation.AGM.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Automation.AGM.testBase.TestBase;

public class NotesAndMessages extends TestBase {
	
	public static final Logger log = Logger.getLogger(NotesAndMessages.class.getName());
	
	WebDriver driver;
	
	@FindBy(id="tbNotes")//Text Box
	WebElement addnotes;
	
	@FindBy(id="tbPrintMessages")//Text Box
	WebElement printmessages;
	
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

	@FindBy(xpath="//a[@id='SideBarButton' and text()='Confirmation']")//Button
	WebElement confirmation;
	
	//Constructor
	public NotesAndMessages(WebDriver driver)	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	//Types into "Add Notes" text box
	public void TypeNote(String TypeNote) {
		addnotes.clear();
		addnotes.sendKeys(TypeNote);
			Log("Entered Add Notes: " + TypeNote);
	}
	
	//Types into "Print Messages" text box
	public void TypePrintMessage(String TypePrintMessage) {
		printmessages.clear();
		printmessages.sendKeys(TypePrintMessage);
			Log("Entered Print Messages: " + TypePrintMessage);
	}
	
	//Clicks the "Next" button
	public void ClickNext() {
		next.click();
			Log("Clicked the \"Next\" button on the Notes and Messages page");
	}
	
	//Clicks the "Agent Information" button
	public void ClickAgentInformationPage() {
		agentinfo.click();
			Log("Clicked the \"Agent Information\" button on the Notes and Messages page");
	}
	
	//Clicks the "Agent Contact Information" button
	public void ClickAgentContactInformationPage() {
		agentcontactinfo.click();
			Log("Clicked the \"Agent Contact Information\" button on the Notes and Messages page");
	}
	
	//Clicks the "Commission Information" button
	public void ClickCommissionInformationPage() {
		commissioninfo.click();
			Log("Clicked the \"Commission Information\" button on the Notes and Messages page");
	}
	
	//Clicks the "Plans Offered" button
	public void ClickPlansOfferedPage() {
		plansoffered.click();
			Log("Clicked the \"Plans Offered\" button on the Notes and Messages page");
	}
	
	//Clicks the "Commission Rates" button
	public void ClickCommissionRatesPage() {
		commissionrates.click();
			Log("Clicked the \"Commission Rates\" button on the Notes and Messages page");
	}
	
	//Clicks the "Partner Information" button
	public void ClickPartnerInformationPage() {
		partnerinfo.click();
			Log("Clicked the \"Partner Information\" button on the Notes and Messages page");
	}
	
	//Clicks the "IVANS Information" button
	public void ClickIVANSInformationPage() {
		ivansinfo.click();
			Log("Clicked the \"IVANS Information\" button on the Notes and Messages page");
	}
	
	//Clicks the "Birthdays" button
	public void ClickBirthdaysPage() {
		birthdays.click();
			Log("Clicked the \"Birthdays\" button on the Notes and Messages page");
	}
	
	//Clicks the "User Information" button
	public void ClickUserInformationPage() {
		userinfo.click();
			Log("Clicked the \"User Information\" button on the Notes and Messages page");
	}
	
	//Clicks the "Confirmation" button
	public void ClickConfirmationPage() {
		confirmation.click();
			Log("Clicked the \"Confirmation\" button on the Notes and Messages page");
	}
	
	//Clicks the page button that is supplied into the parameter
	public void ClickToNavigateTo(String ClickToNavigateTo) {
		driver.findElement(By.xpath("//a[@id='SideBarButton' and text()='" + ClickToNavigateTo + "']")).click();
			Log("Clicked the \"'" + ClickToNavigateTo + "'\" button on the Notes and Messages page");
	}
}