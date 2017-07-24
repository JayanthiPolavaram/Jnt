package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BookRequestPage extends BasePage{
	
	
	
	@FindBy(xpath="//h1[contains(text(),'Schedule Fuel Request')]")
	private WebElement schedulefuelreqheader;
	
	@FindBy(xpath="//select[@id='iataIdDup']")
	private WebElement IataList;
	@FindBy(xpath="//select[@id='icaoIDDup']")
	private WebElement IcaoList;
	@FindBy(xpath="//input[@id='airportNme']")
	private WebElement AirportName;
	@FindBy(xpath="//select[@id='apronId']")
	private WebElement Apron;
	@FindBy(xpath="//select[@id='cardId']")
	private WebElement Carnetcardnum;
	@FindBy(xpath="//input[@id='tailNo']")
	private WebElement tailnum;
	
	@FindBy(xpath="//input[@id='flightNo']")
	private WebElement flightnum;
	
	@FindBy(xpath="//input[@id='aircraftType']")
	private WebElement aircrafttype;
	
	@FindBy(xpath="(//div[@class='inputBox pickdate'])[1]/button[@class='secondary datepickerButton']")
	private WebElement arrcalender;
	
	@FindBy(xpath="(//div[@class='picker__day picker__day--infocus picker__day--today picker__day--highlighted'])[1]/../../following-sibling::tr[1]/td[1]")
	private WebElement arrdate;
	
	@FindBy(xpath="(//div[@class='inputBox pickdate'])[2]/button[@class='secondary datepickerButton']")
	private WebElement deptcalender;
	
	@FindBy(xpath="//select[@id='DepartureTime']")
	private WebElement depttime;
	
	@FindBy(xpath="//select[@id='ArrivalTime']")
	private WebElement arrtime;
	
	
	
	
	
	
	@FindBy(xpath="//div[@class='picker__day picker__day--infocus picker__day--today picker__day--highlighted']/../../following-sibling::tr[1]/td[2]")
	private WebElement depdate;
	
	@FindBy(xpath="//select[@id='productDetails']")
	private WebElement productlist;
	
	@FindBy(xpath="//select[@id='VolumeUnit']")
	private WebElement volumeunit;
	
	@FindBy(xpath="//div[@id='vol00']//select")
	private WebElement volume;
	
	@FindBy(xpath="//textarea[@id='addInfo']")
	private WebElement addinfo;
	
	@FindBy(xpath="//button[@id='nextFR']")
	private WebElement nxtbtn;
	
	@FindBy(xpath="//button[@id='FRSubmit']")
	private WebElement submitbtn;
	
	
	

	
	
	
	
	
	public BookRequestPage(WebDriver driver)
	{
		super(driver);
	}
	
	 public void verifyHeader()
	    {
	    	Assert.assertTrue(schedulefuelreqheader.isDisplayed());
	    	
	    }
	
	public void selectIata(String iata)
	{
		Select select=new Select(IataList);
		select.selectByValue(iata);
		
	}
	public void verifyIcao(String expectedicao)
	{
		String actualicao=IcaoList.getAttribute("value");
		Assert.assertEquals(actualicao,expectedicao);
			
	}
	public void verifyAirportName(String expectedairport)
	{
		String actualairport=AirportName.getAttribute("value");
		Assert.assertEquals(actualairport,expectedairport);
			
	}
	public void verifyApron(String expectedapron)
	{
		String actualapron=Apron.getText();
		Assert.assertEquals(actualapron,expectedapron);
			
	}
	public void selectCarnetcardnum(String carnetcardnum)
	{
		Select select=new Select(Carnetcardnum);
		select.selectByVisibleText(carnetcardnum);
		
	}
	public void verifyTailnum(String expectedtailnum)
	{
		String actualtailnum=tailnum.getAttribute("value");
		Assert.assertEquals(actualtailnum,expectedtailnum);
			
	}
	public void setFlightNumber(String flightnumber)
	{
		flightnum.sendKeys(flightnumber);
	}
	public void setAircraftType(String aircraft)
	{
		aircrafttype.sendKeys(aircraft);
	}
	public void clickArrivalCalender()
	{
		arrcalender.click();
	}
	
	public void clickArrivalDate()
	{
		arrdate.click();
	}
	public void clickDepartureCalender()
	{
		deptcalender.click();
	}
	public void clickDepartureDate()
	{
		depdate.click();
	}
	
	public void selectarrtime(String arritime)
	{
		Select select=new Select(arrtime);
		select.selectByValue(arritime);
		
	}
	public void selectdepttime(String deptime)
	{
		Select select=new Select(depttime);
		select.selectByValue(deptime);
		
	}
	
	public void selectProduct(String product)
	{
		Select select=new Select(productlist);
		select.selectByVisibleText(product);
		
	}
	public void selectvolumeunit(String vunit)
	{
		Select select=new Select(volumeunit);
		select.selectByVisibleText(vunit);
		
	}
	public void selectvolume(String vol)
	{
		Select select=new Select(volume);
		select.selectByVisibleText(vol);
		
	}
	public void setAdditionalinfo(String additionalinfo)
	{
		addinfo.sendKeys(additionalinfo);
	}
	public void clickNextButton()
	{
		nxtbtn.click();
	}
	public void verifySubmitButton()
	{
		Assert.assertTrue(submitbtn.isDisplayed());
	}
	public void clickSubmitButton()
	{
		submitbtn.click();
	}
   
	
	
	
	
	
	

	
	
	
	
	
	
	

}
