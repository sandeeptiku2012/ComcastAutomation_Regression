package UserAccountManagement;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

import ConfigServices.AppProperties;
import Core.AnnotationFunctions.BaseTest;
import Core.UserLoginFunctions.UserLoginFunctions;
import Core.UserRegistrationFunction.Scenario.UserRegistrationValidationFuncitons;

/**  ChangeCreditCardDetails
 * This test case validates payment Details updation feature by
 * logging registered user into Comcast application.
 * **/

public class ChangeCreditCardDetails extends BaseTest{
	UserLoginFunctions userLogin=new UserLoginFunctions();
	UserRegistrationValidationFuncitons userRegValFun=new UserRegistrationValidationFuncitons();
	@Test
	  public void testUserProfileChanges() throws Exception {
		driver.get(AppProperties.APPURL);
		
		userLogin.UserLoginCredentials(driver);

	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*XIDIO[\\s\\S]*$"));
	    driver.findElement(By.linkText(AppProperties._USER_NAME)).click();
	    
	    driver.findElement(By.linkText("Change payment info")).click();
	    
	    userRegValFun.UpdateCCDetials(driver);
	        
	    driver.findElement(By.cssSelector("#uniform-undefined > span")).click();
	    
	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*XIDIO[\\s\\S]*$"));
	    
	    driver.findElement(By.linkText("Sign out")).click();
}
}

