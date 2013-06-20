package Comcast_Demo;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import ConfigServices.AppProperties;
import ConfigServices.Utils.PropertyUtil;
import Core.AnnotationFunctions.BaseTest;
import Core.UserLoginFunctions.UserLoginFunctions;
import Core.UserRegistrationFunction.Common.UserRegistrationFunction;
import Core.UserRegistrationFunction.Scenario.UserRegistrationValidationFuncitons;

public class DemoClass_MB extends BaseTest{
	UserRegistrationFunction userReg=new UserRegistrationFunction();
	UserLoginFunctions userLogin=new UserLoginFunctions();
	UserRegistrationValidationFuncitons userRegValFun=new UserRegistrationValidationFuncitons();
	
	@Test
	public void testUserRegistration() throws Exception {
	PropertyUtil.modifyDataProperties();
	Thread.sleep(10000);
	
	driver.get(AppProperties.APPURL);
	Thread.sleep(4000);
	
	// @Test
	 // public void testRegisterToXidioApplicationWithoutFirstName() throws Exception {
	    driver.findElement(By.linkText("Register")).click();
	    
	    userRegValFun.validateFirstName(driver);
	    
	    driver.findElement(By.linkText("Next")).click();
	    Thread.sleep(2000);
	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*First name is required[\\s\\S]*$"));
	    
	    driver.findElement(By.linkText("Back to frontpage")).click();
	    
        
    driver.findElement(By.linkText("Register")).click();
    
    userRegValFun.validateEmail(driver);
    
    driver.findElement(By.linkText("Next")).click();
    Thread.sleep(2000);
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Email is required[\\s\\S]*$"));
    
    driver.findElement(By.linkText("Back to frontpage")).click();
    
    driver.findElement(By.linkText("Register")).click();
    
    userReg.RegistrationDetails(driver);
    
    driver.findElement(By.linkText("Next")).click();
    
    driver.findElement(By.id("terms_conditions_accept")).click();
    
    userReg.CCDetials(driver);
    
    driver.findElement(By.cssSelector("a.btn.submit")).click();
    
    driver.findElement(By.linkText("Skip activation, go to XIDIO")).click();

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*XIDIO[\\s\\S]*$"));

    driver.findElement(By.linkText("Sign out")).click();  
//}
	//@Test
	  //public void testLoginToCamcast() throws Exception {
		  	//driver.get(AppProperties.APPURL);

    
    userLogin.UserLoginCredentials(driver);
    
    driver.findElement(By.linkText(AppProperties._USER_NAME)).click();
    
    driver.findElement(By.linkText("Change password")).click();
    driver.findElement(By.name("old_password")).clear();
    driver.findElement(By.name("old_password")).sendKeys(AppProperties._NONDIGIT_PASSWORD);
    
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys(AppProperties._RESET_PASSWORD);
    
    driver.findElement(By.name("confirm_password")).clear();
    driver.findElement(By.name("confirm_password")).sendKeys(AppProperties._INVALID_PASSWORD);
    
    driver.findElement(By.name("commit")).click();
    driver.findElement(By.cssSelector("#uniform-undefined > span")).click();
   
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Password has not been updated[\\s\\S]*$"));

		    userLogin.ChangePassword(driver);
		    
		    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Sign out[\\s\\S]*$"));
		   // driver.findElement(By.linkText("Sign out")).click();
	  //}
	
	//@Test
	  //public void testSearchVideoSubscriptionFeedback() throws Exception {
	//	driver.get(AppProperties.APPURL);
	//	Thread.sleep(2000);
		
		//userLogin.UserLoginCredentials(driver);
	       
	    //assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*XIDIO[\\s\\S]*$"));
	    assertEquals("", driver.findElement(By.xpath("//img[@alt='Comcast Labs, XIDIO']")).getText());
	    driver.findElement(By.id("search-query")).clear();
	    driver.findElement(By.id("search-query")).sendKeys(AppProperties._SEARCH_VIDEO_BY);
	    driver.findElement(By.id("go-search")).click();

	    driver.findElement(By.cssSelector("img[alt=\"African Cats\"]")).click();
	    
	    driver.findElement(By.linkText("Subscribe")).click();
	    
	    driver.findElement(By.name("pin_code")).clear();
	    driver.findElement(By.name("pin_code")).sendKeys(AppProperties._CC_PIN_CODE);
	    
	    driver.findElement(By.cssSelector("fieldset > input[type=\"submit\"]")).click();

	    //driver.findElement(By.linkText("Sign out")).click();
	  //}
	
	//@Test
	//public void testSearchSubscribedVideoAndUnsubscribe() throws Exception {
	//driver.get(AppProperties.APPURL);
	//Thread.sleep(2000);
	
	//userLogin.UserLoginCredentials(driver);
	
	driver.findElement(By.linkText("My Channels")).click();
    
    driver.findElement(By.id("search-query")).clear();
    driver.findElement(By.id("search-query")).sendKeys(AppProperties._SEARCH_VIDEO_BY);
    driver.findElement(By.id("go-search")).click();
    
    driver.findElement(By.cssSelector("img[alt=\"African Cats\"]")).click();
    driver.findElement(By.linkText("Unsubscribe")).click();
    
    //driver.findElement(By.cssSelector("fieldset.unsubscribed > input[type=\"submit\"]")).click();

    //driver.findElement(By.linkText("Sign out")).click();
//}
	//@Test
	//public void testfeedback() throws Exception{
	//driver.get(AppProperties.APPURL);
	//Thread.sleep(2000);
	//userLogin.UserLoginCredentials(driver);
	
    //assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*XIDIO[\\s\\S]*$"));
    //assertEquals("", driver.findElement(By.xpath("//img[@alt='Comcast Labs, XIDIO']")).getText());
    
    /*driver.findElement(By.id("search-query")).clear();
    driver.findElement(By.id("search-query")).sendKeys(AppProperties._SEARCH_VIDEO_BY);
    driver.findElement(By.id("go-search")).click();

    driver.findElement(By.cssSelector("img[alt=\"African Cats\"]")).click();
	    
	driver.findElement(By.linkText("Give Feedback")).click();
    driver.findElement(By.xpath("(//input[@name='Submit'])[2]")).click();

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Subject is required[\\s\\S]*$"));

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Message is required[\\s\\S]*$"));
    driver.findElement(By.xpath("(//input[@name='subject'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@name='subject'])[2]")).sendKeys(AppProperties._VIDEIO_KEY_NAME);
    
    driver.findElement(By.xpath("(//textarea[@name='message'])[2]")).clear();
    driver.findElement(By.xpath("(//textarea[@name='message'])[2]")).sendKeys("This video is wonderfull.");
    
    driver.findElement(By.xpath("(//input[@name='Submit'])[2]")).click();*/
    //driver.findElement(By.linkText("Sign out")).click();
    
//}
	//@Test
	 // public void testChangeProfile() throws Exception {
	//	driver.get(AppProperties.APPURL);
		//userLogin.UserLoginCredentials(driver);

	    //assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*XIDIO[\\s\\S]*$"));
    	Thread.sleep(4000);
	    driver.findElement(By.linkText(AppProperties._USER_NAME)).click();
	    driver.findElement(By.name("user[first_name]")).clear();
	    driver.findElement(By.name("user[first_name]")).sendKeys(AppProperties._UPD_FIRST_NAME);
	    driver.findElement(By.linkText("Save profile")).click();

	    Thread.sleep(4000);
	    //assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*XIDIO[\\s\\S]*$"));
	    driver.findElement(By.linkText(AppProperties._USER_NAME)).click();
	    Thread.sleep(4000);
	    //driver.findElement(By.linkText("Sign out")).click();
	 // }
	    
	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*User Account[\\s\\S]*$"));
	    driver.findElement(By.name("user[city]")).clear();
	    driver.findElement(By.name("user[city]")).sendKeys(AppProperties._UPD_CITY);
	    driver.findElement(By.linkText("Save profile")).click();
	    Thread.sleep(4000);
	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*XIDIO[\\s\\S]*$"));
	    driver.findElement(By.linkText(AppProperties._USER_NAME)).click();
	    assertEquals(AppProperties._UPD_CITY, driver.findElement(By.name("user[city]")).getAttribute("value"));

	//@Test
	//  public void testUserProfileChanges() throws Exception {
	//	driver.get(AppProperties.APPURL);
		
		//userLogin.UserLoginCredentials(driver);

	    //assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*XIDIO[\\s\\S]*$"));
	    Thread.sleep(2000);
	    driver.findElement(By.linkText(AppProperties._USER_NAME)).click();
	    
	    driver.findElement(By.linkText("Change payment info")).click();
	    
	    userRegValFun.UpdateCCDetials(driver);
	        
	    driver.findElement(By.cssSelector("#uniform-undefined > span")).click();
	    Thread.sleep(2000);
	    //assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*XIDIO[\\s\\S]*$"));
	    
	   // driver.findElement(By.linkText("Sign out")).click();
//}
	//@Test
	//public void testChangePinCode() throws Exception {
	//driver.get(AppProperties.APPURL);
		
	//userLogin.UserLoginCredentials(driver);
    
    driver.findElement(By.linkText(AppProperties._USER_NAME)).click();
    driver.findElement(By.linkText("Change pin code")).click();

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*User Account[\\s\\S]*$"));
    driver.findElement(By.name("cc_pin_code")).clear();
    driver.findElement(By.name("cc_pin_code")).sendKeys("5343");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("password");
    driver.findElement(By.name("commit")).click();
    //driver.findElement(By.cssSelector("div.right > #uniform-undefined > span")).click();
    Thread.sleep(2000);
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Pin code has not been updated[\\s\\S]*$"));
    driver.findElement(By.name("cc_pin_code")).clear();
    driver.findElement(By.name("cc_pin_code")).sendKeys(AppProperties._CC_PIN_CODE);
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys(AppProperties._PASSWORD);
    driver.findElement(By.name("commit")).click();
    Thread.sleep(2000);
    //assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*XIDIO[\\s\\S]*$"));
    //driver.findElement(By.linkText("Sign out")).click();
//}
	//@Test
	//public void testChangeActivationCode() throws Exception {
	//driver.get(AppProperties.APPURL);
	//userLogin.UserLoginCredentials(driver);
   // Thread.sleep(2000);
    driver.findElement(By.linkText(AppProperties._USER_NAME)).click();
    driver.findElement(By.linkText("Change activation code")).click();
    driver.findElement(By.name("user[activation_code]")).clear();
    driver.findElement(By.name("user[activation_code]")).sendKeys(AppProperties._ACTION_CODE);
    driver.findElement(By.linkText("Activate")).click();
    
    Thread.sleep(2000);
    driver.findElement(By.name("user[activation_code]")).clear();
    driver.findElement(By.linkText("Activate")).click();
    
    Thread.sleep(4000);
    driver.findElement(By.linkText("Skip activation, go to XIDIO")).click();

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*XIDIO[\\s\\S]*$"));
    driver.findElement(By.linkText("Sign out")).click();
}
private Object closeAlertAndGetItsText() {
	// TODO Auto-generated method stub
	return null;
}
}

