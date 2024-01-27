package pomFrameworkWithPageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page2 {

	RemoteWebDriver driver;

	@FindBy(xpath = "//*[text()='My Info']")
	WebElement info_button_loc;

	public Page2(RemoteWebDriver odriver) {
		this.driver = odriver;
		PageFactory.initElements(driver, this);
	}

	public void my_Info_Button() {
		info_button_loc.click();
	}

}
