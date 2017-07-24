package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AviationHomePage extends BasePage{
	
	

	@FindBy(xpath="(//a[@href='/content/nextgen/ehub/fuelrequest/bookrequest.html'])[3]")
	private WebElement BookRequestButton;
	@FindBy(xpath="(//a[@href='/content/nextgen/ehub/requesthistory.html'])[3]")
	private WebElement FuelRequestButton;
	@FindBy(xpath="//h1[contains(text(),'Welcome to Aviation MarketHub, Avation!')]")
	private WebElement welcomemsg;
	
	public AviationHomePage(WebDriver driver)
	{
		super(driver);
	}
	
	public void clickBookRequestButton()
	{
		BookRequestButton.click();
	}
	
	public void verifywelcomemsg()
	{
		Assert.assertTrue(welcomemsg.isDisplayed());
	}
	public void clickFuelRequesthistoryButton()
	{
		FuelRequestButton.click();
	}
	

}
