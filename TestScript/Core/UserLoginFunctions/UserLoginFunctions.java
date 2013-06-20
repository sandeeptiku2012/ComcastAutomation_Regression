package Core.UserLoginFunctions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ConfigServices.AppProperties;

public class UserLoginFunctions {

	public void UserLoginCredentials(WebDriver driver)
	{
	    driver.findElement(By.name("user[user_name]")).clear();
	    driver.findElement(By.name("user[user_name]")).sendKeys(AppProperties._USER_NAME);
	    driver.findElement(By.name("user[password]")).clear();
	    driver.findElement(By.name("user[password]")).sendKeys(AppProperties._PASSWORD);
	    driver.findElement(By.id("user_login")).click();
	}
	
	public void ChangePassword(WebDriver driver)
	{
		//Start password change.
	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*User Account[\\s\\S]*$"));
	    driver.findElement(By.name("old_password")).clear();
	    driver.findElement(By.name("old_password")).sendKeys(AppProperties._PASSWORD);
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys(AppProperties._RESET_PASSWORD);
	    driver.findElement(By.name("confirm_password")).clear();
	    driver.findElement(By.name("confirm_password")).sendKeys(AppProperties._CONFIRM_PASSWORD);
	    driver.findElement(By.name("commit")).click();
	    //driver.findElement(By.cssSelector("#uniform-undefined > span")).click();
	    //end password change.
	}
}
