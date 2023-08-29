package RunnerFile;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


	@CucumberOptions(
			plugin = {"pretty"},
			monochrome=false,  //console output color
			features = "src/test/resources/feature", //location of feature files
			glue= {"applicationhooks","stepdefinitions"} 
			
			) //location of step definition files


	public class RunnerClass extends AbstractTestNGCucumberTests{
		
		@Override
	    @DataProvider(parallel = false)
	    public Object[][] scenarios() {
					
			return super.scenarios();
	    }

	}


