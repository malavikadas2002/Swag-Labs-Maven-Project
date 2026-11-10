package test_package;

import org.testng.Assert;
import org.testng.annotations.Test;

import base_package.Base_class;

public class Home_test extends Base_class
{
	
	@Test(priority = 1)
	public void textverification()
	{
		//loginobj.loginmthd("standard_user", "secret_sauce");	//calls the login method before executing home page method
		String producttext = homeobj.textmthd();
		Assert.assertEquals(producttext, "Products");
	}
	
	@Test(priority = 2)
	public void linkcountmthd()
	{
		int linkcount = homeobj.linkmthd();
		System.out.println("No. of links = "+linkcount);
	}
	
	@Test (priority = 3)
	public void cartclick()
	{
		homeobj.cartmthd();
	}

}
