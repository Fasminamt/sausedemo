package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	WebDriver driver;
	@FindBy(xpath = "//*[@id=\"user-name\"]")
	WebElement username;
	
	@FindBy(xpath = "//*[@id=\"password\"]")
	WebElement password;
	
	@FindBy(xpath = "//*[@id=\"login-button\"]")
	WebElement loginbtn;

	
	

	public Loginpage(WebDriver driver) {
	this.driver=driver;
	 PageFactory.initElements(driver, this);

}
	 public void setvalues(String username1,String password1) {
		 username.clear();
		 username.sendKeys(username1);
		 password.clear();
			password.sendKeys(password1);
			
		}
	 public void loginbtnclick() {
		 loginbtn.click();

	 }
}

