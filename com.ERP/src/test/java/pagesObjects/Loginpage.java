package pagesObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Loginpage {

	public Loginpage(WebDriver driver) {
	 PageFactory.initElements(new AjaxElementLocatorFactory(driver,20), this);	
	}
	
	@FindBy (xpath="//input[@id='username']")
	WebElement username_txt;
	
	@FindBy(xpath="")
	WebElement password_txt;
	
	@FindBy(xpath="")
	WebElement login_button;
	
	@FindBy (xpath="")
	WebElement option_link;
	
	@FindBy (xpath=" ")
	WebElement reset_button;
	
	@FindBy (xpath="added at WD")
	WebElement atmy_location;
	
	public boolean isLoginPageDisplayed() {
		
		username_txt.isDisplayed();
		password_txt.isDisplayed();
		login_button.isDisplayed();
		option_link.isDisplayed();
	    reset_button.isDisplayed();
	    return true;
	}
	public void admimLogin(String username, String password) {
		reset_button.click();
		username_txt.sendKeys(username);
		password_txt.sendKeys(password);
		login_button.click();
	}
	
}
