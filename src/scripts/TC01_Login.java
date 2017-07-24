package scripts;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
//import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom.LoginPage;
import generics.Generics;

public class TC01_Login extends BaseTest{
	
	
	
	@Test(dataProvider="cusLogin")
	
	public void testValidLogin(String uname,String pwd)
	{
		
		LoginPage l=new LoginPage(driver);
		l.setUsername(uname);
		l.setPassword(pwd);
		l.clickLogin();
		Reporter.log("hey passed",true);
	
	}
	
	
	@DataProvider(name="cusLogin")
    public Object[][] getData()
    {
    	int rows=Generics.getRowCount(XL_PATH,"TC01_Login");
        int cols=Generics.getColCount(XL_PATH,"TC01_Login");
    	Object[][] data=new Object[rows-1][cols];
    	for(int i=2;i<=rows;i++)
    	{
    		for(int j=0;j<cols;j++)
    		{
    	data[i-2][j]=Generics.getCellValue(XL_PATH,"TC01_Login",i,j);
    		 		
    		}
   
    }
    	return data;
}
}
