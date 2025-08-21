package medicare;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import medicare_test.BaseClass;

public class AddToCartPage {
	WebDriver driver=BaseClass.driver;

	//============= Methods ===============
	
	public  AddToCartPage() {
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

public void AddToCart(String ProductName) {
	
	String ProductXpath= "//*[@id=\'productListTable\']/tbody/tr[1]/td[6]/a[2]/span[@class='glyphicon glyphicon-shopping-cart']";
	WebElement AddToCart = driver.findElement(By.xpath(ProductXpath));
	AddToCart.click();
	
}

}
