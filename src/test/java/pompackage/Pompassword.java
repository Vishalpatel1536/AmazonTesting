package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.Baseamazon;

public class Pompassword extends Baseamazon {
	
	
	@FindBy(id="ap_password") WebElement enterpassword;
	@FindBy(id="signInSubmit") WebElement signin;



public Pompassword() {
	PageFactory.initElements(driver,this);	
	
}

public void inputpassword(String password) {

enterpassword.sendKeys(password);
}

public void clickbutton() {
	signin.click();
}







}
