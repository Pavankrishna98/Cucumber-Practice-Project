package pomFrameworkWithPageFactory;

import java.time.Duration;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitionsPOM {

	RemoteWebDriver driver = null;
	Page1 p1;
	Page2 p2;

	@Given("open any browser\\(chrome)")
	public void open_any_browser_chrome() {

		WebDriverManager.firefoxdriver().setup(); 
		driver = new FirefoxDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 

	}

	@When("open page using URL")
	public void open_page_using_url() throws Exception {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);

	}

	@And("pass credentials {string} and {string}")
	public void pass_credentials_and(String uname, String pwd) throws Exception {
		p1 = new Page1(driver);
		Thread.sleep(2000);
		p1.user_name(uname);
		Thread.sleep(3000);
		p1.pwrd(pwd);
		Thread.sleep(3000);

	}

	@And("click login button on page used pom")
	public void click_login_button_on_page_used_pom() throws Exception {
		p1.lgn_btn();
		Thread.sleep(6000);

	}

	@And("click my_info")
	public void click_my_info() {
		p2 = new Page2(driver);
		p2.my_Info_Button();

	}

	@And("close site")
	public void close_site() throws Exception {
		Thread.sleep(5000);
		driver.close();

	}
}
