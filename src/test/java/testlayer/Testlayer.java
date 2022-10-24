package testlayer;

import static org.testng.Assert.assertEquals;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

import basepackage.Baseamazon;
import pompackage.Pomlogin;
import pompackage.Pommainpage;
import pompackage.Pompassword;
import pompackage.Pomyouraddresses;
import pompackage.Pomyouroder;

public class Testlayer extends Baseamazon {
	
	Pomlogin log;
	Pompassword pass;
	Pommainpage main;
	Pomyouroder order;
	Pomyouraddresses address;
	
	
	public Testlayer() {
		
		super();
	}
	
	
@BeforeMethod 
public void initsetup() {
	initiate();
	
	 log=new Pomlogin();	
	 
	 pass=new Pompassword();
	 
	 main=new Pommainpage();
	 
	 order=new Pomyouroder();
	 address=new Pomyouraddresses();
	 
	 
	 
}




@Test(priority=2,groups="login")
public void email() {
	log.enteremailid(prop.getProperty("emailid"));
	log.clickbutton();
	driver.findElement(By.xpath("//*[@id=\"authportal-main-section\"]/div[2]/div/div/div/form/div/div[1]/div[1]/div[1]/label"));
	String Tittle=driver.getTitle();
	Assert.assertEquals(Tittle, "Amazon Sign In");
	
	
	
} 

@Test(priority=1,groups="login")
public void nullemail() {
	log.enteremailid(prop.getProperty("nullemailid"));
	log.clickbutton();
	String Text=driver.findElement(By.xpath("//*[@id=\"auth-email-missing-alert\"]/div/div")).getText();
	
	Assert.assertEquals(Text,"Enter your e-mail address or mobile phone number");	

}


@Test(priority=3,groups="login")

public void invalidemail() {
	log.enteremailid(prop.getProperty("invalidemailid"));
	log.clickbutton();
	String Text=driver.findElement(By.xpath("//*[@id=\"auth-error-message-box\"]/div/h4")).getText();
	Assert.assertEquals(Text,"There was a problem");
			
}

@Test(groups="password")

public void invalidpassword() {
	
	log.enteremailid(prop.getProperty("emailid"));
	log.clickbutton();
	pass.inputpassword("invalidpassword");
	pass.clickbutton();
	String Text= driver.findElement(By.xpath("//div[contains(text(),'Enter your password')]")).getText();
	Assert.assertEquals(Text,"Enter your password");
	}

@Test(priority=5,groups="password")
public void nullpassword() {
	log.enteremailid(prop.getProperty("emailid"));
	log.clickbutton();
	pass.inputpassword(prop.getProperty("nullpassword"));
	pass.clickbutton();
	String Text= driver.findElement(By.xpath("//div[contains(text(),'Enter your password')]")).getText();
	Assert.assertEquals(Text,"Enter your password");
	
}

@Test(groups="mainaccount")

public void youraccount(){
	
	log.enteremailid(prop.getProperty("emailid"));
	log.clickbutton();
	pass.inputpassword(prop.getProperty("password"));
	pass.clickbutton();
	main.hellotab();
	String abc=driver.getTitle();
	Assert.assertEquals(abc, "Your Account");
	
	
}

@Test(groups="mainaccount")

public void accountandlist() {
	log.enteremailid(prop.getProperty("emailid"));
	log.clickbutton();
	pass.inputpassword(prop.getProperty("password"));
	pass.clickbutton();
	boolean accountlistverification= main.accountlist(); 
	Assert.assertEquals(true, accountlistverification);
	
	 
		
}

@Test(groups="youroders")

public void yourorder() {
	log.enteremailid(prop.getProperty("emailid"));
	log.clickbutton();
	pass.inputpassword(prop.getProperty("password"));
	pass.clickbutton();
	main.hellotab();
	main.clickyourorder();
	String list=order.dropdownlist();
	Assert.assertEquals(list, "past 3 months");
	
	
}
@Test(groups="youroders")
public void buyagain() {
	log.enteremailid(prop.getProperty("emailid"));
	log.clickbutton();
	pass.inputpassword(prop.getProperty("password"));
	pass.clickbutton();
	main.hellotab();
	main.clickyourorder();
	 main.buyorderoption();}

@Test(groups="yourorders")
public void notyetshipped() {
	log.enteremailid(prop.getProperty("emailid"));
	log.clickbutton();
	pass.inputpassword(prop.getProperty("password"));
	pass.clickbutton();
	main.hellotab();
	main.clickyourorder();
	 main.notyetshippedoption();}


@Test(groups="yourorders")
public void cancelledorder() {
	log.enteremailid(prop.getProperty("emailid"));
	log.clickbutton();
	pass.inputpassword(prop.getProperty("password"));
	pass.clickbutton();
	main.hellotab();
	main.clickyourorder();
	 main.cancelledorderoption();
	 
	 
	 }

@Test(groups="youraddresses")

public void youraddresses() {
//	log.enteremailid(prop.getProperty("emailid"));
	
	log.enteremailid(prop.getProperty("emailid"));
	log.clickbutton();
	pass.inputpassword(prop.getProperty("password"));
	pass.clickbutton();
	main.hellotab();
	String addressTitle = main.youraddressesoption();
	Assert.assertEquals(addressTitle, "Your Addresses");
}

@Test
public void addaddresse() {
	
	log.enteremailid(prop.getProperty("emailid"));
	log.clickbutton();
	pass.inputpassword(prop.getProperty("password"));
	pass.clickbutton();
	main.hellotab();
	main.clickyouradressess();
	address.checkaddaddress();
	
	
}

@Test

public void addnewaddresse() {
	
	log.enteremailid(prop.getProperty("emailid"));
	log.clickbutton();
	pass.inputpassword(prop.getProperty("password"));
	pass.clickbutton();
	main.hellotab();
	main.clickyouradressess();
	address.clickaddaddress();
	address.newaddress();
	
	
	
}

@Test

public void enteraddress() {
	
	log.enteremailid(prop.getProperty("emailid"));
	log.clickbutton();
	pass.inputpassword(prop.getProperty("password"));
	pass.clickbutton();
	main.hellotab();
	main.clickyouradressess();
	address.clickaddaddress();
	address.newaddress();
	address.typefullname(prop.getProperty("fullname"));
	address.typephonenumber(prop.getProperty("pnumber"));
	address.enterstreetadd(prop.getProperty("streetadd"));
	address.entercity(prop.getProperty("city"));
	
	
}
	









@AfterMethod

public void closebrowser() {
	
	driver.close();
}




}
