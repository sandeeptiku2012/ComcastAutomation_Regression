package UserAuthentication.UserRegistration;

import Core.AnnotationFunctions.BaseTest;
import Core.UserRegistrationFunction.Scenario.UserRegistrationValidationFuncitons;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;

public class RegisterToXidioApplicationByEnteringInValidMobileNumber extends BaseTest{
	UserRegistrationValidationFuncitons userRegValFun=new UserRegistrationValidationFuncitons();
	
	@Test
	  public void testRegisterToXidioApplicationByEnteringInValidMobileNumber() throws Exception {
		driver.get("http://xidiotrial:Fhaze1@www.xidio.com");
	    driver.findElement(By.linkText("Register")).click();
	    
	    userRegValFun.validateInvalidMobileNumber(driver);
	    
	    driver.findElement(By.linkText("Next")).click();
	    Thread.sleep(2000);
	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Please enter a valid Mobile number[\\s\\S]*$"));
	  }
}
