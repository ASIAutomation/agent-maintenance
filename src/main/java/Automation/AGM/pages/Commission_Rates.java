package Automation.AGM.pages;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Automation.AGM.testBase.TestBase;


public class Commission_Rates extends TestBase 
{
	WebDriver driver;
	
	
	/////////////////////
	/// Company Name ///
	///////////////////
	@FindBy(xpath="//*[@id=\"dgCommissions\"]/tbody/tr[2]/td[1]")
	WebElement company1;
	
	@FindBy(xpath="//*[@id=\"dgCommissions\"]/tbody/tr[3]/td[1]")
	WebElement company2;
	
	@FindBy(xpath="//*[@id=\"dgCommissions\"]/tbody/tr[4]/td[1]")
	WebElement company3;
	
	@FindBy(xpath="//*[@id=\"dgCommissions\"]/tbody/tr[5]/td[1]")
	WebElement company4;
	
	@FindBy(xpath="//*[@id=\"dgCommissions\"]/tbody/tr[6]/td[1]")
	WebElement company5;
	
	@FindBy(xpath="//*[@id=\"dgCommissions\"]/tbody/tr[7]/td[1]")
	WebElement company6;
	
	@FindBy(xpath="//*[@id=\"dgCommissions\"]/tbody/tr[8]/td[1]")
	WebElement company7;
	
	@FindBy(xpath="//*[@id=\"dgCommissions\"]/tbody/tr[9]/td[1]")
	WebElement company8;
	
	@FindBy(xpath="//*[@id=\"dgCommissions\"]/tbody/tr[10]/td[1]")
	WebElement company9;
	
	@FindBy(xpath="//*[@id=\"dgCommissions\"]/tbody/tr[11]/td[1]")
	WebElement company10;
	
	
	@FindBy(xpath="//*[@id=\"dgCommissions\"]/tbody/tr[2]/td[2]")
	WebElement plan1;
	
	@FindBy(xpath="//*[@id=\"dgCommissions\"]/tbody/tr[3]/td[2]")
	WebElement plan2;
	
	@FindBy(xpath="//*[@id=\"dgCommissions\"]/tbody/tr[4]/td[2]")
	WebElement plan3;
	
	@FindBy(xpath="//*[@id=\"dgCommissions\"]/tbody/tr[5]/td[2]")
	WebElement plan4;
	
	@FindBy(xpath="//*[@id=\"dgCommissions\"]/tbody/tr[6]/td[2]")
	WebElement plan5;
	
	@FindBy(xpath="//*[@id=\"dgCommissions\"]/tbody/tr[7]/td[2]")
	WebElement plan6;
	
	@FindBy(xpath="//*[@id=\"dgCommissions\"]/tbody/tr[8]/td[2]")
	WebElement plan7;
	
	@FindBy(xpath="//*[@id=\"dgCommissions\"]/tbody/tr[9]/td[2]")
	WebElement plan8;
	
	@FindBy(xpath="//*[@id=\"dgCommissions\"]/tbody/tr[10]/td[2]")
	WebElement plan9;
	
