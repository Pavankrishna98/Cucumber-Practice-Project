package usingTags;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class TagsStepDef {
	WebDriver driver;

	@Given("open browser for ex:firefox")
	public void open_browser_for_ex_firefox() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
	}

	@Given("open url of facebook for test")
	public void open_url_of_facebook_for_test() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("pavan");
		Thread.sleep(3000);
		driver.close();
	}

	@Given("enter username into resp. field")
	public void enter_username_into_resp_field() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("pavan");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		driver.close();
	}

	@Given("enter password into resp. field")
	public void enter_password_into_resp_field() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("pavan");
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys("pavan");
		Thread.sleep(3000);
		driver.close();
	}

	@Given("click login button to go further")
	public void click_login_button_to_go_further() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("pavan");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
