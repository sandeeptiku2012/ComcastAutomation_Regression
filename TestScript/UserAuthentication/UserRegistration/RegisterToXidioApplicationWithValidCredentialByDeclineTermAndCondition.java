package UserAuthentication.UserRegistration;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import Core.AnnotationFunctions.BaseTest;
import Core.UserRegistrationFunction.Common.UserRegistrationFunction;

public class RegisterToXidioApplicationWithValidCredentialByDeclineTermAndCondition extends BaseTest{
	UserRegistrationFunction urf=new UserRegistrationFunction();
	
  @Test
  public void testRegistrationToXidioApplicationWithValidCredentialByDeclingTermAndCondition() throws Exception {
	driver.get("http://xidiotrial:Fhaze1@www.xidio.com");
	driver.findElement(By.linkText("Register")).click();
    
	//Calling UserRegistration Function
    urf.RegistrationDetails(driver);
    
    driver.findElement(By.linkText("Next")).click();
    driver.findElement(By.id("terms_conditions_decline")).click();
    Thread.sleep(2000);
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*You have to agree to terms and conditions[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
  }
}

