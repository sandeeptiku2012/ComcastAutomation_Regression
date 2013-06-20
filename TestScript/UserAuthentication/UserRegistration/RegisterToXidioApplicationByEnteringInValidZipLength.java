package UserAuthentication.UserRegistration;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;

import ConfigServices.AppProperties;
import Core.AnnotationFunctions.BaseTest;
import Core.UserRegistrationFunction.Scenario.UserRegistrationValidationFuncitons;

public class RegisterToXidioApplicationByEnteringInValidZipLength extends BaseTest{
	 UserRegistrationValidationFuncitons userRegValFun=new UserRegistrationValidationFuncitons();
	 
  @Test
  public void testRegisterToXidioApplicationWithEnteringInValidZip() throws Exception {
	driver.get(AppProperties.APPURL);
    driver.findElement(By.linkText("Register")).click();
    
    userRegValFun.validateInvalidZipLength(driver);
    
    driver.findElement(By.linkText("Next")).click();
    Thread.sleep(2000);
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Please enter Zip code 5 characters long[\\s\\S]*$"));
    driver.findElement(By.name("user[zip]")).clear();
    driver.findElement(By.name("user[zip]")).sendKeys("zipco");
  }
}

