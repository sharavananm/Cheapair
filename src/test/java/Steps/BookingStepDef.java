package Steps;

import java.util.List;

import org.openqa.selenium.WebElement;

import PageRepo.FlightBookingRepo;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookingStepDef {
	
	FlightBookingRepo fb = new FlightBookingRepo();
	
	@Given("Launch the application URL")
	public void launch_the_application_url() {
		Hook.driver.get("https://www.cheapair.com/");	    
	}

	@When("Enter the flight details")
	public void enter_the_flight_details() {
		Hook.implicitlyWait();
		fb.getFromCityName().clear();
		fb.getFromCityName().sendKeys("Chennai");
		fb.getSelectFromCity().click();
		fb.getToCityName().sendKeys("Delhi");
		fb.getSelectToCity().click();
		fb.getDepartDate().click();
		fb.getReturnDate().click();
		
	    for(int i = 1; i < 3; i++) {
	    	fb.getAdult().click();
		}
	    
	    for(int i = 1; i < 3; i++) {
	    	fb.getSeniors().click();
		}
	    
	    for(int i = 1; i < 2; i++) {
	    	fb.getChildren().click();
		}
	    
	    for(int i = 1; i < 1; i++) {
	    	fb.getInfants().click();
		}
	    
	    
	}

	@And("click on the search flight")
	public void click_on_the_search_flight() {
		fb.getSearchFlight().click();
	    
	}

	@Then("Search results should be displayed")
	public void search_results_should_be_displayed() {
		Hook.implicitlyWait();
		Hook.windowHandles(1);
		fb.getAlertClose().click();
			    
	}

	@And("select the departure and return flight with least fare")
	public void select_the_departure_and_return_flight_with_least_fare() {		
	    fb.getDepartingFlight().click();
	    fb.getReturningFlight().click();
	    Hook.implicitlyWait();
	    fb.getContinueButton().click();
	}

	@And("Enter the passenger details")
	public void enter_the_passenger_details(DataTable table) {
		List<List<String>> list = table.asLists();
		fb.getFirstname1().sendKeys(list.get(1).get(0));
		fb.getLastname1().sendKeys(list.get(1).get(1));
		fb.getGender1().sendKeys(list.get(1).get(2));
		fb.getMonth1().sendKeys(list.get(1).get(3));
		fb.getDay1().sendKeys(list.get(1).get(4));
		fb.getYear1().sendKeys(list.get(1).get(5));
		
		fb.getFirstname2().sendKeys(list.get(2).get(0));
		fb.getLastname2().sendKeys(list.get(2).get(1));
		fb.getGender2().sendKeys(list.get(2).get(2));
		fb.getMonth2().sendKeys(list.get(2).get(3));
		fb.getDay2().sendKeys(list.get(2).get(4));
		fb.getYear2().sendKeys(list.get(2).get(5));
		
		fb.getFirstname3().sendKeys(list.get(3).get(0));
		fb.getLastname3().sendKeys(list.get(3).get(1));
		fb.getGender3().sendKeys(list.get(3).get(2));
		fb.getMonth3().sendKeys(list.get(3).get(3));
		fb.getDay3().sendKeys(list.get(3).get(4));
		fb.getYear3().sendKeys(list.get(3).get(5));
		
		fb.getFirstname4().sendKeys(list.get(4).get(0));
		fb.getLastname4().sendKeys(list.get(4).get(1));
		fb.getGender4().sendKeys(list.get(4).get(2));
		fb.getMonth4().sendKeys(list.get(4).get(3));
		fb.getDay4().sendKeys(list.get(4).get(4));
		fb.getYear4().sendKeys(list.get(4).get(5));
		
		fb.getFirstname5().sendKeys(list.get(5).get(0));
		fb.getLastname5().sendKeys(list.get(5).get(1));
		fb.getGender5().sendKeys(list.get(5).get(2));
		fb.getMonth5().sendKeys(list.get(5).get(3));
		fb.getDay5().sendKeys(list.get(5).get(4));
		fb.getYear5().sendKeys(list.get(5).get(5));
		
		fb.getFirstname6().sendKeys(list.get(6).get(0));
		fb.getLastname6().sendKeys(list.get(6).get(1));
		fb.getGender6().sendKeys(list.get(6).get(2));
		fb.getMonth6().sendKeys(list.get(6).get(3));
		fb.getDay6().sendKeys(list.get(6).get(4));
		fb.getYear6().sendKeys(list.get(6).get(5));
	   
	}

	@And("Enter the card details")
	public void enter_the_card_details(DataTable table) {
		List<List<String>> list = table.asLists();
		fb.getCcno().sendKeys(list.get(1).get(0));
		fb.getExpmonth().sendKeys(list.get(1).get(1));
		fb.getExpyear().sendKeys(list.get(1).get(2));
		fb.getCvv().sendKeys(list.get(1).get(3));
		fb.getCardHolderName().sendKeys(list.get(1).get(4));
		fb.getCountry().sendKeys(list.get(1).get(5));
		fb.getBillingadd().sendKeys(list.get(1).get(6));
		fb.getCity().sendKeys(list.get(1).get(7));
		fb.getZipcode().sendKeys(list.get(1).get(8));
		fb.getPhoneno().sendKeys(list.get(1).get(9));
	    
	}


}
