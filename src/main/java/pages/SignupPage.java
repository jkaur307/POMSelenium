package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.WebBase;

public class SignupPage extends WebBase {
	
	
	@FindBy(xpath="//input[@id='id_gender1']")
	WebElement rbGender1;
	
	@FindBy(xpath="//input[@id='id_gender2']")
	WebElement rbGender2;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement txtPassword1;
	
	@FindBy(xpath="//select[@id='days']")
	WebElement dpDays;
	
	@FindBy(xpath="//select[@id='months']")
	WebElement dpMonths;
	
	@FindBy(xpath="//select[@id='years']")
	WebElement dpYears;
	
	@FindBy(xpath="//input[@id='first_name']")
	WebElement txtFirstName;
	
	@FindBy(xpath="//input[@id='last_name']")
	WebElement txtLastName;
	
	@FindBy(xpath="//input[@id='company']")
	WebElement txtCompany;
	
	@FindBy(xpath="//input[@id='address1']")
	WebElement txtAddress1;
	
	@FindBy(xpath="//select[@id='country']")
	WebElement dpdCountry;
	
	@FindBy(xpath="//input[@id='state']")
	WebElement txtState;
	
	@FindBy(xpath="//input[@id='city']")
	WebElement txtCity;
	
    @FindBy(xpath="//input[@id='zipcode']")
	WebElement txtZipCode;
    
    @FindBy(xpath="//input[@id='mobile_number']")
   	WebElement txtMobileNumber;
    
    @FindBy(xpath="//button[normalize-space()='Create Account']")
	WebElement btnCreateAccount;
    

	public SignupPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void clickGender1() {
		rbGender1.click();
	}
	
	public void clickGender2() {
		rbGender2.click();
	}
	
	public void enterPassword(String Password ) {
		txtPassword1.sendKeys(Password);
		}
	
	public void enterDays(String Days ) {
		dpDays.sendKeys(Days);
		}

	public void enterMonths(String Months ) {
		dpMonths.sendKeys(Months);
		}
	
	public void enterYears(String Years ) {
		dpYears.sendKeys(Years);
		}
	
	public void enterFirstName(String FirstName ) {
		txtFirstName.sendKeys(FirstName);
		}
	
	public void enterLastName(String LastName ) {
		txtLastName.sendKeys(LastName);
		}
	
	public void enterCompany(String Company ) {
		txtCompany.sendKeys(Company);
		}
	
	public void enterAddress1(String Address1 ) {
		txtAddress1.sendKeys(Address1);
		}
	
	public void selectCountry(String Country ) {
		dpdCountry.sendKeys(Country);
		}
	
	public void enterState(String State ) {
		txtState.sendKeys(State);
		}
	
	public void enterCity(String City ) {
		txtCity.sendKeys(City);
		}
	
	public void enterMobileNumber(String MobileNumber ) {
		txtMobileNumber.sendKeys(MobileNumber);
		}
	
	public void enterZipCode(String ZipCode ) {
		txtZipCode.sendKeys(ZipCode);
		}
	
	public void clickCreateAccount() {
		btnCreateAccount.click();
		}
	
}
	