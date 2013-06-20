package ProfileManagement.ChangePaymentInfo;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;

import ConfigServices.AppProperties;
import Core.AnnotationFunctions.BaseTest;
import Core.UserLoginFunctions.UserLoginFunctions;
import Core.UserRegistrationFunction.Scenario.UserRegistrationValidationFuncitons;

public class VefiryChangePaymentInfoDetailsUpdatedSuccessfully extends BaseTest{
	UserLoginFunctions userLogFun=new UserLoginFunctions();
	UserRegistrationValidationFuncitons userRegValFun=new UserRegistrationValidationFuncitons();
	@Test
	public void testVefiryChangePaymentInfoDetailsUpdatedSuccessfully() throws Exception {
	driver.get(AppProperties.APPURL);
	
	userLogFun.UserLoginCredentials(driver);
    
    driver.findElement(By.linkText(AppProperties._USER_NAME)).click();
    
    driver.findElement(By.linkText("Change payment info")).click();
    
    userRegValFun.UpdateCCExpiryMonth(driver);
    
    driver.findElement(By.name("commit")).click();
    
    assertEquals("", driver.findElement(By.cssSelector("img[alt=\"Comcast Labs, XIDIO\"]")).getText());
    driver.findElement(By.linkText("Sign out")).click();
  }
}
