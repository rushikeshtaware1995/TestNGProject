package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObject;
import Resources.BaseClass;
import Resources.CommonUtilities;
import Resources.TestCaseData;

public class VerifyLoginTestCase extends BaseClass  {
//we have achived inheritance here 
@Test//to run we need main method but insted that we used @Test

public void	login() throws IOException {
	
	
	
	LoginPageObject lpo= new LoginPageObject (driver);//for call method we create obect/ lpo is shortform of=LoginPageObject 
	
	lpo.EnterUsername().sendKeys(TestCaseData.username);
	
	lpo.EnterPassword().sendKeys(TestCaseData.Password);
	
	
	
	
	lpo.ClickLogin().click();
	
	String expectedString= TestCaseData.expectedString;
	
	String actual= driver.findElement(By.xpath("//div[@id='error']")).getText();//we hv changed webelement to stringbcoz of gettext
	
	CommonUtilities.handleAssertions(actual,expectedString);
	
	
	
    SoftAssert assertion= new SoftAssert();
	
	assertion.assertEquals(actual, expectedString);
	
	assertion.assertAll();;//this is mandotry line 
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
