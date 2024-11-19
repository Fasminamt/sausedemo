package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Continue {
WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"first-name\"]")
	WebElement frstname ;
	
	
	@FindBy(xpath = "//*[@id=\"last-name\"]")
	WebElement lastname;
	

	@FindBy(xpath = "//*[@id=\"postal-code\"]")
	WebElement zipcode ;
	
   
	@FindBy(xpath = "//*[@id=\"continue\"]")
	WebElement continuebtn;
	
	
public Continue(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


public void setvalues(String fname1,String lname1,String zipcode1) {
	frstname.sendKeys(fname1);
	lastname.sendKeys(lname1);
	zipcode.sendKeys(zipcode1);
	
}
public void continueclick() {
	continuebtn.click();
}

}
