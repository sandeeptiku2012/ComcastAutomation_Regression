package UserAuthentication.UserRegistration;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;

import ConfigServices.AppProperties;
import Core.AnnotationFunctions.BaseTest;
import Core.UserRegistrationFunction.Scenario.UserRegistrationValidationFuncitons;

public class RegisterToXidioApplicationByEnteringInValidLengthOfPassword extends BaseTest{
 UserRegistrationValidationFuncitons userRegValFun=new UserRegistrationValidationFuncitons();
	
 @Test
  public void testRegisterToXidioApplicationByEnteringInValidLengthOfPassword() throws Exception {
	driver.get(AppProperties.APPURL);
    driver.findElement(By.linkText("Register")).click();
       
    userRegValFun.validateLengthOfPassword(driver);
    
    driver.findElement(By.linkText("Next")).click();
    Thread.sleep(2000);
    //assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Please enter at least 8 characters in Password[\\s\\S]*$"));
    
  }
}