	@FindBy(xpath="//*[@id=\"dgCommissions\"]/tbody/tr[11]/td[2]")
	WebElement plan10;
	
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl02$txtEffectiveDate")
	WebElement effdate1;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl03$txtEffectiveDate")
	WebElement effdate2;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl04$txtEffectiveDate")
	WebElement effdate3;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl05$txtEffectiveDate")
	WebElement effdate4;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl06$txtEffectiveDate")
	WebElement effdate5;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl07$txtEffectiveDate")
	WebElement effdate6;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl08$txtEffectiveDate")
	WebElement effdate7;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl09$txtEffectiveDate")
	WebElement effdate8;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl10$txtEffectiveDate")
	WebElement effdate9;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl11$txtEffectiveDate")
	WebElement effdate10;

	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl02$txtNewStdPct")
	WebElement newstdpct1;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl03$txtNewStdPct")
	WebElement newstdpct2;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl04$txtNewStdPct")
	WebElement newstdpct3;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl05$txtNewStdPct")
	WebElement newstdpct4;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl06$txtNewStdPct")
	WebElement newstdpct5;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl07$txtNewStdPct")
	WebElement newstdpct6;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl08$txtNewStdPct")
	WebElement newstdpct7;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl09$txtNewStdPct")
	WebElement newstdpct8;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl10$txtNewStdPct")
	WebElement newstdpct9;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl11$txtNewStdPct")
	WebElement newstdpct10;
	
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl02$txtNewXWindPct")
	WebElement newxwindpct1;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl03$txtNewXWindPct")
	WebElement newxwindpct2;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl04$txtNewXWindPct")
	WebElement newxwindpct3;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl05$txtNewXWindPct")
	WebElement newxwindpct4;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl06$txtNewXWindPct")
	WebElement newxwindpct5;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl07$txtNewXWindPcte")
	WebElement newxwindpct6;

	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl08$txtNewXWindPct")
	WebElement newxwindpct7;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl09$txtNewXWindPct")
	WebElement newxwindpct8;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl10$txtNewXWindPct")
	WebElement newxwindpct9;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl11$txtNewXWindPcte")
	WebElement newxwindpct10;
	
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl02$txtRenewStdPct")
	WebElement renewstd1;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl03$txtRenewStdPct")
	WebElement renewstd2;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl04$txtRenewStdPct")
	WebElement renewstd3;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl05$txtRenewStdPct")
	WebElement renewstd4;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl06$txtRenewStdPct")
	WebElement renewstd5;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl07$txtRenewStdPct")
	WebElement renewstd6;

	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl08$txtRenewStdPct")
	WebElement renewstd7;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl09$txtRenewStdPct")
	WebElement renewstd8;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl10$txtRenewStdPct")
	WebElement renewstd9;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl11$txtRenewStdPct")
	WebElement renewstd10;

	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl02$txtRenewXWindPct")
	WebElement newrenxwindpct1;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl03$txtRenewXWindPct")
	WebElement newrenxwindpct2;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl04$txtRenewXWindPct")
	WebElement newrenxwindpct3;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl05$txtRenewXWindPct")
	WebElement newrenxwindpct4;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl06$txtRenewXWindPct")
	WebElement newrenxwindpct5;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl07$txtRenewXWindPct")
	WebElement newrenxwindpct6;

	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl08$txtRenewXWindPct")
	WebElement newrenxwindpct7;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl09$txtRenewXWindPct")
	WebElement newrenxwindpct8;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl10$txtRenewXWindPct")
	WebElement newrenxwindpct9;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl11$txtRenewXWindPct")
	WebElement newrenxwindpct10;
	
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl02$txtWrapPct")
	WebElement wrap1;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl03$txtWrapPct")
	WebElement wrap2;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl04$txtWrapPct")
	WebElement wrap3;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl05$txtWrapPct")
	WebElement wrap4;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl06$txtWrapPct")
	WebElement wrap5;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl07$txtWrapPct")
	WebElement wrap6;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl08$txtWrapPct")
	WebElement wrap7;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl09$txtWrapPct")
	WebElement wrap8;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl10$txtWrapPct")
	WebElement wrap9;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl11$txtWrapPct")
	WebElement wrap10;
	
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl02$txtLiabilityPct")
	WebElement liability1;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl03$txtLiabilityPct")
	WebElement liability2;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl04$txtLiabilityPct")
	WebElement liability3;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl05$txtLiabilityPct")
	WebElement liability4;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl06$txtLiabilityPct")
	WebElement liability5;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl07$txtLiabilityPct")
	WebElement liability6;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl08$txtLiabilityPct")
	WebElement liability7;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl09$txtLiabilityPct")
	WebElement liability8;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl10$txtLiabilityPct")
	WebElement liability9;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl11$txtLiabilityPct")
	WebElement liability10;
	
	
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl02$txtNBHURPct")
	WebElement nbhur1;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl03$txtNBHURPct")
	WebElement nbhur2;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl04$txtNBHURPct")
	WebElement nbhur3;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl05$txtNBHURPct")
	WebElement nbhur4;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl06$txtNBHURPct")
	WebElement nbhur5;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl07$txtNBHURPct")
	WebElement nbhur6;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl08$txtNBHURPct")
	WebElement nbhur7;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl09$txtNBHURPct")
	WebElement nbhur8;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl10$txtNBHURPct")
	WebElement nbhur9;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl11$txtNBHURPct")
	WebElement nbhur10;
	
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl02$txtRNHURPct")
	WebElement rnhur1;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl03$txtRNHURPct")
	WebElement rnhur2;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl04$txtRNHURPct")
	WebElement rnhur3;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl05$txtRNHURPct")
	WebElement rnhur4;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl06$txtRNHURPct")
	WebElement rnhur5;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl07$txtRNHURPct")
	WebElement rnhur6;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl08$txtRNHURPct")
	WebElement rnhur7;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl09$txtRNHURPct")
	WebElement rnhur8;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl10$txtRNHURPct")
	WebElement rnhur9;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl11$txtRNHURPct")
	WebElement rnhur10;
	
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl02$txtNBEQPct")
	WebElement nbeq1;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl03$txtNBEQPct")
	WebElement nbeq2;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl04$txtNBEQPct")
	WebElement nbeq3;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl05$txtNBEQPct")
	WebElement nbeq4;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl06$txtNBEQPct")
	WebElement nbeq5;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl07$txtNBEQPct")
	WebElement nbeq6;

	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl08$txtNBEQPct")
	WebElement nbeq7;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl09$txtNBEQPct")
	WebElement nbeq8;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl10$txtNBEQPct")
	WebElement nbeq9;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl11$txtNBEQPct")
	WebElement nbeq10;
	
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl02$txtRNEQPct")
	WebElement rneq1;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl03$txtRNEQPct")
	WebElement rneq2;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl04$txtRNEQPct")
	WebElement rneq3;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl05$txtRNEQPct")
	WebElement rneq4;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl06$txtRNEQPct")
	WebElement rneq5;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl07$txtRNEQPct")
	WebElement rneq6;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl08$txtRNEQPct")
	WebElement rneq7;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl09$txtRNEQPct")
	WebElement rneq8;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl10$txtRNEQPct")
	WebElement rneq9;
	
