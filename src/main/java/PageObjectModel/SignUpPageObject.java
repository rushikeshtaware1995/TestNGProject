package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObject {
	
	
	public WebDriver  driver;
	
	//driver.findElement(By.xpath("").sendkeys();	

	// we have achived encapsulation here 
	 private By FirstName = By.xpath("//input[@name='UserFirstName']");	//decalre private-use-encapsulation-opps concept
		
	 private By JobTitle = By.xpath("//select[@name='UserTitle']");	//private access within that class only 

     private By Employ= By.xpath("//select[@name='CompanyEmployees']");
     
     private By LastName= By.xpath("//input[@name='UserLastName']");
     
     private By Email= By.xpath("//input[@name='UserEmail']");
     
     private By CompanyName = By.xpath("//input[@name='CompanyName']");
     
     private By UserPhone= By.xpath("//input[@name='UserPhone']");
     
     private By Country= By.xpath("//select[@name='CompanyCountry']");
     
   
     
    // private By Country = By.xpath("//option[@value='IN']");
     
   
   
     
     
	 public SignUpPageObject(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		 this.driver=driver2;
	}


	public WebElement EnterFirstName() {
			
	return driver.findElement(FirstName);

	 }
	 public WebElement LastName() {
			
			return driver.findElement(LastName);
}		 
	 

	 public WebElement Email() {
			
			return driver.findElement(Email);
}		 	 	 
	 

	 public WebElement SelectJobTitle() {
			
	return driver.findElement(JobTitle);
}
	 

	 public WebElement CompanyName() {
			
			return driver.findElement(CompanyName); 
	 
	 } 
	 
	 public WebElement SelectEmployees() {
			
			return driver.findElement(Employ);
}	
	 
	 public WebElement UserPhone() {
			
			return driver.findElement(UserPhone);
}		 	 

	 public WebElement Country () {
			
			return driver.findElement(Country);	 	 
	 
	 
	 }	 
}
