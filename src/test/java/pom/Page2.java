package pom;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;
public class Page2 extends Base {
	public Page2() {
	PageFactory.initElements(driver, this);
	}
	@FindBy(id = "room_type")
	private List<WebElement> room_type;
	@FindBy(name = "location")
	private List<WebElement> location;
	@FindBy(id = "child_room")
	private List<WebElement> child_room;
	@FindBy(id = "Submit")
	private List<WebElement> Submit;
	@FindBy(id = "hotels")
	private List<WebElement> hotels;

	public List<WebElement> getRoom_type() {
		return room_type;
	}

	public List<WebElement> getLocation() {
		return location;
	}

	public List<WebElement> getChild_room() {
		return child_room;
	}

	public List<WebElement> getSubmit() {
		return Submit;
	}

	public List<WebElement> getHotels() {
		return hotels;
	}

}
