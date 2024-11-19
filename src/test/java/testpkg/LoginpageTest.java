package testpkg;

import org.testng.annotations.Test;

import utilitypkg.Excelutility;
import basepkg.Baseclass;
import pagepkg.CartandCheckout;
import pagepkg.Continue;
import pagepkg.Homepage;
import pagepkg.Loginpage;
import pagepkg.Logout;

public class LoginpageTest extends Baseclass{
	@Test
	public void testing() throws InterruptedException  {
		Loginpage obj=new Loginpage(driver);
		

		String xl="C:\\Users\\LENOVO\\Desktop\\loginpage.xlsx";
		
		String sheet="Sheet1";
		
		int rowCount=Excelutility.getRowCount(xl, sheet);// which xl and which sheet
		
		for(int i=1;i<=rowCount;i++) {
			String username=Excelutility.getCellValue(xl,sheet,i,0);
			System.out.println("username......."+username);
			
			String password=Excelutility.getCellValue(xl,sheet,i,1);
			System.out.println("password......."+password);
			
			       //passing username ang password as parameters
		
			
			obj.setvalues(username,password);
			
			
			       //submitting  the data by clicking on login button
			
			obj.loginbtnclick(); 
			//Thread.sleep(2000);
			
			String expurl="https://www.saucedemo.com/inventory.html" ;
		    String acturl=driver.getCurrentUrl();
			if(acturl.equals(expurl)) {
				
			
				System.out.println("pass");}
				else {
			
			
			System.out.println("fail");
			
		}
	
		Homepage objn=new Homepage(driver);
	objn.locate();
	
	
	CartandCheckout ob1=new CartandCheckout(driver);
    ob1.clickcart();
	ob1.checkoutclick();
	
        
	Continue ob2=new Continue(driver); 
	ob2.setvalues("femina"," nasrin", "123abc");
		ob2.continueclick();
		
	Logout obm3=new Logout(driver);
	Thread.sleep(3000);
	
	   obm3.hammenu();
	   obm3.logoutclick();
		
	 
	}
}
}
		
	


