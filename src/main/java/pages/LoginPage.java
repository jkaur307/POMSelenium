package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.WebBase;

public class LoginPage extends WebBase{
   // step 1:
	//public WebDriver driver;
	
	
	//Step 3: initlize the webElments of the particular page
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	//private By txtName =By.xpath("//input[@placeholder='Name']");
	//private By txtEmail =By.xpath("//input[@data-qa='signup-email']");
	//private By btnSignup=By.xpath("//button[normalize-space()='Signup']");
	@FindBy(xpath="//input[@placeholder='Name']")
	WebElement txtName;
	
	@FindBy(xpath="//input[@data-qa='signup-email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//button[normalize-space()='Signup']")
	WebElement btnSignup;
	
	
	
	
	
	
	
	//Jatinder
//	private By txtEmailAddress_login =By.xpath("//input[@data-qa='login-email']");
//	private By txtPassword =By.xpath("//input[@placeholder='Password']");
//	private By btnLogin=By.xpath("//button[normalize-space()='Login']");
	
	
	@FindBy(xpath="//input[@data-qa='login-email']")
	WebElement txtEmailAddress_login;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement btnLogin;
	
	// Step 2: creating constructor and initalize the web driver
    
	/*public LoginPage(WebDriver driver) {
		this.driver=driver;
		
	}*/
	
	
	
	
	//step 4: we are creating the action methods
	public void enterName(String Name) {
		txtName.sendKeys(Name);
	}
	
	
	public void enterEmailID(String emailID) {
		txtEmail.sendKeys(emailID);
	}
	
	
	public void clickSignup() {
		btnSignup.click();
	}
	

	public void enterEmailAddress_login(String EmailAddress) {
		txtEmailAddress_login.sendKeys(EmailAddress);
		
	}
	
	public void enterPassword_login(String Password) {
		txtPassword.sendKeys(Password);
		
	}
	
	
	public void clickLogin() {
		btnLogin.click();
	}
}
