package base_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import page_package.Cart_page;
import page_package.Checkout_page;
import page_package.Home_page;
import page_package.Login_page;
import page_package.Payment_page;

public class Base_class {
	
	public static WebDriver driver;
	public Login_page loginobj;
	public Home_page homeobj;
	public Cart_page cartobj;
	public Checkout_page checkoutobj;
	public Payment_page paymentobj;
	
	@BeforeTest
	public void browsersetup()
	{
		//to handle the change password popup in browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("---incognito");
		driver = new ChromeDriver(options);
		
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void objectmethod()
	{
		loginobj = new Login_page(driver);
		homeobj = new Home_page(driver);
		cartobj = new Cart_page(driver);
		checkoutobj = new Checkout_page(driver);
		paymentobj = new Payment_page(driver);
	}
	
	

}