	@FindBy(name="ctl00$MiddleContent$wAgentMaintenance$dgCommissions$ctl11$txtRNEQPct")
	WebElement rneq10;

	
	
	public Commission_Rates(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;	
	}
	
	public void Update(String agentid, String companyid, String planid, String effdate, String newstdpct, String newxwindpct,
            		   String renewstdpct, String renewxwindpct, String wrapprempct, String liabpct, String nbhurpct,
                       String rnhurpct, String nbeqpct, String rneqpct) throws NoSuchElementException
	{
			//if (company1.getText().contains(companyid) && plan1.getText().contains(planid))
			if (company1.getText().contains(companyid))
			{		
				while (company1.getText().contains(companyid)) 
				{
					if (plan1.getText().contains(planid))
					{
						row1(effdate, newstdpct, newxwindpct, renewstdpct,  renewxwindpct,  wrapprempct, liabpct,  nbhurpct,  rnhurpct,  nbeqpct,  rneqpct);
					}
					
					else if (company2.getText().equals("") && plan2.getText().contains(planid))
					{
						row2(effdate, newstdpct, newxwindpct, renewstdpct,  renewxwindpct,  wrapprempct, liabpct,  nbhurpct,  rnhurpct,  nbeqpct,  rneqpct);
					}
					
					else if (company3.getText().equals("") && plan3.getText().contains(planid))
					{
						row3(effdate, newstdpct, newxwindpct, renewstdpct,  renewxwindpct,  wrapprempct, liabpct,  nbhurpct,  rnhurpct,  nbeqpct,  rneqpct);
					}
					
					else if (company4.getText().equals("") && plan4.getText().contains(planid))
					{
						row4(effdate, newstdpct, newxwindpct, renewstdpct,  renewxwindpct,  wrapprempct, liabpct,  nbhurpct,  rnhurpct,  nbeqpct,  rneqpct);
					}
					
					else if (company5.getText().equals("") && plan5.getText().contains(planid))
					{
						row5(effdate, newstdpct, newxwindpct, renewstdpct,  renewxwindpct,  wrapprempct, liabpct,  nbhurpct,  rnhurpct,  nbeqpct,  rneqpct);
					}
					
					else if (company6.getText().equals("") && plan6.getText().contains(planid))
					{
						row6(effdate, newstdpct, newxwindpct, renewstdpct,  renewxwindpct,  wrapprempct, liabpct,  nbhurpct,  rnhurpct,  nbeqpct,  rneqpct);
					}
					
					else if (company7.getText().equals("") && plan7.getText().contains(planid))
					{
						row7(effdate, newstdpct, newxwindpct, renewstdpct,  renewxwindpct,  wrapprempct, liabpct,  nbhurpct,  rnhurpct,  nbeqpct,  rneqpct);
					}
				}				
			}
			
			else if (company2.getText().contains(companyid))
			{
			
				if (plan2.getText().contains(planid))
				{
					row2(effdate, newstdpct, newxwindpct, renewstdpct,  renewxwindpct,  wrapprempct, liabpct,  nbhurpct,  rnhurpct,  nbeqpct,  rneqpct);
				}
				
				else if (company3.getText().equals("") && plan3.getText().contains(planid))
				{
					row3(effdate, newstdpct, newxwindpct, renewstdpct,  renewxwindpct,  wrapprempct, liabpct,  nbhurpct,  rnhurpct,  nbeqpct,  rneqpct);
				}
				
				else if (company4.getText().equals("") && plan4.getText().contains(planid))
				{
					row4(effdate, newstdpct, newxwindpct, renewstdpct,  renewxwindpct,  wrapprempct, liabpct,  nbhurpct,  rnhurpct,  nbeqpct,  rneqpct);
				}
				
				else if (company5.getText().equals("") && plan5.getText().contains(planid))
				{
					row5(effdate, newstdpct, newxwindpct, renewstdpct,  renewxwindpct,  wrapprempct, liabpct,  nbhurpct,  rnhurpct,  nbeqpct,  rneqpct);
				}
				
				else if (company6.getText().equals("") && plan6.getText().contains(planid))
				{
					row6(effdate, newstdpct, newxwindpct, renewstdpct,  renewxwindpct,  wrapprempct, liabpct,  nbhurpct,  rnhurpct,  nbeqpct,  rneqpct);
				}
				
				else if (company7.getText().equals("") && plan7.getText().contains(planid))
				{
					row7(effdate, newstdpct, newxwindpct, renewstdpct,  renewxwindpct,  wrapprempct, liabpct,  nbhurpct,  rnhurpct,  nbeqpct,  rneqpct);
				}
			}
			
			else if (company3.getText().contains(companyid))
			{
				if (plan3.getText().contains(planid))
				{
					row3(effdate, newstdpct, newxwindpct, renewstdpct,  renewxwindpct,  wrapprempct, liabpct,  nbhurpct,  rnhurpct,  nbeqpct,  rneqpct);
				}
				
				else if (company4.getText().equals("") && plan4.getText().contains(planid))
				{
					row4(effdate, newstdpct, newxwindpct, renewstdpct,  renewxwindpct,  wrapprempct, liabpct,  nbhurpct,  rnhurpct,  nbeqpct,  rneqpct);
				}
				
				else if (company5.getText().equals("") && plan5.getText().contains(planid))
				{
					row5(effdate, newstdpct, newxwindpct, renewstdpct,  renewxwindpct,  wrapprempct, liabpct,  nbhurpct,  rnhurpct,  nbeqpct,  rneqpct);
				}
				
				else if (company6.getText().equals("") && plan6.getText().contains(planid))
				{
					row6(effdate, newstdpct, newxwindpct, renewstdpct,  renewxwindpct,  wrapprempct, liabpct,  nbhurpct,  rnhurpct,  nbeqpct,  rneqpct);
				}
				
				else if (company7.getText().equals("") && plan7.getText().contains(planid))
				{
					row7(effdate, newstdpct, newxwindpct, renewstdpct,  renewxwindpct,  wrapprempct, liabpct,  nbhurpct,  rnhurpct,  nbeqpct,  rneqpct);
				}
			}
			
			else if (company4.getText().contains(companyid))
			{
				if (plan4.getText().contains(planid))
				{
					row4(effdate, newstdpct, newxwindpct, renewstdpct,  renewxwindpct,  wrapprempct, liabpct,  nbhurpct,  rnhurpct,  nbeqpct,  rneqpct);
				}
				
				else if (company5.getText().equals("") && plan5.getText().contains(planid))
				{
					row5(effdate, newstdpct, newxwindpct, renewstdpct,  renewxwindpct,  wrapprempct, liabpct,  nbhurpct,  rnhurpct,  nbeqpct,  rneqpct);
				}
				
				else if (company6.getText().equals("") && plan6.getText().contains(planid))
				{
					row6(effdate, newstdpct, newxwindpct, renewstdpct,  renewxwindpct,  wrapprempct, liabpct,  nbhurpct,  rnhurpct,  nbeqpct,  rneqpct);
				}
				
				else if (company7.getText().equals("") && plan7.getText().contains(planid))
				{
					row7(effdate, newstdpct, newxwindpct, renewstdpct,  renewxwindpct,  wrapprempct, liabpct,  nbhurpct,  rnhurpct,  nbeqpct,  rneqpct);
				}
			}
			
			else if (company7.getText().contains(companyid))
			{
			  //while (Company7.getText().contains())
				if (plan7.getText().contains(planid))
				{
					row7(effdate, newstdpct, newxwindpct, renewstdpct,  renewxwindpct,  wrapprempct, liabpct,  nbhurpct,  rnhurpct,  nbeqpct,  rneqpct);
				}
			}
	}

