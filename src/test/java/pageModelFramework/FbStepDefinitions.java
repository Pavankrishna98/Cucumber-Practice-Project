package pageModelFramework;

import java.time.Duration;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FbStepDefinitions {
	
	RemoteWebDriver driver = null;
	FbPageDeteils fb;
	
	@Given("open any browser")
	public void open_any_browser() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  
	}

	@When("login to fb page using URL")
	public void login_to_fb_page_using_url() throws Exception{
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
	   
	}

	@And("pass {string} and {string} to respective fields")
	public void pass_and_to_respective_fields(String username, String password) throws Exception {
		fb = new FbPageDeteils(driver);
		fb.uname(username);
		Thread.sleep(3000);
		fb.pwd(password);
		Thread.sleep(3000);
	    
	}

	@And("click Login button")
	public void click_login_button() {
		fb = new FbPageDeteils(driver);
		fb.lgn_btn();
	   
	}

	@And("close browser")
	public void close_browser() throws Exception {
		Thread.sleep(3000);
		driver.close();
	    
	}


}
