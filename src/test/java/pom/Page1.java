package pom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class Page1 extends Base {
public Page1() {
PageFactory.initElements(driver, this);
}
@FindBy(id="username")	
private List<WebElement> Username;

@FindBy(id="password")
private List<WebElement> password;

@FindBy(id="login")
private List<WebElement> login;

public List<WebElement> getUsername() {
	return Username;
}

public List<WebElement> getPassword() {
	return password;
}

public List<WebElement> getLogin() {
	return login;
}
}