	public void row1(String effdate, String newstdpct, String newxwindpct,
            String renewstdpct, String renewxwindpct, String wrapprempct, 
            String liabpct, String nbhurpct, String rnhurpct, String nbeqpct, String rneqpct)
	{
	  
	  effdate1.clear();
	  effdate1.sendKeys(effdate);
	  Log("Entered effective date: " + effdate + " into row 1");
	  
	  newstdpct1.clear();
	  newstdpct1.sendKeys(newstdpct);
	  Log("Entered new std pct: " + newstdpct + " into row 1");
	  
	  newxwindpct1.clear();
	  newxwindpct1.sendKeys(newxwindpct);
	  Log("Entered new X-wind pct: " + newxwindpct + " into row 1");
	  
	  renewstd1.clear();
	  renewstd1.sendKeys(renewstdpct);
	  Log("Entered renew std pct: " + renewstdpct + " into row 1");
	  
	  newrenxwindpct1.clear();
	  newrenxwindpct1.sendKeys(renewxwindpct);
	  Log("Entered renew x-wind pct: " + renewxwindpct + " into row 1");
	  
	  wrap1.clear();
	  wrap1.sendKeys(wrapprempct);
	  Log("Entered wrap pct: " + wrapprempct + " into row 1");
	  
	  liability1.clear();
	  liability1.sendKeys(liabpct);
	  Log("Entered Liability pct: " + liabpct + " into row 1");
	  
	  nbhur1.clear();
	  nbhur1.sendKeys(nbhurpct);
	  Log("Entered NB HUR pct: " + nbhurpct + " into row 1");
	  
	  rnhur1.clear();
	  rnhur1.sendKeys(rnhurpct);
	  Log("Entered RN HUR pct: " + rnhurpct + " into row 1");
	  
	  nbeq1.clear();
	  nbeq1.sendKeys(nbeqpct);
	  Log("Entered NB EQ pct: " + nbeqpct + " into row 1");
	  
	  rneq1.clear();
	  rneq1.sendKeys(rneqpct);
	  Log("Entered RN EQ pct: " + rneqpct + " into row 1");
	  
	  Log("=== Entered Commission rates for Row 1 ===");
	
	}
	
	
	public void row2(String effdate, String newstdpct, String newxwindpct,
            String renewstdpct, String renewxwindpct, String wrapprempct, 
            String liabpct, String nbhurpct, String rnhurpct, String nbeqpct, String rneqpct)
	{
	  
	  effdate2.clear();
	  effdate2.sendKeys(effdate);
	  Log("Entered effective date: " + effdate + " into row 2");
	  
	  newstdpct2.clear();
	  newstdpct2.sendKeys(newstdpct);
	  Log("Entered new std pct: " + newstdpct + " into row 2");
	  
	  newxwindpct2.clear();
	  newxwindpct2.sendKeys(newxwindpct);
	  Log("Entered new X-wind pct: " + newxwindpct + " into row 2");
	  
	  renewstd2.clear();
	  renewstd2.sendKeys(renewstdpct);
	  Log("Entered renew std pct: " + renewstdpct + " into row 2");
	  
	  newrenxwindpct2.clear();
	  newrenxwindpct2.sendKeys(renewxwindpct);
	  Log("Entered renew x-wind pct: " + renewxwindpct + " into row 2");
	  
	  wrap2.clear();
	  wrap2.sendKeys(wrapprempct);
	  Log("Entered wrap pct: " + wrapprempct + " into row 2");
	  
	  liability2.clear();
	  liability2.sendKeys(liabpct);
	  Log("Entered Liability pct: " + liabpct + " into row 2");
	  
	  nbhur2.clear();
	  nbhur2.sendKeys(nbhurpct);
	  Log("Entered NB HUR pct: " + nbhurpct + " into row 2");
	  
	  rnhur2.clear();
	  rnhur2.sendKeys(rnhurpct);
	  Log("Entered RN HUR pct: " + rnhurpct + " into row 2");
	  
	  nbeq2.clear();
	  nbeq2.sendKeys(nbeqpct);
	  Log("Entered NB EQ pct: " + nbeqpct + " into row 2");
	  
	  rneq2.clear();
	  rneq2.sendKeys(rneqpct);
	  Log("Entered RN EQ pct: " + rneqpct + " into row 2");
	  
	  Log("=== Entered Commission rates for Row 2 ===");
	
	}
	
