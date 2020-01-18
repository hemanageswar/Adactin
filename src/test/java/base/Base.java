package base;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {
	public static WebDriver driver;

	public void launch() {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse Oxygen WorkSpace\\Hotel\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp/index.php");
		driver.manage().window().maximize();
	}

	public void login(List<WebElement> list, List<WebElement> list2, List<WebElement> list3, String s1, String s2) {
		list.get(0).sendKeys(s1);
		list2.get(0).sendKeys(s2);
		list3.get(0).click();
	}

	public void fillUpPage(List<WebElement> list, List<WebElement> list2, List<WebElement> list3,
			List<WebElement> list4, List<WebElement> list5, String s3, String s4, String s5) {

		Select s = new Select(list.get(0));
		s.selectByValue(s3);
		Select s1 = new Select(list2.get(0));
		s1.selectByValue(s4);
		Select s2 = new Select(list3.get(0));
		s2.selectByValue(s5);
		Select sc = new Select(list4.get(0));
		sc.selectByIndex(1);
		list5.get(0).click();

	}

	public void bookHotel(List<WebElement> list, List<WebElement> list2, List<WebElement> list3, List<WebElement> list4,
			List<WebElement> list5, List<WebElement> list6, List<WebElement> list7, List<WebElement> list8,
			List<WebElement> list9, List<WebElement> list10, String string, String string2, String string3,
			String string4, String string5) throws InterruptedException {
		list.get(0).sendKeys(string);
		list2.get(0).sendKeys(string2);
		list3.get(0).sendKeys(string3);
		list4.get(0).sendKeys("1234567891547896");
		Select s4 = new Select(list5.get(0));
		s4.selectByValue(string4);
		Select s5 = new Select(list6.get(0));
		s5.selectByVisibleText(string5);
		Select s6 = new Select(list7.get(0));
		s6.selectByValue("2020");
		list8.get(0).sendKeys("654");
		list9.get(0).click();
		Thread.sleep(7000);
		String or = list10.get(0).getAttribute("value");
		System.out.println(or);
	}

	public void quit() {
		driver.quit();
	}

	public void selectHotel(List<WebElement> list, List<WebElement> list2) {
		list.get(0).click();
		list2.get(0).click();
	}

}
