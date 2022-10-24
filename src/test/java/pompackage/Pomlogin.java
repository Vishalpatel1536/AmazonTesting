package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.Baseamazon;

public class Pomlogin extends Baseamazon {
	
	@FindBy(id="ap_email") WebElement email;
	@FindBy(id="continue") WebElement continuebutton;
	
	
	public Pomlogin() {
		PageFactory.initElements(driver,this);	
		
	}
	
	public void enteremailid(String emailid) {
		
		email.sendKeys(emailid);
		
	}
	
	public void clickbutton() {
		continuebutton.click();
	}
	

	

}

