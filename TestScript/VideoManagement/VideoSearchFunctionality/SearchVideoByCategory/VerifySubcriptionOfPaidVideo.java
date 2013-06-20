package VideoManagement.VideoSearchFunctionality.SearchVideoByCategory;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import Core.AnnotationFunctions.BaseTest;

public class VerifySubcriptionOfPaidVideo extends BaseTest{
  
  @Test
  public void testVerifySubcriptionOfPaidVideo() throws Exception {
	driver.get("http://xidiotrial:Fhaze1@www.xidio.com");
	
    driver.findElement(By.name("user[user_name]")).clear();
    driver.findElement(By.name("user[user_name]")).sendKeys("test24@test.com");
    driver.findElement(By.name("user[password]")).clear();
    driver.findElement(By.name("user[password]")).sendKeys("Password@1");
    driver.findElement(By.id("user_login")).click();
    
    driver.findElement(By.id("search-query")).clear();
    driver.findElement(By.id("search-query")).sendKeys("Norcal Publishing");
    driver.findElement(By.id("go-search")).click();
    
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Results for 'Norcal Publishing '[\\s\\S]*$"));
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Norcal Publishing[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.cssSelector("img[alt=\"African Cats\"]")).click();
    driver.findElement(By.linkText("Subscribe")).click();
    driver.findElement(By.name("pin_code")).clear();
    driver.findElement(By.name("pin_code")).sendKeys("1234");
    driver.findElement(By.cssSelector("fieldset > input[type=\"submit\"]")).click();

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*You have been subscribed\\.[\\s\\S]*$"));

    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*It's all in the family[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Unsubscribe[\\s\\S]*$"));
    driver.findElement(By.linkText("My Channels")).click();

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*\r\nIt's all in the family [\\s\\S]*$"));
    driver.findElement(By.linkText("Sign out")).click();
  }
}

