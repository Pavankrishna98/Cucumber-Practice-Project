package taskpractice;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
	WebDriver driver;
	
	@Given("I am on the login page")
	public void i_am_on_the_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	}

	@When("I enter credentials {string} and {string}")
	public void i_enter_credentials_and(String u_name, String pwd) throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys(u_name);
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(2000);
	    
	}

	@Then("I should {string} be logged in")
	public void i_should_be_logged_in(String expectedOutcome) {
		try {
			
		
		if (expectedOutcome.equals("should")) {
			assertTrue(driver.findElement(By.xpath("(//*[text()='Dashboard'])[2]")).isDisplayed());
			captureScreenshot("valid_login");
			System.out.println("Login successful!");
		} else if (expectedOutcome.equals("should not")) {
			assertTrue(driver.findElement(By.xpath("//*[text()='Invalid credentials']")).isDisplayed());
			captureScreenshot("invalid_login");
			System.out.println("Invalid credentials, error message displayed.");
		}
		else if (expectedOutcome.equals("should not")) {
			assertTrue(driver.findElement(By.xpath("//*[text()='Required']")).isDisplayed());
			captureScreenshot("invalid_login");
			System.out.println("Null credentials, error message displayed.");
		}
		driver.quit();
		} catch (Exception e) {
			// TODO: handle exception
		}
	    
	}

	public void captureScreenshot(String fileName) {
		try {
			Date d = new Date();
			System.out.println(d.toString());

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File("F:\\screenshots\\" + fileName + sdf.format(d) + ".png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
