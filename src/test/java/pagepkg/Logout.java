package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"react-burger-menu-btn\"]")
	WebElement menu;
	
	@FindBy(xpath = "/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[2]/div[1]/nav/a[3]")
	WebElement logout;
	

	public Logout(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	public void hammenu(){
		menu.click();
	}
	
	public void logoutclick() {
		logout.click();
	}

}
