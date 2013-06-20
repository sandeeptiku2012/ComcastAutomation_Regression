package Core.AnnotationFunctions;

import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import ConfigServices.AppProperties;
import ConfigServices.Utils.PropertyUtil;

public class BaseTest {
	
	public WebDriver driver;
	public String baseUrl;
	public StringBuffer verificationErrors = new StringBuffer();
	
	/*Before Annotation  for Web Driver Test cases.*/
	  @Before
	  public void setUp() throws Exception {
		  
		  String Browser=AppProperties.BROWSER;
			 if(Browser.equalsIgnoreCase("firefox"))
				 driver = new FirefoxDriver();
			 else if(Browser.equalsIgnoreCase("InternetExplorer"))
				 driver=new InternetExplorerDriver();
			 else if(Browser.equalsIgnoreCase("chrome"))
			 {
				 System.setProperty("webdriver.chrome.driver", "\\chromedriver.exe");
			 		driver=new ChromeDriver();
			 }
			 else if(Browser.equalsIgnoreCase("safari"))
				driver=new SafariDriver();
			 else
				 driver = new FirefoxDriver();
			 
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
	  }
	  
	/*After Annotation  for Web Driver Test cases.*/
	  @After
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	    /*To run Test Cases on Multiple Browers Un commnet the below line*/ 
	    //PropertyUtil.ChangeBrowser();
	  }
}
