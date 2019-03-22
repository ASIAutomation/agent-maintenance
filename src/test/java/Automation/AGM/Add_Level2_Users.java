package Automation.AGM;

import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.*;

import Automation.AGM.puspages.*;
import Automation.AGM.testBase.TestBase;

public class Add_Level2_Users extends TestBase {

	public static final Logger log = Logger.getLogger(Add_Level2_Users.class.getName());
	
	PrincipalUserSetup PU;
	
	@DataProvider(name="AGM_Master")
	public String[][] GetAGMData() {
		String[][] data = GetData("Add_Level2_Users", "AGM_Master");
		return data;
	}
	
	@BeforeTest
	public void SetUp() {
		SetLog();
		Log("====================================== Starting Add Level 2 Users Batch ======================================");
		//Select Browser
		SelectBrowser("Chrome"); 
		//Pass the URL; Data should be picked up at this point and the different Principal Users should log in
		GetURL("https://policy.americanstrategic.com/Policy/Menu.aspx");
		PU = new PrincipalUserSetup(driver); 
		
	}
	
	@Test(dataProvider="AGM_Master")
	public void Run_Add_Level2_Users(String casenum, String username, String loginpw, String userid, String fullname,
									 String email, String ssn, String pw, String security, String position, String dob) 
	{
		Log("\n======= Starting Case: " + casenum + " =======");
		
		
		
		driver.findElement(By.id("username")).sendKeys(username);
		Log("Entered "  +username +" into agent Login");
		driver.findElement(By.id("password")).sendKeys(loginpw);
		Log("Entered password into agent Login");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Log("Logged into the agent System");
		
		PU.ClickPus();
		PU.ClickAddNew();
		PU.TypeUserID(userid);
		PU.TypeFullName(fullname);
		PU.TypeEmail(email);
		PU.TypeSSN(ssn);
		PU.TypePassword(pw);
		PU.SelectSecurity(security);
		PU.SelectPosition(position);
		PU.TypeDOB(dob);
		PU.ClickSubmit();
		PU.ClickLogout();
		
		Log("======= Case: " + casenum + " successfully executed =======");
	}
	
}
