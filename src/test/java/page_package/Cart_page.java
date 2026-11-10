package page_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_page {
	
	WebDriver driver;
	
	@FindBy (xpath = "//*[@id=\"shopping_cart_container\"]/a") WebElement carticon;
	@FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span") WebElement yourcart;
	@FindBy(xpath = "//*[@id=\"checkout\"]") WebElement checkoutbtn;
	
	public Cart_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void cartclick() throws Exception
	{
		Thread.sleep(2000);
		carticon.click();
	}
	
	public String carttext()
	{
		String carttext = yourcart.getText();
		return carttext;
	}
	
	public void checkoutclickmthd() throws Exception
	{
		Thread.sleep(3000);
		checkoutbtn.click();
	}
	
	

}
