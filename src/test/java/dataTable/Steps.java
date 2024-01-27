package dataTable;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps {
	WebDriver driver = null;

	@Given("open  browser with datatble")
	public void open_browser_with_datatble() {
		System.out.println("we will execute data table program");
	}

	@And("url passing")
	public void url_passing() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	}

	@When("testdata for username and password")
	public void testdata_for_username_and_password(DataTable dataTable) throws InterruptedException {
		//single row data 
//		List<List<String>> data = dataTable.asLists(String.class);
//		List<List<String>> data = dataTable.cells();	
//		driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
//		Thread.sleep(3000);
//		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@type='submit']")).click();
//		Thread.sleep(3000);
		
		//data with key value
//		
//		List<Map<String, String>> multidata=dataTable.asMaps(String.class,String.class);
//		driver.findElement(By.name("username")).sendKeys(multidata.get(0).get("username"));
//		Thread.sleep(3000);
//		driver.findElement(By.name("password")).sendKeys(multidata.get(0).get("password"));
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@type='submit']")).click();
//		Thread.sleep(3000);
//		
		
		
		// multiple values with same key
		
		List<Map<String, String>> multidata=dataTable.asMaps(String.class ,String.class);
		for(Map<String,String> alldata : multidata) {
			
			WebElement e1= driver.findElement(By.name("username"));
			WebElement e2 = driver.findElement(By.name("password"));
			
			//to clear field
			String s = Keys.chord(Keys.CONTROL, "a"); //chord is used to join two keys
			e1.sendKeys(s);
			e1.sendKeys(Keys.DELETE);
			
			Thread.sleep(2000);
			e1.sendKeys(alldata.get("username"));
			Thread.sleep(3000);
			
			//to clear field
			String s1 = Keys.chord(Keys.CONTROL, "a"); //chord is used to join two keys
			e2.sendKeys(s1);
			e2.sendKeys(Keys.DELETE);
			
			Thread.sleep(2000);
			e2.sendKeys(alldata.get("password"));
			Thread.sleep(3000);
			//driver.findElement(By.xpath("//*[@type='submit']")).click();
			Thread.sleep(3000);
			
		}
		

	}

	@Then("close window")
	public void close_window() {
		driver.close();
	}

}
