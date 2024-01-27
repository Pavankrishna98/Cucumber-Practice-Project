package Hooks;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;
import io.cucumber.java.en.When;

public class HooksStepDefenitions {
	
	RemoteWebDriver driver = null;
	String url;
	
	@Before(order = 1)
	private void setUp() {
		driver=new FirefoxDriver();
		System.out.println("&@&@&@&@&@  opening firefox browser  &@&@&@&@&@");
	}
	@Before(order = 2)
	private void setUp2() {
		System.out.println("============ given browser opened  ============");
	}
	@After(order = 2)
	private void tearDown2() {
		System.out.println("============  browser is initiated for closing  ============>");
	}
	@After(order = 1)
	private void tearDown() {
		System.out.println("&@&@&@&@&@ firefox browser is closed  &@&@&@&@&@");
		driver.close();
	}
	
	@BeforeStep
	private void m() {
		System.out.println("<#<#<#*=*=*=*=  this is before step methoid =*=*=*=*#>#>#>");
	}
	
	@AfterStep
	private void m1() {
		System.out.println("<#<#<#*=*=*=*=  this is after step methoid =*=*=*=*#>#>#>");
	}
	
	
	@Given("to open pass url")
	private void to_open_pass_url() {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize(); 
	}

	@When("to get the url")
	private void to_get_the_url() {
		url = driver.getCurrentUrl();
	   
	}

	@When("print the url")
	private void print_the_url() {
		System.out.println("url is=====>>>>>"+ url);
	    
	}


}
