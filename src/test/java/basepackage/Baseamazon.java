package basepackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Baseamazon {
	
	private static final TimeUnit Second = null;
	public static Properties prop=new Properties();
	public static WebDriver driver;
	
	
	public Baseamazon() {
		
		try {
	    	
	    	FileInputStream file=new FileInputStream("C:\\Users\\visha\\eclipse-workspace\\Amazon\\src\\test\\java\\enviromentvariable\\config.properties");
	    	  prop.load(file);
	    	
	    	
	    }
	    	
	    	catch(FileNotFoundException e) {
	    		e.printStackTrace();
	    	}

	    	catch(IOException a) {
	    		a.printStackTrace();
	    	}}
	
	
	public static void initiate() {
		
		
		String browsername=prop.getProperty("browser");
		
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			
			driver=new ChromeDriver();}
			
			else if (browsername.equals("Firefox")) {
				
				System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			}
			driver.manage().window().maximize();
			driver.get(prop.getProperty("url"));
			
	}}
	
		
	
	
	
	
	
		
	


