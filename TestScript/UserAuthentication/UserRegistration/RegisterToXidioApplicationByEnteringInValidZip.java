package UserAuthentication.UserRegistration;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import ConfigServices.AppProperties;
import Core.AnnotationFunctions.BaseTest;
import Core.UserRegistrationFunction.Scenario.UserRegistrationValidationFuncitons;

public class RegisterToXidioApplicationByEnteringInValidZip extends BaseTest{
	UserRegistrationValidationFuncitons userRegValFun=new UserRegistrationValidationFuncitons();
		
	@Test
	public void testRegisterToXidioApplicationWithEnteringInValidZip() throws Exception {
	driver.get(AppProperties.APPURL);
    driver.findElement(By.linkText("Register")).click();
    
   userRegValFun.validateInvalidZip(driver);
    
   driver.findElement(By.linkText("Next")).click();
   Thread.sleep(2000);
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Please enter only digits in Zip[\\s\\S]*$"));

  }
}
