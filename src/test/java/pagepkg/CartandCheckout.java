package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartandCheckout {
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a")
	WebElement carticon;
	
	
	@FindBy(xpath = "//*[@id=\"checkout\"]")
	WebElement checkoutbtn;
	
	

	
	


	public CartandCheckout(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	public void clickcart() {
		carticon.click();
		
	}
	public void checkoutclick() {
		checkoutbtn.click();
	}
}
