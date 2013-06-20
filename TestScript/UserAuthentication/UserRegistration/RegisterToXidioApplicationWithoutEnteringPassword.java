package UserAuthentication.UserRegistration;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.openqa.selenium.By;
import ConfigServices.AppProperties;
import Core.AnnotationFunctions.BaseTest;
import Core.UserRegistrationFunction.Scenario.UserRegistrationValidationFuncitons;

public class RegisterToXidioApplicationWithoutEnteringPassword extends BaseTest{
  UserRegistrationValidationFuncitons userRegValFun=new UserRegistrationValidationFuncitons();
  @Test
  public void testRegisterToXidioApplicationWithoutEnteringPassword() throws Exception {
    driver.get(AppProperties.APPURL);
    driver.findElement(By.linkText("Register")).click();
    
    userRegValFun.validatePassword(driver);
    
    driver.findElement(By.linkText("Next")).click();
    // Warning: assertTextPresent may require manual changes
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Password is required[\\s\\S]*$"));
  }
}
