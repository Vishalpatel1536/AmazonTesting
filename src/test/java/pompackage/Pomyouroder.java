package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import basepackage.Baseamazon;

public class Pomyouroder extends Baseamazon {
	
	@FindBy(id="a-autoid-1-announce") WebElement dropdown;
	
	
	public Pomyouroder() {
		PageFactory.initElements(driver,this);	
		
	}
	
	public String dropdownlist() {
		
		String text=dropdown.getText();
		return text;
	}
	

}
