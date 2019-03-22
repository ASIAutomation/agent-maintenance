package Automation.FLDOILicensing;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;

import Automation.FLDOILicensing.testbase.FLTestBase;

import Automation.FLDOILicensing.Pages.*;


public class AddFLDOIAppointments extends FLTestBase{

	public static final Logger log = Logger.getLogger(AddFLDOIAppointments.class.getName());

	CountyLocation CL;
	eAppointWorkbench AW;
	FLDOILicenseNumber LN;
	LicenseeDetails LD;
	NewAppointmentCreated AC;
	NewSubmittalCreated SC;
	TYCLofTheAppointment TYCL;
	AppointmentDate AD;
	StateAppointment SA;
	AppointmentErrors AE;

	@DataProvider(name="FLDOILicensingUpdates")
	public String[][] FLDOILicensingAppointment() {
		String[][] data = GetData("Data", "FLDOILicensingUpdates");
		return data;
	}

	@BeforeTest
	public void SetUp() {
		RunBatches();
		SetLog();
		Log("====================================== Starting FLDOILicensingUpdates Batch ======================================");
		InitFLDOI("Chrome");

		//Initialize Drivers
		CL = new CountyLocation(driver);
		AW = new eAppointWorkbench(driver); 
		LN = new FLDOILicenseNumber(driver);
		LD =new LicenseeDetails(driver);
		AC = new NewAppointmentCreated(driver);
		SC = new NewSubmittalCreated(driver);
		TYCL = new TYCLofTheAppointment(driver);
		AD = new AppointmentDate(driver);
		SA = new StateAppointment(driver);
		AE = new AppointmentErrors(driver);

		//First 2 pages of FL DOI Website
		AW.ClickNewAppointments();
		SC.TypeSubmittalName("Batch 1300 - 1309");
		SC.ClickNext();
	}

	@Test(dataProvider="FLDOILicensingUpdates")
	public void AddFLAppointments(String casenum, String typelicensenumber) throws InterruptedException {
		{
			Log("============================== Starting " + casenum + " ==============================");

			LN.TypeLicenseNumber(typelicensenumber);
			Pause(2000);
			LN.ClickContinue();
			Pause(2000);
			if (driver.getPageSource().contains("Licensee Details not found."))
			{
				LD.ClickChooseAnotherLicensee();
				Log("Invalid License Number. Licensee Details not found");
				return;
			}
			LD.ClickContinue();
			Pause(2000);
			TYCL.ReturnAppointmentTypeClass();
			if (TYCL.ReturnAppointmentTypeClass().toUpperCase().contains("2044"))
			{
				TYCL.AppointmentTypeClass("2044");
				Pause(2000);
				AD.ClickContinue();
				Pause(2000);
				AD.ClickContinue();
				Pause(2000);
				if (driver.getPageSource().contains("This licensee already has this appointment."))
				{
					AE.ClickChooseAnotherLicensee();
					Log("Licensee Already has an Appointment. Moved to the next license number");
					return;
				}

			}
			else if (TYCL.ReturnAppointmentTypeClass().toUpperCase().contains("0220"))
			{
				TYCL.AppointmentTypeClass("0220");
				Pause(2000);
				TYCL.ClickContinue();
				Pause(2000);
				CL.ClickContinue();
				Pause(2000);

			}
			else if (TYCL.ReturnAppointmentTypeClass().toUpperCase().contains("0920"))
			{
				TYCL.AppointmentTypeClass("0920");
				TYCL.ClickContinue();
				SA.ClickNoCounties();
				SA.ClickContinue();
			}
			else if (TYCL.ReturnAppointmentTypeClass().toUpperCase().contains("9044"))
			{
				TYCL.AppointmentTypeClass("9044");
				TYCL.ClickContinue();
				SA.ClickNoCounties();
				SA.ClickContinue();
			}
			else 
			{
				Log("No TYCL value can be selected");
			}
			//Log(TYCL.ReturnAppointmentTypeClass());
			AC.ClickAddAnotherAppointment();
		}



		Log("============================== End " + casenum + " ===================================");
	}


	@AfterTest
	public void EndBatch() {
		//QuitBrowser();
		Log("\n====================================== End FLDOILicensingUpdates Batch ======================================");
	}

}


