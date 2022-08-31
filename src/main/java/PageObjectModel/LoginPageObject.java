package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {// store all xpath here 
	//this driver dont have scope 
	public WebDriver  driver;
	
//driver.findElement(By.xpath("").sendkeys();	

// we have achived encapsulation here 
 private By username = By.xpath("//input[@id='username']");	//decalre private-use-encapsulation-opps concept
	
 private By password = By.xpath("//input[@id='password']");	//private access within that class only 
	
 private By LoginButton=By.xpath("//input[@id='Login']");	
	
 private By  TryForFree = By.xpath("//a[@id='signup_link']");

	//giving scope to driver by using this//this means this class
	


	public LoginPageObject(WebDriver driver2) {
	this.driver =driver2;
}

	public WebElement EnterUsername() {
		
	return driver.findElement(username);//need to return so remove void above 
}
	
	public WebElement EnterPassword() {
		
	return driver.findElement(password);
}

    public WebElement ClickLogin() {
	return driver.findElement(LoginButton);
}
	
    public WebElement ClickOnTryForFree () {
    return driver.findElement( TryForFree );
}
	
	
	
	
	
	
	
}
