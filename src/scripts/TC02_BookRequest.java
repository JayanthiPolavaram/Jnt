package scripts;

import java.util.concurrent.TimeUnit;

import generics.Generics;

import org.testng.annotations.DataProvider;


import org.testng.annotations.Test;

import pom.AviationHomePage;
import pom.AviationLoginPage;
import pom.BookRequestPage;
import pom.LoginPage;

public class TC02_BookRequest extends BaseTest
{
	@Test(dataProvider="bookfueldata")
	public void testbookfuel(String username,String password,String iata,String expectedicao,String expectedairport,String expectedapron,String carnetcardnum,String expectedtailnum,String flightnumber,String aircraft,String product,String vunit,String vol,String additionalinfo,String arritime,String deptime)
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
	ahp.clickBookRequestButton();
	BookRequestPage bp=new BookRequestPage(driver);
	bp.verifyHeader();
	bp.selectIata(iata);
	bp.verifyIcao(expectedicao);
	bp.verifyAirportName(expectedairport);
	bp.verifyApron(expectedapron);
	bp.selectCarnetcardnum(carnetcardnum);
	bp.verifyTailnum(expectedtailnum);
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//bp.setFlightNumber(flightnumber);
	//bp.setAircraftType(aircraft);
	bp.clickArrivalCalender();
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	bp.clickArrivalDate();
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	bp.clickDepartureCalender();
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	bp.clickDepartureDate();
	bp.selectarrtime(arritime);
	bp.selectdepttime(deptime);
	bp.selectProduct(product);
	bp.selectvolumeunit(vunit);
	//bp.selectvolume(vol);
	bp.setAdditionalinfo(additionalinfo);
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
	
	@DataProvider(name="bookfueldata")
    public Object[][] getData()
    {
    	int rows=Generics.getRowCount(XL_PATH,"TC02_Bookfuel");
        int cols=Generics.getColCount(XL_PATH,"TC02_Bookfuel");
    	Object[][] data=new Object[rows-1][cols];
    	for(int i=2;i<=rows;i++)
    	{
    		for(int j=0;j<cols;j++)
    		{
    	data[i-2][j]=Generics.getCellValue(XL_PATH,"TC02_Bookfuel",i,j);
    		 		
    		}
   
    }
    	return data;
}
}
