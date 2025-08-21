package medicare_test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseClass {
public static WebDriver driver;
	
	@BeforeMethod
	public void SetUp() {

				
		 
	    driver = new ChromeDriver();
		driver.get("http://localhost:8081/medicare/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	@AfterMethod
	public void TearDown() {
//		driver.quit();	
	}


}
