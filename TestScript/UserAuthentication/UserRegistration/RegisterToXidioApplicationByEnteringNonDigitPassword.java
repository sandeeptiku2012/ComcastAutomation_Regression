package UserAuthentication.UserRegistration;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import Core.AnnotationFunctions.BaseTest;
import Core.UserRegistrationFunction.Scenario.UserRegistrationValidationFuncitons;

public class RegisterToXidioApplicationByEnteringNonDigitPassword extends BaseTest{
  UserRegistrationValidationFuncitons userRegValFun=new UserRegistrationValidationFuncitons();
  
  @Test
  public void testRegisterToXidioApplicationByEnteringInValidPassword() throws Exception {
    driver.get(baseUrl + "/login");
    driver.findElement(By.linkText("Register")).click();
    
    userRegValFun.validateNonDigitPassword(driver);
    
	driver.findElement(By.linkText("Next")).click();
    Thread.sleep(2000);
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Password should contain at least one digit\\.[\\s\\S]*$"));

  }
}

