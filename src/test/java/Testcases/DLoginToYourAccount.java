package Testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Utilities.DataProviders;
import pages.HomePage;
import pages.LoginPage;

public class DLoginToYourAccount {
	
	
	
	
	@Test(dataProvider="Userdata",dataProviderClass=DataProviders.class)
	public void loginToYourAccount(String userName, String password) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
		Thread.sleep(5000);
		HomePage objHomepage=new HomePage(driver);
		objHomepage.clickSignuplink();
		LoginPage objsignupPage=new LoginPage(driver);
		objsignupPage.enterEmailAddress_login(userName);
		objsignupPage.enterPassword_login(password);
		objsignupPage.clickLogin();
		Thread.sleep(5000);
		
		driver.close();
		
	}

}
