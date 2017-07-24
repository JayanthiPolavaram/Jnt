package scripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public abstract class BaseTest implements AutomationConstants 
{
	public WebDriver driver;
	@BeforeSuite
	public void startOfSuite()
	{
		Reporter.log("Started executing the suite",true);
	}
	@AfterSuite
	public void endOfSuite()
	{
		Reporter.log("ended executing the suite",true);
	}
	@BeforeTest
	public void startOfTest()
	{
		Reporter.log("Started executing the test",true);
	}
	@AfterTest
	public void endOfTest()
	{
		Reporter.log("ended executing the test",true);
	}
	@BeforeClass
	public void startOfClass()
	{
		Reporter.log("started executing the class",true);
	}
	@AfterClass
	public void endOfClass()
	{
		Reporter.log("ended executing the class",true);
	}
	
	@BeforeMethod
	
	public void precondition()
	{
		//driver=new FirefoxDriver();
		
		
		//System.setProperty("webdriver.chrome.driver","./driver1/chromedriver.exe");
		//driver=new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver","./driver1/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://akamai.markethub.shell.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
/*@BeforeMethod
	
	public void precondition() throws MalformedURLException
	{
	URL ra=new URL("http://192.168.1.105:4444/wd/hub");
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setBrowserName("firefox");
	driver=new RemoteWebDriver(ra,dc);
		
		//System.setProperty("webdriver.gecko.driver","./driver1/geckodriver.exe");
		//driver=new FirefoxDriver();
		driver.get("https://akamai.markethub.shell.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}*/
/*@BeforeMethod
	@Parameters({"remoteURL","browser"})
	public void precondition(String remoteURL,String browser) throws MalformedURLException
	{
	
	URL ra=new URL(remoteURL);
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setBrowserName(browser);
	driver=new RemoteWebDriver(ra,dc);	
		driver.get("https://akamai.markethub.shell.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	*/
	@AfterMethod
	
	public void postcondition()
	{
		driver.close();
	}
	

}
