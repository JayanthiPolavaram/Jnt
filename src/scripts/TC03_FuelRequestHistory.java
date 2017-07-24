package scripts.scripts;

import java.util.concurrent.TimeUnit;

import generics.Generics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pom.AviationHomePage;
import pom.AviationLoginPage;
import pom.BookRequestPage;
import pom.FuelRequestHistory;
import pom.LoginPage;
import scripts.BaseTest;

public class TC03_FuelRequestHistory extends BaseTest
{
	@Test(dataProvider="fuelrequesthistory")
	public void testFuelRH(String username,String password,String arritime,String deptime)
	{
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		LoginPage l=new LoginPage(driver);
		l.setUsername(username);
		l.setPassword(password);
		l.clickLogin();
		AviationLoginPage alp=new AviationLoginPage(driver);
		alp.verifyHomebutton();
		alp.clickshellaaviationmarkethubbutton();
		AviationHomePage ahp=new AviationHomePage(driver);
		ahp.clickFuelRequesthistoryButton();
		FuelRequestHistory frh=new FuelRequestHistory(driver);
		frh.verifyfuelrequesthistoryheader();
		//frh.clickreqid();
		frh.fuelrequestdetailsheader();
		frh.clickEditButton();
		BookRequestPage bp=new BookRequestPage(driver);
		bp.verifyHeader();
		bp.selectarrtime(arritime);
		bp.selectdepttime(deptime);
		bp.clickNextButton();
		bp.verifySubmitButton();
		bp.clickSubmitButton();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ahp.verifywelcomemsg();
		
		
		
		
		
		
	
	}
	
	
	
	
	
	@DataProvider(name="fuelrequesthistory")
    public Object[][] getData()
    {
    	int rows=Generics.getRowCount(XL_PATH,"TC03_Fuelrequesthistory");
        int cols=Generics.getColCount(XL_PATH,"TC03_Fuelrequesthistory");
    	Object[][] data=new Object[rows-1][cols];
    	for(int i=2;i<=rows;i++)
    	{
    		for(int j=0;j<cols;j++)
    		{
    	data[i-2][j]=Generics.getCellValue(XL_PATH,"TC03_Fuelrequesthistory",i,j);
    		 		
    		}
   
    }
    	return data;
}
}
