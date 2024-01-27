package cucumberTask;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {

	RemoteWebDriver driver = null;

	@Given("open any browser of choice")
	public void open_any_browser_of_choice() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@When("pass the url of page to be opened")
	public void pass_the_url_of_page_to_be_opened() throws Exception {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);

	}

	@And("enter {string} and {string} into respective fields")
	public void enter_and_into_respective_fields(String u_name, String pwd) throws Exception {
		driver.findElement(By.name("username")).sendKeys(u_name);
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(pwd);
		Thread.sleep(2000);

	}

	@And("press login button")
	public void press_login_button() throws Exception {
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(8000);

		String loginpageURL = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";

		if (driver.getCurrentUrl().equals(loginpageURL)) {
			System.out.println();
			Thread.sleep(3000);
			Date d = new Date();
			System.out.println(d.toString());

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("F:\\RND\\" + sdf.format(d) + ".png"));
		} else {
//			if (driver.findElement(By.xpath("//*[text()='Invalid credentials']")).isDisplayed()) {
//				System.out.println("-----invalid credentials passed-------");
//				Date d = new Date();
//				System.out.println(d.toString());
//
//				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
//				File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//				FileUtils.copyFile(scrFile, new File("F:\\RND\\" + sdf.format(d) + ".png"));
//			} else {
//				System.out.println("-----null credentials are passed-----");
//				Date d = new Date();
//				System.out.println(d.toString());
//
//				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
//				File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//				FileUtils.copyFile(scrFile, new File("F:\\RND\\" + sdf.format(d) + ".png"));
//			}
			WebElement e = driver.findElement(By.xpath("//*[text()='Invalid credentials']"));
			
		}

	}

	@And("verify bi taking screenshot and print statement")
	public void verify_bi_taking_screenshot_and_print_statement() throws IOException, Exception {
		System.out.println("screenshot taken");
	}

	@And("close the browser")
	public void close_the_browser() throws Exception {
		// Thread.sleep(4000);
		driver.close();

	}

}
