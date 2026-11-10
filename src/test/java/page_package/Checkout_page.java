package page_package;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout_page {
	
	WebDriver driver;
	
	@FindBy (xpath = "//*[@id=\"first-name\"]") WebElement firstname;
	@FindBy (xpath = "//*[@id=\"last-name\"]") WebElement lastname;
	@FindBy (xpath = "//*[@id=\"postal-code\"]") WebElement zipcode;
	@FindBy (xpath = "//*[@id=\"continue\"]") WebElement continuebtn;
	
	public Checkout_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void checkoutdetails() throws Exception
	{
		firstname.sendKeys("abcde");
		lastname.sendKeys("gh");
		zipcode.sendKeys("123456");
		Thread.sleep(3000);
		continuebtn.click();
	}
	

}
