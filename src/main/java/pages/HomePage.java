package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.WebBase;

public class HomePage extends WebBase {
	// step 1: initalization webdriver
	
	//public WebDriver driver;
	
	//Step 3: initlize the webElments of the particular page



	//private By linkSignup =By.xpath("//a[normalize-space()='Signup / Login']");
	
	@FindBy(xpath="//a[normalize-space()='Signup / Login']")
	WebElement linkSignup;
    
   // Step 2: creating constructor and initalize the web driver
    
	/*public HomePage(WebDriver driver) {
		this.driver=driver;
		
	}*/
	
	
    public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	//step 4: we are creating the action methods
	public void clickSignuplink() {
		linkSignup.click();
	}

}
