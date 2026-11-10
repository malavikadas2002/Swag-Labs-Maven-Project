package page_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	
	WebDriver driver;
	
	@FindBy (xpath = "//*[@id=\"user-name\"]") WebElement username ;
	@FindBy (xpath = "//*[@id=\"password\"]") WebElement password ;
	@FindBy (xpath = "//*[@id=\"login-button\"]") WebElement login_button ;
	
	public Login_page(WebDriver driver) 	//constructor
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//methods
	public String titlemthd()
	{
		String title = driver.getTitle();
		return title;
	}
	
	public void loginmthd(String un, String pw)
	{
		username.sendKeys(un);
		password.sendKeys(pw);
		login_button.click();
	}
	
	public String urlmthd()
	{
		String actual_url = driver.getCurrentUrl();
		return actual_url;
	}

}
