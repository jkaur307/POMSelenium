package Testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pages.HomePage;
import pages.LoginPage;
import pages.SignupPage;

public class NewUserSignup {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setupmethod() {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
		
	}
	
	
	
	@Test
	public void newUserSignup() throws InterruptedException {
		
		Faker faker=new Faker();

		Thread.sleep(5000);
		HomePage objHomepage=new HomePage(driver);
		objHomepage.clickSignuplink();
		LoginPage objsignupPgae=new LoginPage(driver);
		objsignupPgae.enterName(faker.name().username());
		objsignupPgae.enterEmailID(faker.internet().safeEmailAddress());
		objsignupPgae.clickSignup();
		Thread.sleep(5000);
		SignupPage objSignupPage=new SignupPage(driver);
		objSignupPage.clickGender1();
		objSignupPage.enterPassword("Hello123*");
		objSignupPage.enterDays("1");
		objSignupPage.enterMonths("12");
		objSignupPage.enterYears("2024");
		objSignupPage.enterFirstName(faker.name().firstName());
		objSignupPage.enterLastName(faker.name().lastName());
		objSignupPage.enterCompany("walmart");
		objSignupPage.enterAddress1(faker.address().fullAddress());
		objSignupPage.selectCountry("USA");
		objSignupPage.enterState("Ohio");
		objSignupPage.enterCity("Centerville");
		objSignupPage.enterZipCode("45458");
		objSignupPage.enterMobileNumber("9056789876");
		objSignupPage.clickCreateAccount();
		
		Thread.sleep(5000);
		
		
	
	}
	
	
	@AfterMethod()
    public void teardown() {
		
		if(driver!=null) {
			driver.close();
		}
    	
    	
    	
    }

}
