 package pagepkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Homepage {
	WebDriver driver;
	
	

	public Homepage(WebDriver driver) {
		this.driver=driver;
		 PageFactory.initElements(driver, this);
		
	}



	@Test
	public void locate() {
	List<WebElement>addtocartbutons=driver.findElements(By.xpath("//button[contains(text(),'Add to cart')]"));
     for(WebElement button:addtocartbutons) {
    	 button.click();
     }
     

   
 
   
}
	
	
}