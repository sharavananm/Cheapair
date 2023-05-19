package PageRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Steps.Hook;

public class FlightBookingRepo {
	
	public FlightBookingRepo() {
		PageFactory.initElements(Hook.driver, this);
	}
		
	@FindBy(id="from1")
	private WebElement fromCityName;
	
	@FindBy(xpath ="//*[contains(text(),'Madras')]")
	private WebElement selectFromCity;
	
	@FindBy(id = "to1")
	private WebElement toCityName;
	
	@FindBy(xpath ="//*[contains(text(),'Indira Gandhi')]")
	private WebElement selectToCity;
	
	@FindBy(xpath ="(//tbody//td/a[text()='20'])[1]")
	private WebElement departDate;
	
	@FindBy(xpath ="(//tbody//td/a[text()='25'])[1]")
	private WebElement returnDate;
	
	@FindBy(xpath ="(//button[contains(@class,'plus')])[1]")
	private WebElement adult;
	
	@FindBy(xpath ="(//button[contains(@class,'plus')])[2]")
	private WebElement seniors;
	
	@FindBy(xpath ="(//button[contains(@class,'plus')])[3]")
	private WebElement children;
	
	@FindBy(xpath ="(//button[contains(@class,'plus')])[4]")
	private WebElement infants;
	
	@FindBy(xpath ="//button[text()='Search Flights']")
	private WebElement searchFlight;
	
	@FindBy(xpath ="(//div[@class='sc-gikAfH exQzre']//button)[1]")
	private WebElement alertClose;
	
	@FindBy(xpath = "//div[contains(@class,'jqhqbE')]//span[@class='sc-fztKhi lfzpWR']/span")
	private WebElement departingFlight;
	
	@FindBy(xpath = "//div[contains(@class,'jqhqbE')]//span[@class='sc-fztKhi lfzpWR']/span")
	private WebElement returningFlight;
	
	@FindBy(xpath = "//button[@kind='primary']/div[contains(text(),'Continue')]")
	private WebElement continueButton;
	
	//------------------------------------P1
	@FindBy(id = "firstName1")
	private WebElement firstname1;
	
	@FindBy(id="lastName1")
	private WebElement lastname1;
	
	@FindBy(id="gender1")
	private WebElement gender1;
	
	@FindBy(id="dobMonth1")
	private WebElement month1;
	
	@FindBy(id="dobDay1")
	private WebElement day1;
	
	@FindBy(id="dobYear1")
	private WebElement year1;
	
	//-------------------------------------P2
	@FindBy(id = "firstName2")
	private WebElement firstname2;
	
	@FindBy(id="lastName2")
	private WebElement lastname2;
	
	@FindBy(id="gender2")
	private WebElement gender2;
	
	@FindBy(id="dobMonth2")
	private WebElement month2;
	
	@FindBy(id="dobDay2")
	private WebElement day2;
	
	@FindBy(id="dobYear2")
	private WebElement year2;
	
	//------------------------------------P3
	
	@FindBy(id = "firstName3")
	private WebElement firstname3;
	
	@FindBy(id="lastName3")
	private WebElement lastname3;
	
	@FindBy(id="gender3")
	private WebElement gender3;
	
	@FindBy(id="dobMonth3")
	private WebElement month3;
	
	@FindBy(id="dobDay3")
	private WebElement day3;
	
	@FindBy(id="dobYear3")
	private WebElement year3;
	
	//------------------------------------P4
	
	@FindBy(id = "firstName4")
	private WebElement firstname4;
	
	@FindBy(id="lastName4")
	private WebElement lastname4;
	
	@FindBy(id="gender4")
	private WebElement gender4;
	
	@FindBy(id="dobMonth4")
	private WebElement month4;
	
	@FindBy(id="dobDay4")
	private WebElement day4;
	
	@FindBy(id="dobYear4")
	private WebElement year4;
	
	//------------------------------------P5
	
	@FindBy(id = "firstName5")
	private WebElement firstname5;
	
	@FindBy(id="lastName5")
	private WebElement lastname5;
	
	@FindBy(id="gender5")
	private WebElement gender5;
	
	@FindBy(id="dobMonth5")
	private WebElement month5;
	
	@FindBy(id="dobDay5")
	private WebElement day5;
	
	@FindBy(id="dobYear5")
	private WebElement year5;
	
	//------------------------------------P6
	
	@FindBy(id = "firstName6")
	private WebElement firstname6;
	
	@FindBy(id="lastName6")
	private WebElement lastname6;
	
