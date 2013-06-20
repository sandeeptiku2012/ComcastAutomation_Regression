package DataServices.UserRegistrationUsingComcast;

import org.junit.*;
import static org.junit.Assert.*;

import org.openqa.selenium.*;

import ConfigServices.AppProperties;
import ConfigServices.Utils.PropertyUtil;
import Core.AnnotationFunctions.BaseTest;
import Core.UserRegistrationFunction.Common.UserRegistrationFunction;

public class UserRegistrationUsingComcast extends BaseTest{
	UserRegistrationFunction userReg=new UserRegistrationFunction();
  
	@Test
	public void testUserRegistrationUsingComcast(WebDriver driver) throws Exception {
		PropertyUtil.modifyDataProperties();
		Thread.sleep(10000);
		
		driver.get(AppProperties.APPURL);
		Thread.sleep(4000);
	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Sign In[\\s\\S]*$"));
	    
	    driver.findElement(By.linkText("Register")).click();
	    
	    userReg.RegistrationDetails(driver);
	    
	    driver.findElement(By.linkText("Next")).click();
	    
	    driver.findElement(By.id("terms_conditions_accept")).click();
	    
	    userReg.CCDetials(driver);
	    
	    driver.findElement(By.cssSelector("a.btn.submit")).click();
	    
	    driver.findElement(By.linkText("Skip activation, go to XIDIO")).click();

	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*XIDIO[\\s\\S]*$"));

	    driver.findElement(By.linkText("Sign out")).click();  
  }
}

