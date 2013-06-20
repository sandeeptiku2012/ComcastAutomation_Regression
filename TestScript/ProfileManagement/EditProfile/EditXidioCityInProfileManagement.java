package ProfileManagement.EditProfile;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;

import ConfigServices.AppProperties;
import Core.AnnotationFunctions.BaseTest;
import Core.UserLoginFunctions.UserLoginFunctions;

public class EditXidioCityInProfileManagement extends BaseTest{
	UserLoginFunctions userLogin=new UserLoginFunctions();
	
	@Test
  public void testEditXidioCityInProfileManagement() throws Exception {
	
	driver.get("http://xidiotrial:Fhaze1@www.xidio.com");

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Sign In[\\s\\S]*$"));
    
    userLogin.UserLoginCredentials(driver);
     
    driver.findElement(By.linkText(AppProperties._USER_NAME)).click();

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*User Account[\\s\\S]*$"));
    driver.findElement(By.name("user[city]")).clear();
    driver.findElement(By.name("user[city]")).sendKeys(AppProperties._UPD_CITY);
    driver.findElement(By.linkText("Save profile")).click();

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*XIDIO[\\s\\S]*$"));
    driver.findElement(By.linkText(AppProperties._USER_NAME)).click();
    assertEquals(AppProperties._UPD_CITY, driver.findElement(By.name("user[city]")).getAttribute("value"));
    driver.findElement(By.linkText("Sign out")).click();
  }
}
