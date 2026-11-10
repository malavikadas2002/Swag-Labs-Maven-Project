package test_package;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base_package.Base_class;

public class Login_test extends Base_class
{
	@Test(priority = 1)
	public void titleverificationmthd()
	{
		String actual_title = loginobj.titlemthd();
		Assert.assertEquals(actual_title, "Swag Labs");
	}
	
	@Test(priority = 2)
	public void loginvalidationmthd()
	{
		loginobj.loginmthd("standard_user", "secret_sauce");
	}
	
	@Test (priority = 3)
	public void urlvalidation()
	{
		String homeurl = loginobj.urlmthd();
		System.out.println(homeurl);
		//Assert.assertEquals(homeurl, "https://www.saucedemo.com/inventory.html");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlToBe("https://www.saucedemo.com/inventory.html"));
	}
	

}
