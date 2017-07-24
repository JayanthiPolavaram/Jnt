package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class FuelRequestHistory extends BasePage{ 
	
	@FindBy(xpath="//h1[contains(text(),'Fuel Request History')]")
	private WebElement fuelrequesthistoryheader;
	@FindBy(xpath="//td[contains(text(),'27157')]")
	private WebElement reqid;
	@FindBy(xpath="//h1[contains(text(),'Request Details')]")
	private WebElement frdheader;
	@FindBy(xpath="//button[@id='previewedit']")
	private WebElement frdeditbutton;
	
	
	public FuelRequestHistory(WebDriver driver)
	{
	super(driver);	
	}
	
	
	public void verifyfuelrequesthistoryheader()
	{
		Assert.assertTrue(fuelrequesthistoryheader.isDisplayed());
	}
    public void clickreqid()
    {
    	reqid.click();
    }
    public void fuelrequestdetailsheader()
    {
    	if(frdheader.isDisplayed())
    	{
    		Assert.assertTrue(frdheader.isDisplayed(),"frd page is displayed");
    	}
    	else
    	{
    		Reporter.log("Fuel request details page is not displayed");
    	}
    	}
    	
    
    public void clickEditButton()
    {
    	frdeditbutton.click();	
    }
}
