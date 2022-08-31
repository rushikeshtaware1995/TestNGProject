package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import PageObjectModel.SignUpPageObject;
import Resources.BaseClass;
import Resources.CommonUtilities;
import Resources.TestCaseData;

public class VerifySignUpTestCase extends BaseClass {
	@Test
	
	public void signUp() throws IOException, InterruptedException {
		
	
		
	LoginPageObject lpo= new LoginPageObject (driver);	
		
	lpo.ClickOnTryForFree().click();
	
	Thread.sleep(5000);
	
	String actualTitle=driver.getTitle();
	
	String expectedTitle=TestCaseData.expectedTitle;
	
	CommonUtilities.handleAssertions(actualTitle, expectedTitle);
			
	
	
	SignUpPageObject spo= new SignUpPageObject(driver);
	
	spo.EnterFirstName().sendKeys(TestCaseData.FirstName);
	
	spo.LastName().sendKeys(TestCaseData.LastName);
	
	
	spo.Email().sendKeys(TestCaseData.Email);
	
    spo.CompanyName().sendKeys(TestCaseData.CompanyName);
    
    spo.UserPhone().sendKeys(TestCaseData.UserPhone);
    
    CommonUtilities.dropdwonHandle(spo.SelectJobTitle(),1);
    
    //Select s= new Select(spo.SelectJobTitle());
	
   //s.selectByIndex(1);//sales manager @ index 1
	
   // CommonUtilities.dropdwonHandle(spo.CompanyName(),2);
    
    Select s1= new Select(spo.SelectEmployees());	
	s1.selectByIndex(2);
	
   CommonUtilities.dropdwonHandle(spo.Country(),4);
    
	//Select s2= new Select(spo.Country());	
	//s2.selectByIndex(4);
    
	
	
	
	}
	

	
	
	
	
	

}
