package stepdefinitionadactin;

import java.awt.AWTException;
import base.Base;
import io.cucumber.java.en.*;
import pom.ProjectObjectManager;

public class StepDefinitionA extends Base {

	static ProjectObjectManager p;

	@Given("User should in Adactin hotel login page")
	public void user_should_in_Adactin_hotel_login_page() {
		launch();

	}

	@When("User should Enter {string} and {string} and click login")
	public void user_should_Enter_and_and_click_login(String s1, String s2) {

		login(p.getP1().getUsername(), p.getP1().getPassword(), p.getP1().getLogin(), s1, s2);
	}

	@When("User should fill the Search page detalis {string} and {string} and {string} and click next page")
	public void user_should_fill_the_Search_page_detalis_and_and_and_click_next_page(String s3, String s4, String s5)
			throws AWTException {

		fillUpPage(p.getP2().getLocation(), p.getP2().getHotels(), p.getP2().getRoom_type(), p.getP2().getChild_room(),
				p.getP2().getSubmit(), s3, s4, s5);
	}

	@When("User should select hotel")
	public void user_should_select_hotel() {
		selectHotel(p.getP3().getRadiobutton_0(), p.getP3().getContinue1());
	}

	@When("User should fill Book a hotel page {string} and {string} and {string} and {string} and {string} and book")
	public void user_should_fill_Book_a_hotel_page_and_and_and_and_and_book(String string, String string2,
			String string3, String string4, String string5) throws InterruptedException {
		bookHotel(p.getP4().getFirst_name(), p.getP4().getLast_name(), p.getP4().getAddress(), p.getP4().getCc_num(),
				p.getP4().getCc_type(), p.getP4().getCc_exp_month(), p.getP4().getCc_exp_year(), p.getP4().getCc_cvv(),
				p.getP4().getBook_now(), p.getP4().getOrder_no(), string, string2, string3, string4, string5);
	}

	@Then("User should have booked the hotel room")
	public void user_should_have_booked_the_hotel_room() {
		quit();
	}

}
