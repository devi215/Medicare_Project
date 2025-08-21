package medicare;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import medicare_test.BaseClass;

public class LoginPage {
	
	WebDriver driver=BaseClass.driver;
	
	//locators
	@FindBy(xpath="//a[text()='Login']")
	WebElement Login;
	@FindBy(xpath="//input[@id='username']")
	WebElement Email;
	@FindBy(xpath="//input[@id='password']")
	WebElement Password;
	@FindBy(xpath="//input[@class='btn btn-primary']")
	WebElement LLogin;
	
	
	//methods
		public LoginPage() {
			PageFactory.initElements(driver, this);
		}
		
public void LoginFunction(String email,String password)	{
	Login.click();
	Email.sendKeys(email);
	Password.sendKeys(password);
	LLogin.click();
}

}