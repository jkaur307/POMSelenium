package Testcases;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Utilities.ConfigReader;
import pages.HomePage;
import pages.LoginPage;
import pages.SignupPage;

public class NewUserSignup {
	
	public WebDriver driver;
	
	public ConfigReader config;
	public Properties prop;
	public HomePage objHomepage;
	public LoginPage objsignupPgae;
	public 	SignupPage objSignupPage;
	
	public  Logger  logger;
	
	@BeforeMethod
	public void setupmethod() throws IOException {
		config =new ConfigReader();
		prop=config.initProp();
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.get("https://automationexercise.com/");
		System.out.println(prop.getProperty("url"));
		driver.get(prop.getProperty("url"));
		
		///  logs
		logger=LogManager.getLogger(this.getClass());
		
	}
	

	
	@Test
	public void newUserSignup() throws InterruptedException {
		
		logger.info("i am  in  new user signnup  method");
		Faker faker=new Faker();

		Thread.sleep(5000);
		objHomepage=new HomePage(driver);
		objHomepage.clickSignuplink();
		objsignupPgae=new LoginPage(driver);
		objsignupPgae.enterName(faker.name().username());
		objsignupPgae.enterEmailID(faker.internet().safeEmailAddress());
		objsignupPgae.clickSignup();
		Thread.sleep(5000);
		objSignupPage=new SignupPage(driver);
		objSignupPage.clickGender1();
		objSignupPage.enterPassword("Hello123*");
		objSignupPage.enterDays("1");
		objSignupPage.enterMonths("12");
		objSignupPage.enterYears("2024");
		objSignupPage.enterFirstName(faker.name().firstName());

		logger.info("First Name"+faker.name().firstName());

		
		
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
		logger.info("ennd ing this test case");
		
	
	}
	
	
	@AfterMethod()
    public void teardown() {
		
		if(driver!=null) {
			driver.close();
		}
    	
    	
    	
    }

}
