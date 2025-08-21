package medicare;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import medicare_test.BaseClass;


public class SignUpPage {
	WebDriver driver=BaseClass.driver;
	//locators
	@FindBy(xpath="//input[@id='firstName']")
	WebElement FName;
	@FindBy(xpath="//input[@id='lastName']")
	WebElement LName;
	@FindBy(xpath="//input[@id='email']")
	WebElement Email;
	@FindBy(xpath="//input[@id='contactNumber']")
	WebElement ContactNo;
	@FindBy(xpath="//input[@id='password']")
	WebElement  Password;
	@FindBy(xpath="//input[@id='confirmPassword']")
	WebElement ConfirmPassword;
	@FindBy(xpath="//input[@id='role1']")
	WebElement UserRadioBtn;
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement  NextBilling;
	@FindBy(xpath="//a[text()=\"Sign Up\"]")
	WebElement SignUp;
    @FindBy(xpath="//a[text()=\"Login\"]")
    WebElement Login;
    @FindBy(xpath="//input[@id='addressLineOne']")
    WebElement AddressOne;
    @FindBy(xpath="//input[@id='addressLineTwo']")
    WebElement AddressTwo;
    @FindBy(xpath="//input[@id='city']")
    WebElement City;
    @FindBy(xpath="//input[@id='postalCode']")
    WebElement PostalCode;
    @FindBy(xpath="//input[@id='state']")
    WebElement State;
    @FindBy(xpath="//input[@id='country']")
    WebElement Country ;
    @FindBy(xpath="//button[@name='_eventId_confirm']")
    WebElement NextConfirm ;
    
   
    
	//methods
	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}
	
public void LoginFunction (String fname,String lname,String email,String contactNo,String password,String confirmPassword,String addone,String addtwo,String city,String postal,String state,String country )  {
		SignUp.click();
		FName.sendKeys(fname);
		LName.sendKeys(lname);		
		Email.sendKeys(email);
		ContactNo.sendKeys(contactNo);
		Password.sendKeys(password);
		ConfirmPassword.sendKeys(confirmPassword);
		
		NextBilling.click();
		 AddressOne.sendKeys(addone);
		 AddressTwo.sendKeys(addtwo);
		City.sendKeys(city);
		PostalCode.sendKeys(postal);
		State.sendKeys(state);
		Country.sendKeys(country);
		 NextConfirm.click();
		
}

}