	public void row3(String effdate, String newstdpct, String newxwindpct,
            String renewstdpct, String renewxwindpct, String wrapprempct, 
            String liabpct, String nbhurpct, String rnhurpct, String nbeqpct, String rneqpct)
	{
	  
	  effdate3.clear();
	  effdate3.sendKeys(effdate);
	  Log("Entered effective date: " + effdate + " into row 3");
	  
	  newstdpct3.clear();
	  newstdpct3.sendKeys(newstdpct);
	  Log("Entered new std pct: " + newstdpct + " into row 3");
	  
	  newxwindpct3.clear();
	  newxwindpct3.sendKeys(newxwindpct);
	  Log("Entered new X-wind pct: " + newxwindpct + " into row 3");
	  
	  renewstd3.clear();
	  renewstd3.sendKeys(renewstdpct);
	  Log("Entered renew std pct: " + renewstdpct + " into row 3");
	  
	  newrenxwindpct3.clear();
	  newrenxwindpct3.sendKeys(renewxwindpct);
	  Log("Entered renew x-wind pct: " + renewxwindpct + " into row 3");
	  
	  wrap3.clear();
	  wrap3.sendKeys(wrapprempct);
	  Log("Entered wrap pct: " + wrapprempct + " into row 3");
	  
	  liability3.clear();
	  liability3.sendKeys(liabpct);
	  Log("Entered Liability pct: " + liabpct + " into row 3");
	  
	  nbhur3.clear();
	  nbhur3.sendKeys(nbhurpct);
	  Log("Entered NB HUR pct: " + nbhurpct + " into row 3");
	  
	  rnhur3.clear();
	  rnhur3.sendKeys(rnhurpct);
	  Log("Entered RN HUR pct: " + rnhurpct + " into row 3");
	  
	  nbeq3.clear();
	  nbeq3.sendKeys(nbeqpct);
	  Log("Entered NB EQ pct: " + nbeqpct + " into row 3");
	  
	  rneq3.clear();
	  rneq3.sendKeys(rneqpct);
	  Log("Entered RN EQ pct: " + rneqpct + " into row 3");
	  
	  Log("=== Entered Commission rates for Row 3 ===");
	
	}
	
