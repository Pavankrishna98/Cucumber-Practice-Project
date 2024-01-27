package pageModelFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FbPageDeteils {
	
	
	
	RemoteWebDriver driver;
	
	private By uname_loc = By.name("email");
	private By pwd = By.name("pass");
	private By lgn_btn = By.name("login");
	
	public FbPageDeteils(RemoteWebDriver d) {
		this.driver = d;
	}

	public void uname(String u_name) {
		driver.findElement(uname_loc).sendKeys(u_name);
	}
	public void pwd(String p_word) {
		driver.findElement(pwd).sendKeys(p_word);
	}
	public void lgn_btn() {
		driver.findElement(lgn_btn).click();
	}
}
