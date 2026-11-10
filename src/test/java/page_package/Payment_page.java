package page_package;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_page {
	
	WebDriver driver;
	
	@FindBy (xpath="//*[@id=\"finish\"]") WebElement finishbtn;
	
	public Payment_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void screenshotmthd() throws Exception
	{
		File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(s, new File("C:\\Users\\kkabh\\OneDrive\\Desktop\\SELENIUM WORKS\\Screenshots\\SwagLabs.png"));
	}
	
	public void finishmthd()
	{
		finishbtn.click();
	}
}
