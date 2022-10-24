package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.Baseamazon;

public class Pommainpage extends Baseamazon {
	
	
	@FindBy(id="nav-link-accountList") WebElement hello;
	@FindBy(className="ya-card__whole-card-link") WebElement yourorder;
	@FindBy(xpath="//a[contains(text(),'Buy Again')]") WebElement buyagain;
	@FindBy(xpath="//a[contains(text(),'Not Yet Shipped')]") WebElement notyetshipped;
	@FindBy(xpath="//a[contains(text(),'Cancelled Orders')]") WebElement cancelledorder;
	@FindBy(xpath="//span[contains(text(),'Edit addresses for orders and gifts')]") WebElement youraddresses;
	
	public Pommainpage() {
		PageFactory.initElements(driver,this);	
		}
		
		public void hellotab() {
			
			hello.click();
			
		}
		
		public boolean accountlist() {
		 boolean accountlistverification=hello.isDisplayed();
		 return accountlistverification;
		}
		
		
		public void clickyourorder() {
			
			
			yourorder.click();
				
		}
		
		public void buyorderoption() {
			
			buyagain.isDisplayed();
				
		}
public void notyetshippedoption() {
			
			notyetshipped.isDisplayed();
				
		}
public void cancelledorderoption() {
	
	cancelledorder.isDisplayed();
		
}

public String youraddressesoption() {
	
	youraddresses.click();
	
	String text=driver.getTitle();
	

	return text;

}

public void clickyouradressess() {
	youraddresses.click();
}
		
		
}	
	


