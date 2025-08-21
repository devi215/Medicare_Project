package medicare_test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import medicare.AddToCartPage;
import medicare.LoginPage;
import medicare.SignUpPage;

import org.openqa.selenium.chrome.ChromeDriver;         

public class LoginSuccess extends BaseClass {
	
       @Test
	public void LoginSuccesTest() {
    	 LoginPage pp=new LoginPage();
    	 pp.LoginFunction("Latapathange@gmail.com", "Pranu@123");
    	WebElement medicare=driver.findElement(By.xpath("//a[@class='navbar-brand']"));
    	Assert.assertEquals(medicare.getText(),"Medicare");  
    	System.out.println("Success message is "+ medicare.getText());
    	   
       }
     
      
}