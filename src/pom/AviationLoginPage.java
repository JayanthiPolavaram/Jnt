package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AviationLoginPage extends BasePage{
	
	

	@FindBy(xpath="//a[@title='Shell Aviation MarketHub']")
	private WebElement shellaaviationmarkethubbutton;
	@FindBy(xpath="(//a[@href='/content/nextgen/shell/global/en/gcaviation/fm/portal/home.html'])[3]")
	private WebElement homebutton;
	
	public AviationLoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	public void clickshellaaviationmarkethubbutton()
	{
		shellaaviationmarkethubbutton.click();
	}
	public void verifyHomebutton()
	{
		Assert.assertTrue(homebutton.isDisplayed());
	}
	
	

}
