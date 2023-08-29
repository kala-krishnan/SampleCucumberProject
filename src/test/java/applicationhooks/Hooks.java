package applicationhooks;
import org.openqa.selenium.WebDriver;


import drivermanager.DriverManagerClass;
import io.cucumber.java.Before;
import standardconstants.CommonUtils;


public class Hooks {
			public static WebDriver driver;
			
		    @Before
		    public void beforeScenario() {
		    	
		    	try {
		    		CommonUtils.loadProperties();
		    	
		    	if(driver==null) {
		    		driver = DriverManagerClass.launchBrowser();
		    	
		    	}
		    	
		    }
		    catch (Exception e) {
		    	e.printStackTrace();
		    }
		    }
		    
		    
		    public static WebDriver getDriver() {
		        return driver;
		    }
	}