	@FindBy(id="gender6")
	private WebElement gender6;
	
	@FindBy(id="dobMonth6")
	private WebElement month6;
	
	@FindBy(id="dobDay6")
	private WebElement day6;
	
	@FindBy(id="dobYear6")
	private WebElement year6;
	
	//-----------------------------------
	
	@FindBy(id="ccNum1")
	private WebElement ccno;
	
	@FindBy(id="expMonth1")
	private WebElement expmonth;
	
	@FindBy(id="expYear1")
	private WebElement expyear;
	
	@FindBy(id="cvv1")
	private WebElement cvv;
	
	@FindBy(id="paymentName1")
	private WebElement cardHolderName;
	
	@FindBy(id="paymentCountry1")
	private WebElement country;
	
	@FindBy(id="paymentAddress1")
	private WebElement billingadd;
	
	@FindBy(id="paymanetCity1")
	private WebElement city;
	
	@FindBy(id="paymentState1")
	private WebElement state;
	
	@FindBy(id="paymentZip1")
	private WebElement zipcode;
	
	@FindBy(id="paymentPhone1")
	private WebElement phoneno;

	public WebElement getFromCityName() {
		return fromCityName;
	}

	public WebElement getSelectFromCity() {
		return selectFromCity;
	}

	public WebElement getToCityName() {
		return toCityName;
	}

	public WebElement getSelectToCity() {
		return selectToCity;
	}

	public WebElement getDepartDate() {
		return departDate;
	}

	public WebElement getReturnDate() {
		return returnDate;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getSeniors() {
		return seniors;
	}

	public WebElement getChildren() {
		return children;
	}

	public WebElement getInfants() {
		return infants;
	}

	public WebElement getSearchFlight() {
		return searchFlight;
	}

	public WebElement getAlertClose() {
		return alertClose;
	}

	public WebElement getDepartingFlight() {
		return departingFlight;
	}

	public WebElement getReturningFlight() {
		return returningFlight;
	}


	public WebElement getContinueButton() {
		return continueButton;
	}

	public WebElement getFirstname1() {
		return firstname1;
	}

	public WebElement getLastname1() {
		return lastname1;
	}

	public WebElement getGender1() {
		return gender1;
	}

	public WebElement getMonth1() {
		return month1;
	}

	public WebElement getDay1() {
		return day1;
	}

	public WebElement getYear1() {
		return year1;
	}

	public WebElement getFirstname2() {
		return firstname2;
	}

	public WebElement getLastname2() {
		return lastname2;
	}

	public WebElement getGender2() {
		return gender2;
	}

	public WebElement getMonth2() {
		return month2;
	}

	public WebElement getDay2() {
		return day2;
	}

	public WebElement getYear2() {
		return year2;
	}

	public WebElement getFirstname3() {
		return firstname3;
	}

	public WebElement getLastname3() {
		return lastname3;
	}

	public WebElement getGender3() {
		return gender3;
	}

	public WebElement getMonth3() {
		return month3;
	}

	public WebElement getDay3() {
		return day3;
	}

	public WebElement getYear3() {
		return year3;
	}

	public WebElement getFirstname4() {
		return firstname4;
	}

	public WebElement getLastname4() {
		return lastname4;
	}

	public WebElement getGender4() {
		return gender4;
	}

	public WebElement getMonth4() {
		return month4;
	}

	public WebElement getDay4() {
		return day4;
	}

	public WebElement getYear4() {
		return year4;
	}

	public WebElement getFirstname5() {
		return firstname5;
	}

	public WebElement getLastname5() {
		return lastname5;
	}

	public WebElement getGender5() {
		return gender5;
	}

	public WebElement getMonth5() {
		return month5;
	}

	public WebElement getDay5() {
		return day5;
	}

	public WebElement getYear5() {
		return year5;
	}
	
	

	public WebElement getFirstname6() {
		return firstname6;
	}

	public WebElement getLastname6() {
		return lastname6;
	}

	public WebElement getGender6() {
		return gender6;
	}

	public WebElement getMonth6() {
		return month6;
	}

	public WebElement getDay6() {
		return day6;
	}

	public WebElement getYear6() {
		return year6;
	}

	public WebElement getCcno() {
		return ccno;
	}

	public WebElement getExpmonth() {
		return expmonth;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getCardHolderName() {
		return cardHolderName;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getBillingadd() {
		return billingadd;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getZipcode() {
		return zipcode;
	}

	public WebElement getPhoneno() {
		return phoneno;
	}
	
	
	
	

}
