package Testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class LoginToYourAccount {
	
	
	
	
	@Test
	public void loginToYourAccount() throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
		Thread.sleep(5000);
		HomePage objHomepage=new HomePage(driver);
		objHomepage.clickSignuplink();
		LoginPage objsignupPage=new LoginPage(driver);
		objsignupPage.enterEmailAddress_login("abc@gmail.com");
		objsignupPage.enterPassword_login("welcome@123");
		objsignupPage.clickLogin();
		Thread.sleep(5000);
		
		driver.close();
		
	}

}
