package medicare_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import medicare.LoginPage;

public class LoginFailure extends BaseClass {
	
	  @Test
		public void LoginFailureTest() {
	    	   LoginPage pf=new LoginPage();
	    	   pf.LoginFunction("Latapathange@gmail.com", "pranu@123");
	    	  
	  	     WebElement Error=driver.findElement(By.xpath("//*[starts-with(text(),'Username and Password is invalid!')]"));
			 Assert.assertEquals( Error.getText(),"Username and Password is invalid!" );
			 System.out.println("Error message is "+ Error.getText());
		}
	      
}
