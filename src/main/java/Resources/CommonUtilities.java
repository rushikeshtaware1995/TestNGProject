package Resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CommonUtilities {
	
	//This is common method for dropdown handling
	 public static void dropdwonHandle(WebElement dropdwonXpath, int  dropdownvalue   ) {// pass parameter 
	  
	   Select s=new Select(dropdwonXpath);
	   
	   s.selectByIndex(dropdownvalue);//this should be dynamic 
	   s.selectByIndex( dropdownvalue);
	   
	   
	  //s.selectByValue(dropdownvalue1);
	   
	 }
	 
	 public static void handleAssertions(String actual, String expected) {
		 
		SoftAssert assertion= new SoftAssert();
			
	    assertion.assertEquals(actual, expected);
			
			
		assertion.assertAll();;//this is mandotry line  
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	 }
	 
	 

}
