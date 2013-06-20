package VideoManagement.VideoSearchFunctionality.FeedBack;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import Core.AnnotationFunctions.BaseTest;
import Core.UserLoginFunctions.UserLoginFunctions;

public class VerifyFeedbackSubmitedSuccessfully extends BaseTest{
  UserLoginFunctions userLogin=new UserLoginFunctions();
  
  @Test
  public void testVerifyFeedbackSubmitedSuccessfully() throws Exception {
    
	driver.get("http://xidiotrial:Fhaze1@www.xidio.com");
    
    driver.findElement(By.name("user[user_name]")).clear();
    driver.findElement(By.name("user[user_name]")).sendKeys("test25@test.com");
    driver.findElement(By.name("user[password]")).clear();
    driver.findElement(By.name("user[password]")).sendKeys("Password@1");
    driver.findElement(By.id("user_login")).click();
	
    driver.findElement(By.name("old_password")).clear();
    driver.findElement(By.name("old_password")).sendKeys("Password@1");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("Password@1");
    driver.findElement(By.name("commit")).click();
	driver.findElement(By.cssSelector("#uniform-undefined > span")).click();
    driver.findElement(By.name("confirm_password")).clear();
    driver.findElement(By.name("confirm_password")).sendKeys("Password@1");
    driver.findElement(By.cssSelector("img[alt=\"Ocean Life\"]")).click();
    driver.findElement(By.linkText("Give Feedback")).click();
    // Warning: assertTextPresent may require manual changes
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Give feedback to the publisher[\\s\\S]*$"));
    driver.findElement(By.xpath("(//input[@name='subject'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@name='subject'])[2]")).sendKeys("Feedback");
    driver.findElement(By.xpath("(//textarea[@name='message'])[2]")).clear();
    driver.findElement(By.xpath("(//textarea[@name='message'])[2]")).sendKeys("This video is nice one.");
    driver.findElement(By.xpath("(//input[@name='Submit'])[2]")).click();
    driver.findElement(By.linkText("Sign out")).click();
    assertEquals("Thanks for your valuable feedback. Your feedback has been communicated to the Publisher", closeAlertAndGetItsText());
  }

  	private String closeAlertAndGetItsText() {
    boolean acceptNextAlert = false;
	try {
      Alert alert = driver.switchTo().alert();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alert.getText();
    } finally {
      acceptNextAlert = true;
    }
  }
}

