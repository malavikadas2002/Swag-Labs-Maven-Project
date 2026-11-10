package test_package;

import org.testng.annotations.Test;

import base_package.Base_class;

public class Checkout_test extends Base_class{
	
	@Test
	public void checkoutmthd() throws Exception
	{
		checkoutobj.checkoutdetails();
	}

}
