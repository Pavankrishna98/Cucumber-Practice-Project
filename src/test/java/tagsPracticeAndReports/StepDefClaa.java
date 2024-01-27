package tagsPracticeAndReports;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefClaa {
	
	RemoteWebDriver driver = null;
	
	@Given("open the required browser")
	public void open_the_required_browser() {
	    driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    System.out.println("====*** BrowserOpened ***====");
	}

	@When("pass the url to be opened")
	public void pass_the_url_to_be_opened() throws Exception {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		String s = driver.getTitle();
		if(s.contains("nge"))System.out.println(">>>>> Page Opened <<<<<");
		else System.out.println("given url is invalid or page not opened");
	    
	}

	@Given("pass the valid credentials and click login")
	public void pass_the_valid_credentials_and_click_login() throws Exception {
//		driver = new FirefoxDriver();
//	    driver.manage().window().maximize();
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		String s = driver.getTitle();
		if(s.contains("nge"))System.out.println(">>>>> Page Opened for valid test <<<<<");
		else System.out.println("given url is invalid or page not opened");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(5000);
		String st = driver.findElement(By.xpath("(//*[text()='Dashboard'])[2]")).getText();
		if(st.equalsIgnoreCase("dashboard")) System.out.println("dashboard opened $-$-$-$valid test passed$-$-$-$");
		else System.out.println("valid test failed");
		Thread.sleep(5000);
	    driver.close();
	}

	@Given("pass the invalid credentials and click login")
	public void pass_the_invalid_credentials_and_click_login() throws Exception {
//		driver = new FirefoxDriver();
//	    driver.manage().window().maximize();
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		String s = driver.getTitle();
		if(s.contains("nge"))System.out.println(">>>>> Page Opened for invalid test <<<<<");
		else System.out.println("given url is invalid or page not opened");
		
		driver.findElement(By.name("username")).sendKeys("asdf");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("ghjk");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(5000);
		String st = driver.findElement(By.xpath("//*[text()='Forgot your password? ']")).getText();
		if(!st.contains("your")) System.out.println("dashboard opened $-$-$-$ invalid test failed $-$-$-$");
		else System.out.println("#-#-#-# <-<-<-< invalid test is passed and home page did not opened >->->-> #-#-#-#");
		Thread.sleep(5000);
	    driver.close();
	}

	@Given("pass the null credentials and click login")
	public void pass_the_null_credentials_and_click_login() throws Exception {
//		driver = new FirefoxDriver();
//	    driver.manage().window().maximize();
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		String s = driver.getTitle();
		if(s.contains("nge"))System.out.println(">>>>> Page Opened for null test <<<<<");
		else System.out.println("given url is invalid or page not opened");
		
		driver.findElement(By.name("username")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(5000);
		String st = driver.findElement(By.xpath("//*[text()='Forgot your password? ']")).getText();
		if(!st.contains("Forgot")) System.out.println("dashboard opened $-$-$-$ null test failed $-$-$-$");
		else System.out.println("#-#-#-# <-<-<-< null test is passed and home page did not opened >->->-> #-#-#-#");
		Thread.sleep(5000);
	    driver.close();
	}
	

}