	public void row4(String effdate, String newstdpct, String newxwindpct,
            String renewstdpct, String renewxwindpct, String wrapprempct, 
            String liabpct, String nbhurpct, String rnhurpct, String nbeqpct, String rneqpct)
	{
	  
	  effdate4.clear();
	  effdate4.sendKeys(effdate);
	  Log("Entered effective date: " + effdate + " into row 4");
	  
	  newstdpct4.clear();
	  newstdpct4.sendKeys(newstdpct);
	  Log("Entered new std pct: " + newstdpct + " into row 4");
	  
	  newxwindpct4.clear();
	  newxwindpct4.sendKeys(newxwindpct);
	  Log("Entered new X-wind pct: " + newxwindpct + " into row 4");
	  
	  renewstd4.clear();
	  renewstd4.sendKeys(renewstdpct);
	  Log("Entered renew std pct: " + renewstdpct + " into row 4");
	  
	  newrenxwindpct4.clear();
	  newrenxwindpct4.sendKeys(renewxwindpct);
	  Log("Entered renew x-wind pct: " + renewxwindpct + " into row 4");
	  
	  wrap4.clear();
	  wrap4.sendKeys(wrapprempct);
	  Log("Entered wrap pct: " + wrapprempct + " into row 4");
	  
	  liability4.clear();
	  liability4.sendKeys(liabpct);
	  Log("Entered Liability pct: " + liabpct + " into row 4");
	  
	  nbhur4.clear();
	  nbhur4.sendKeys(nbhurpct);
	  Log("Entered NB HUR pct: " + nbhurpct + " into row 4");
	  
	  rnhur4.clear();
	  rnhur4.sendKeys(rnhurpct);
	  Log("Entered RN HUR pct: " + rnhurpct + " into row 4");
	  
	  nbeq4.clear();
	  nbeq4.sendKeys(nbeqpct);
	  Log("Entered NB EQ pct: " + nbeqpct + " into row 4");
	  
	  rneq4.clear();
	  rneq4.sendKeys(rneqpct);
	  Log("Entered RN EQ pct: " + rneqpct + " into row 4");
	  
	  Log("=== Entered Commission rates for Row 4 ===");
	}
	
