package pom;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;
public class Page3 extends Base {
	public Page3() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")
	private List<WebElement> radiobutton_0;
	@FindBy(id = "continue")
	private List<WebElement> continue1;

	public List<WebElement> getRadiobutton_0() {
		return radiobutton_0;
	}

	public List<WebElement> getContinue1() {
		return continue1;
	}

}
