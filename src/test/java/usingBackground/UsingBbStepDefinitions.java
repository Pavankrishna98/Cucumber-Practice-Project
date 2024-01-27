package usingBackground;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingBbStepDefinitions {

	RemoteWebDriver driver = null;
	String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	String unm = "Admin";
	String pwd = "admin123";

	@Given("open the browse of choice")
	public void open_the_browse_of_choice() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	}

	@When("enter URL and enter into login page")
	public void enter_url_and_enter_into_login_page() throws Exception {
		driver.get(url);
		Thread.sleep(2000);

	}

	@And("pass the credentials username and password into the provided fields")
	public void pass_the_credentials_and_into_the_provided_fields() throws Exception {
		driver.findElement(By.name("username")).sendKeys(unm);
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys(pwd);
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());

	}

	@And("then enter into home page for required functionalities")
	public void then_enter_into_home_page_for_required_functionalities() throws Exception {
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(5000);
		boolean home_page_displayed = driver.findElement(By.xpath("(//*[text()='Dashboard'])[2]")).isDisplayed();
		System.out.println(
				"Home page is displayed and ready for our required operations by verifying the following element----->"
						+ home_page_displayed);
		Thread.sleep(3000);
	}

	/*
	 * @Then("navigate to login page again") public void
	 * navigate_to_login_page_again() {
	 * 
	 * }
	 */

	@And("click leave option")
	public void click_pim_option() throws Exception {
		driver.findElement(By.xpath("//*[text()='Leave']")).click();
		Thread.sleep(5000);

	}

	@And("verify and closed site")
	public void verify_and_closed_site() throws Exception {
		boolean apply_option = driver.findElement(By.xpath("//*[text()='Apply']")).isDisplayed();
		String a = driver.getCurrentUrl();
		System.out.println("our required page is displayed by verifying the following field--->>>" + apply_option
				+ "current url====>" + a);
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.close();

	}

	@And("click Time option")
	public void click_time_option() throws Exception {
		driver.findElement(By.xpath("//*[text()='Time']")).click();
		Thread.sleep(5000);

	}

	@And("verify and closed this site")
	public void verify_and_closed_this_site() throws Exception {
		boolean timesheets_option = driver.findElement(By.xpath("//*[text()='Timesheets ']")).isDisplayed();
		String a = driver.getCurrentUrl();
		System.out.println("our required page is displayed by verifying the following field--->>>" + timesheets_option
				+ "current url is =====>" + a);
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.close();

	}

}