	public void row5(String effdate, String newstdpct, String newxwindpct,
            String renewstdpct, String renewxwindpct, String wrapprempct, 
            String liabpct, String nbhurpct, String rnhurpct, String nbeqpct, String rneqpct)
	{
	  
	  effdate5.clear();
	  effdate5.sendKeys(effdate);
	  Log("Entered effective date: " + effdate + " into row 5");
	  
	  newstdpct5.clear();
	  newstdpct5.sendKeys(newstdpct);
	  Log("Entered new std pct: " + newstdpct + " into row 5");
	  
	  newxwindpct5.clear();
	  newxwindpct5.sendKeys(newxwindpct);
	  Log("Entered new X-wind pct: " + newxwindpct + " into row 5");
	  
	  renewstd5.clear();
	  renewstd5.sendKeys(renewstdpct);
	  Log("Entered renew std pct: " + renewstdpct + " into row 5");
	  
	  newrenxwindpct5.clear();
	  newrenxwindpct5.sendKeys(renewxwindpct);
	  Log("Entered renew x-wind pct: " + renewxwindpct + " into row 5");
	  
	  wrap5.clear();
	  wrap5.sendKeys(wrapprempct);
	  Log("Entered wrap pct: " + wrapprempct + " into row 5");
	  
	  liability5.clear();
	  liability5.sendKeys(liabpct);
	  Log("Entered Liability pct: " + liabpct + " into row 5");
	  
	  nbhur5.clear();
	  nbhur5.sendKeys(nbhurpct);
	  Log("Entered NB HUR pct: " + nbhurpct + " into row 5");
	  
	  rnhur5.clear();
	  rnhur5.sendKeys(rnhurpct);
	  Log("Entered RN HUR pct: " + rnhurpct + " into row 5");
	  
	  nbeq5.clear();
	  nbeq5.sendKeys(nbeqpct);
	  Log("Entered NB EQ pct: " + nbeqpct + " into row 5");
	  
	  rneq5.clear();
	  rneq5.sendKeys(rneqpct);
	  Log("Entered RN EQ pct: " + rneqpct + " into row 5");
	  
	  Log("=== Entered Commission rates for Row 5 ===");
	}
	
