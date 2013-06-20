package UserAuthentication.UserRegistration;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;

import ConfigServices.AppProperties;
import Core.AnnotationFunctions.BaseTest;
import Core.UserRegistrationFunction.Common.UserRegistrationFunction;

public class RegisterToXidioApplicationBySkipingPaymentStepAndActivationStep extends BaseTest{
	UserRegistrationFunction urf=new UserRegistrationFunction();
	
	@Test
  public void testRegistrationToXidioApplicationBySkipingPaymentStepAndActivationStep() throws Exception {
	driver.get("http://xidiotrial:Fhaze1@www.xidio.com");
	driver.findElement(By.linkText("Register")).click();
	
	//Calling UserRegistration Function
    urf.RegistrationDetails(driver);
    
    driver.findElement(By.linkText("Next")).click();
    
    driver.findElement(By.id("terms_conditions_accept")).click();
    driver.findElement(By.linkText("Skip this step")).click();
    driver.findElement(By.linkText("Skip activation, go to XIDIO")).click();
    Thread.sleep(2000);
    assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Comcast Labs, XIDIO\"]")).getText());
    assertTrue(isElementPresent(By.linkText(AppProperties._EMAIL)));
    driver.findElement(By.linkText("Sign out")).click();
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }
}

