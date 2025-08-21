package medicare_test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import medicare.AddToCartPage;
import medicare.LoginPage;

public class AddToCartTwo extends BaseClass {
	@Test
	public void AddToCartTestTwo() {
	  	   LoginPage pn=new LoginPage();
	  	   pn.LoginFunction("Latapathange@gmail.com","Pranu@123");
	  	
	  	  WebElement  ViewProduct=driver.findElement(By.xpath("//a[text()='View Products']"));
	  	  
	  	 System.out.println(ViewProduct.getText());
	  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	  	 ViewProduct.click();
	  	 AddToCartPage ad=new  AddToCartPage();
	  	 ad.AddToCart("Paracetamol");
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
    WebElement Check=driver.findElement(By.xpath("//a[text()='Checkout ']"));
    Check.click();
    WebElement check=driver.findElement(By.xpath("//h4[text()='Select Shipping Address']"));
    Assert.assertEquals(check.getText(),"Select Shipping Address");  
	System.out.println("Success message is "+check.getText() );
	   
}
	
}
