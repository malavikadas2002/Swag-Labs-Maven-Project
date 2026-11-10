package test_package;

import org.testng.Assert;
import org.testng.annotations.Test;

import base_package.Base_class;

public class Cart_test extends Base_class{
	
	@Test (priority = 1)
	public void cartclickmthd() throws Exception
	{
		cartobj.cartclick();
	}
	
	@Test(priority = 2)
	public void carttextverification()
	{
		String carttitle = cartobj.carttext();
		Assert.assertEquals(carttitle, "Your Cart");
	}
	
	@Test (priority = 3)
	public void checkoutmthd() throws Exception
	{
		cartobj.checkoutclickmthd();
	}

}
