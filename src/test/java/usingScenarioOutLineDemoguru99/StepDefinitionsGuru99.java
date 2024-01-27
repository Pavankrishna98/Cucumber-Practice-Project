package usingScenarioOutLineDemoguru99;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitionsGuru99 {
	RemoteWebDriver driver=null;
	@Given("open browser\\(edge)")
	public void open_browser_edge() {
	    
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@When("open website by using page URL")
	public void open_website_by_using_page_url() throws Exception {
		driver.get("https://demo.guru99.com/test/newtours/login.php");
		Thread.sleep(3000);
	   
	}

	@And("pass valid credentials to {string} and {string} fields")
	public void pass_valid_credentials_to_and_fields(String string, String string2) throws InterruptedException {
		driver.findElement(By.name("userName")).sendKeys(string);
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys(string2);
		Thread.sleep(3000);
	   
	}

	@And("click on login button")
	public void click_on_login_button() throws Exception {
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(3000);
		driver.close();
	    
	}

}
