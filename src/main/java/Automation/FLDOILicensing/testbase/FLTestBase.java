package Automation.FLDOILicensing.testbase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import org.openqa.selenium.JavascriptExecutor;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import Automation.FLDOILicensing.excelReader.FLExcel_Reader;


public class FLTestBase {
	
	public static final Logger log = Logger.getLogger(FLTestBase.class.getName());

	public static WebDriver driver;
	FLExcel_Reader excel;
	String browser;
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	String url = "https://iportal.fldfs.com/eappoint";

	//Initializes Agent Login
		public void InitFLDOI(String Browser) {
			SelectBrowser(Browser);
			Log(Browser + " object created");
			GetURL(url);
			driver.findElement(By.xpath("//*[@id=\"main-area\"]/table/tbody/tr[1]/td[2]/input")).sendKeys(new String(Base64.decodeBase64("YXBwb2ludG1lbnRzQGFzaWNvcnAub3Jn")));
			Log("Entered username into FLDOI Login");
			driver.findElement(By.xpath("//*[@id=\"main-area\"]/table/tbody/tr[2]/td[2]/input")).sendKeys(new String(Base64.decodeBase64("QVNJMTMyNQ==")));
			Log("Entered password into FLDOI Login");
			driver.findElement(By.xpath("//*[@id=\"Button2\"]")).click();
			Log("Logged into the FLDOI System");
		}
		
		//Navigates to URL
		public void GetURL(String GetURL) {
			Log("Navigating to " + GetURL);
			driver.get(GetURL);
		}

		//Sets log
		public void SetLog() {
			String log4jConfig = "log4j.properties";
			PropertyConfigurator.configure(log4jConfig);		
		}

		//Selects browser
		public void SelectBrowser(String SelectBrowser) {
			if(SelectBrowser.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
				Log("Creating object of " + SelectBrowser);
				ChromeOptions options = new ChromeOptions();
				options.setExperimentalOption("useAutomationExtension", false);
				driver = new ChromeDriver(options);

			}
			else if(SelectBrowser.equalsIgnoreCase("Firefox")) {
				System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir") + "/drivers/geckodriver.exe");
				Log("Creating object of " + SelectBrowser);
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			browser = SelectBrowser;
		}

		//Opens a tab to url in parameter
		public void OpenTabToURL(String OpenTabToURL) {
			executor.executeScript("window.open('" + OpenTabToURL + "')");		
		}

		//Gets excel data from data source
		public String[][] GetData(String SheetName, String ExcelName) {
			String path = System.getProperty("user.dir") + "/src/main/java/Automation/FLDOILicensing/data/" + ExcelName + ".xlsx";
			excel = new FLExcel_Reader(path);
			String[][] data = excel.GetDataFromSheet(SheetName, ExcelName);
			return data;
		}

		//Gets excel data from data source
		public String[][] GetDataFromAnyPath(String path, String SheetName, String ExcelName) {
			excel = new FLExcel_Reader(path);
			String[][] data = excel.GetDataFromSheet(SheetName, ExcelName);
			return data;
		}

		//Gets all window IDs and based on ID we can move to a specific window
		public Iterator<String> GetAllWindows() {
			Set<String> windows = driver.getWindowHandles();
			Iterator<String> itr = windows.iterator();
			return itr;
		}

		//Switches to selected tab
		public void SwitchTab(String SwitchTab) {
			Set<String> allwindows = driver.getWindowHandles();
			ArrayList<String> tabs = new ArrayList<>(allwindows);
			driver.switchTo().window(tabs.get(Integer.parseInt(SwitchTab)));
			switch(SwitchTab) {
			case "0":		Log("Driver has moved to the main tab");
			break;

			default:		Log("Driver has moved to tab " + SwitchTab);
			break;
			}			
		}

		//Quits session
		public void QuitBrowser() {
			driver.quit();
			Log(browser + " has quit");
		}

		//Sets and takes screenshots
		public void GetScreenShot(String GetScreenShot) {
			Calendar calendar = Calendar.getInstance();
			SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
			File scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				String reportDirectory = new File(System.getProperty("user.dir")).getAbsolutePath() + "/src/main/java/Automation/AGM/screenshot/";
				File destfile = new File((String)reportDirectory + GetScreenShot + "_" + formater.format(calendar.getTime()) + ".png");
				FileUtils.copyFile(scrfile, destfile);
				//This will help us to link the screenshots in TestNG report
				Reporter.log("<a href='" + destfile.getAbsolutePath() + "'> <img src='" + destfile.getAbsolutePath() + "' height='100' width='100'/> </a>");
				Log("Screenshot taken of " + GetScreenShot);
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}

		//Logs in console and TestNG
		public void Log(String Log) {
			log.info(Log);
			Reporter.log(Log);
		}

		//Prints parameters passed into System.out 
		public void Print(String Print) {
			System.out.println(Print);
		}

		//Refreshes Page
		public void Refresh() {
			driver.navigate().refresh();
		}

		//Generates Number in given range
		public int RandomNum(int Min, int Max) {
			Random random = new Random();
			int rand = random.nextInt(Max)+Min;
			return rand;
		}
		
		public String GetDateTime() {
		    DateFormat df = new SimpleDateFormat("yyyy-MM-dd_hh-mm-ss");
		    df.setTimeZone(TimeZone.getTimeZone("US/Eastern"));
		    return df.format(new Date());
		}
		
		public String GetDate() {
		    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		    return df.format(new Date());
		}
		
		public String GetTime() {
		    DateFormat df = new SimpleDateFormat("hh-mm-ss");
		    df.setTimeZone(TimeZone.getTimeZone("US/Eastern"));
		    return df.format(new Date());
		}
		
		//Runs any batch we have created
		public void RunBatches() {
			KillChromedriver();
			MakeTestOutputReadOnly();
		}	
		
		//Kills Chromedriver.exe
		public void KillChromedriver() {
			final Runtime rt = Runtime.getRuntime();
			try {
				rt.exec("cmd /C C:\\Dev\\killchromedriver.bat"); 
			}
			catch (final IOException e) {
				throw new RuntimeException("Failed to kill chromedriver.exe instaces");
			}
		}	
		
		//Set TestOutput to Read-only
		public void MakeTestOutputReadOnly() {
			final Runtime rt = Runtime.getRuntime();
			try {
				rt.exec("cmd /C C:\\Dev\\undo_ReadOnly_test-output.bat"); 
			}
			catch (final IOException e) {
				throw new RuntimeException("Failed to set tesOutput to Read-only");
			}
		}

		// delays execution in milliseconds
		@SuppressWarnings("unused")
		public void Pause(int Pause) throws InterruptedException {
			long starttime = System.currentTimeMillis();
			for(int count = 0;;count++) {
				long now = System.currentTimeMillis();
				if(((now-starttime) >= Pause)) break;
			}
		}
	} 

