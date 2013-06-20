package UserAuthentication.UserRegistration;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;

import Core.AnnotationFunctions.BaseTest;
import Core.UserRegistrationFunction.Scenario.UserRegistrationValidationFuncitons;

public class RegisterToXidioApplicationWithoutEnteringLastName extends BaseTest{
	UserRegistrationValidationFuncitons userRegValFun=new UserRegistrationValidationFuncitons();
	
  @Test
  public void testRegisterToXidioApplicationWithoutLastName() throws Exception {
    driver.get("http://xidiotrial:Fhaze1@www.xidio.com");
    driver.findElement(By.linkText("Register")).click();
    
    userRegValFun.validateLastName(driver);
    
    driver.findElement(By.linkText("Next")).click();
    Thread.sleep(2000);
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Last name is required[\\s\\S]*$"));
  }
}
