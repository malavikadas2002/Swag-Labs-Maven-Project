package test_package;

import org.testng.annotations.Test;

import base_package.Base_class;

public class Payment_test extends Base_class {
	
	@Test (priority = 1)
	public void pagescreenshot() throws Exception
	{
		paymentobj.screenshotmthd();
	}

	@Test (priority = 2)
	public void completionmthd()
	{
		paymentobj.finishmthd();
	}
}
