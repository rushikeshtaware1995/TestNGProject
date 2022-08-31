package Resources;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseClass {
	
public WebDriver driver; //globally declared 
public  Properties prop;

public WebDriver browserLaunch() throws IOException {
	
	
	//This will help us to read data.properties file
FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
	                                          // we are using data.property path
	
// Thisn will access the data.properties
   prop=new Properties();

  prop.load(fis);
	
  String browserName=prop.getProperty("browser");
	
  if(browserName.equalsIgnoreCase("chrome") ) {
	  
  WebDriverManager.chromedriver().setup();//this will run latest browser in laptop
  
  //WebDriverManager.chromedriver.version("79.0.9').setup()//change version in bracket// thsi is for specific version
   
  
  driver= new ChromeDriver();
  
		 
  }else if(browserName.equalsIgnoreCase("firefox")) {
		   
  //FireFox code
		  }
   else if(browserName.equalsIgnoreCase("Edge")) {
		   
		//edge code
		  }
   else {
		  System.out.println("please select valid browser");
		   }
		 
		 
	return driver;	 
		 
}
@BeforeMethod

	public void launchBrowser() throws IOException {
	
	browserLaunch(); 

	driver.get(prop.getProperty("url"));
}
	@AfterMethod
	
   public void teardown() throws IOException {
	
	//driver.quit();














	}
}
