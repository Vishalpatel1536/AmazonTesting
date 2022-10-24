package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.Baseamazon;

public class Pomyouraddresses extends Baseamazon {

	
	
	@FindBy(xpath="//h2[contains(text(),'Add Address')]") WebElement addaddress;
	@FindBy(xpath="//h2[contains(text(),'Add a new address')]") WebElement newaddress;
	@FindBy(className="a-dropdown-prompt") WebElement selectcountry;
	@FindBy(id="address-ui-widgets-enterAddressFullName") WebElement fullname;
	@FindBy(id="address-ui-widgets-enterAddressPhoneNumber") WebElement phonenumber;
	@FindBy(id="address-ui-widgets-enterAddressLine1") WebElement streetaddress;
	
	@FindBy(id="address-ui-widgets-enterAddressCity") WebElement cityname;
	public Pomyouraddresses() {
		PageFactory.initElements(driver,this);	
		
	}
	
	public void checkaddaddress() {
		
		addaddress.isDisplayed();
	}
	
	public void clickaddaddress() {
		
		addaddress.click();
		
	}
	
	public void newaddress() {
		
		newaddress.isDisplayed();
	}
	
public void typefullname(String fname) {
		
		
		fullname.sendKeys(fname);
	}

public void typephonenumber(String pnumber) {
	phonenumber.sendKeys(pnumber);
	
	
	
}

public void enterstreetadd(String streetadd) {
	
	streetaddress.sendKeys(streetadd);
	

}

public void entercity(String city) {
	
	cityname.sendKeys(city);
}


		
	
	
}
