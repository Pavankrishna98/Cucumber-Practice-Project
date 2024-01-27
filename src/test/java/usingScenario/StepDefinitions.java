package usingScenario;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitions {

	RemoteWebDriver driver = null;

	@Given("open browser")
	public void open_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	}

	@When("open website by using URL")
	public void open_website_by_using_url() throws Exception {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);

	}

	@And("pass valid credentials to username and password")
	public void pass_valid_credentials_to_username_and_password() throws Exception {
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(3000);

	}

	@And("click login button")
	public void click_login_button() throws Exception {
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(3000);
		String title = driver.getTitle();
		if (title.contains("HRM")) {
			System.out.println("page opened");

		} else {
			System.out.println("page not opened");
		}
		Thread.sleep(3000);
		System.out.println("title is------>>>" + title);
		driver.close();

	}

}
