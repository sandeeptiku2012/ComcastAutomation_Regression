package Core.UserRegistrationFunction.Common;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import ConfigServices.AppProperties;

public class UserRegistrationFunction{
	
	public void CCDetials(WebDriver driver) throws FileNotFoundException, IOException
	{
		driver.findElement(By.name("user[cc_number]")).clear();
	    driver.findElement(By.name("user[cc_number]")).sendKeys(AppProperties._CC_NUMBER);
	    new Select(driver.findElement(By.name("user[cc_expiration_month]"))).selectByVisibleText(AppProperties._CC_EXPIRY_MONTH);
	    driver.findElement(By.cssSelector("option[value=\"2\"]")).click();
	    driver.findElement(By.name("user[cc_security_code]")).clear();
	    driver.findElement(By.name("user[cc_security_code]")).sendKeys(AppProperties._CC_SECURITY_CODE);
	    driver.findElement(By.name("user[cc_pin_code]")).clear();
	    driver.findElement(By.name("user[cc_pin_code]")).sendKeys(AppProperties._CC_PIN_CODE);
	}
	
	public void RegistrationDetails(WebDriver driver)
	{
		driver.findElement(By.name("user[first_name]")).clear();
	    driver.findElement(By.name("user[first_name]")).sendKeys(AppProperties._FIRST_NAME);
	    driver.findElement(By.name("user[last_name]")).clear();
	    driver.findElement(By.name("user[last_name]")).sendKeys(AppProperties._LAST_NAME);
	    driver.findElement(By.name("user[address]")).clear();
	    driver.findElement(By.name("user[address]")).sendKeys(AppProperties._ADDRESS);
	    driver.findElement(By.name("user[city]")).clear();
	    driver.findElement(By.name("user[city]")).sendKeys(AppProperties._CITY);
	    new Select(driver.findElement(By.name("user[state]"))).selectByVisibleText("NY - New York");
	    driver.findElement(By.cssSelector("option[value=\"NY\"]")).click();
	    driver.findElement(By.name("user[zip]")).clear();
	    driver.findElement(By.name("user[zip]")).sendKeys(AppProperties._ZIP);
	    driver.findElement(By.name("user[email]")).clear();
	    driver.findElement(By.name("user[email]")).sendKeys(AppProperties._EMAIL);
	    driver.findElement(By.name("user[mobile_number]")).clear();
	    driver.findElement(By.name("user[mobile_number]")).sendKeys(AppProperties._MOBILE_NUMBER);
	    driver.findElement(By.name("user[password]")).clear();
	    driver.findElement(By.name("user[password]")).sendKeys(AppProperties._REG_PASSWORD);
	}
}