	public void row6(String effdate, String newstdpct, String newxwindpct,
            String renewstdpct, String renewxwindpct, String wrapprempct, 
            String liabpct, String nbhurpct, String rnhurpct, String nbeqpct, String rneqpct)
	{
	  
	  effdate6.clear();
	  effdate6.sendKeys(effdate);
	  Log("Entered effective date: " + effdate + " into row 6");
	  
	  newstdpct6.clear();
	  newstdpct6.sendKeys(newstdpct);
	  Log("Entered new std pct: " + newstdpct + " into row 6");
	  
	  newxwindpct6.clear();
	  newxwindpct6.sendKeys(newxwindpct);
	  Log("Entered new X-wind pct: " + newxwindpct + " into row 6");
	  
	  renewstd6.clear();
	  renewstd6.sendKeys(renewstdpct);
	  Log("Entered renew std pct: " + renewstdpct + " into row 6");
	  
	  newrenxwindpct6.clear();
	  newrenxwindpct6.sendKeys(renewxwindpct);
	  Log("Entered renew x-wind pct: " + renewxwindpct + " into row 6");
	  
	  wrap6.clear();
	  wrap6.sendKeys(wrapprempct);
	  Log("Entered wrap pct: " + wrapprempct + " into row 6");
	  
	  liability6.clear();
	  liability6.sendKeys(liabpct);
	  Log("Entered Liability pct: " + liabpct + " into row 6");
	  
	  nbhur6.clear();
	  nbhur6.sendKeys(nbhurpct);
	  Log("Entered NB HUR pct: " + nbhurpct + " into row 6");
	  
	  rnhur6.clear();
	  rnhur6.sendKeys(rnhurpct);
	  Log("Entered RN HUR pct: " + rnhurpct + " into row 6");
	  
	  nbeq6.clear();
	  nbeq6.sendKeys(nbeqpct);
	  Log("Entered NB EQ pct: " + nbeqpct + " into row 6");
	  
	  rneq6.clear();
	  rneq6.sendKeys(rneqpct);
	  Log("Entered RN EQ pct: " + rneqpct + " into row 6");
	  
	  Log("=== Entered Commission rates for Row 6 ===");
	
	}
	
	public void row7(String effdate, String newstdpct, String newxwindpct,
            String renewstdpct, String renewxwindpct, String wrapprempct, 
            String liabpct, String nbhurpct, String rnhurpct, String nbeqpct, String rneqpct)
	{
	  
	  effdate7.clear();
	  effdate7.sendKeys(effdate);
	  Log("Entered effective date: " + effdate + " into row 7");
	  
	  newstdpct7.clear();
	  newstdpct7.sendKeys(newstdpct);
	  Log("Entered new std pct: " + newstdpct + " into row 7");
	  
	  newxwindpct7.clear();
	  newxwindpct7.sendKeys(newxwindpct);
	  Log("Entered new X-wind pct: " + newxwindpct + " into row 7");
	  
	  renewstd7.clear();
	  renewstd7.sendKeys(renewstdpct);
	  Log("Entered renew std pct: " + renewstdpct + " into row 7");
	  
	  newrenxwindpct7.clear();
	  newrenxwindpct7.sendKeys(renewxwindpct);
	  Log("Entered renew x-wind pct: " + renewxwindpct + " into row 7");
	  
	  wrap7.clear();
	  wrap7.sendKeys(wrapprempct);
	  Log("Entered wrap pct: " + wrapprempct + " into row 7");
	  
	  liability7.clear();
	  liability7.sendKeys(liabpct);
	  Log("Entered Liability pct: " + liabpct + " into row 7");
	  
	  nbhur7.clear();
	  nbhur7.sendKeys(nbhurpct);
	  Log("Entered NB HUR pct: " + nbhurpct + " into row 7");
	  
	  rnhur7.clear();
	  rnhur7.sendKeys(rnhurpct);
	  Log("Entered RN HUR pct: " + rnhurpct + " into row 7");
	  
	  nbeq7.clear();
	  nbeq7.sendKeys(nbeqpct);
	  Log("Entered NB EQ pct: " + nbeqpct + " into row 7");
	  
	  rneq7.clear();
	  rneq7.sendKeys(rneqpct);
	  Log("Entered RN EQ pct: " + rneqpct + " into row 7");
	  
	  Log("=== Entered Commission rates for Row 7 ===");
	}
}
