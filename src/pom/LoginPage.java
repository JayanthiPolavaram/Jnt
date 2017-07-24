package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	
	@FindBy(xpath="//input[@id='userId']")
	private WebElement unTB;
	@FindBy(xpath="//input[@id='password']")
	private WebElement pwTB;
	@FindBy(xpath="//button[@id='login']")
	private WebElement loginBtn;
	
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	public void setUsername(String un)
	{
		unTB.sendKeys(un);	
	}
	public void setPassword(String pw)
	{
		pwTB.sendKeys(pw);	
	}
	public void clickLogin()
	{
		loginBtn.click();	
	}
	

}
