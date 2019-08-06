package Booking;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageBean.HotelBookingPage;
import pageBean.HotelBookingPage;

public class HotelBooking {

	private WebDriver driver;
	private HotelBookingPage bookingPageFactory;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Prakhar_Project\\BDD\\chromedriver_win32\\chromedriver.exe" );
		
		driver= new ChromeDriver();
	}
	
	@Given("^user is on 'hotelBooking' page$")
	public void user_is_on_hotelBooking_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.get("D:\\Prakhar_Project\\BDD\\BDD_CaseStudy\\src\\hotelbooking.html");
		bookingPageFactory= new HotelBookingPage(driver);

	}

	@When("^user enters invalid first name$")
	public void user_enters_invalid_first_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		bookingPageFactory.setFirstName("");
		bookingPageFactory.setConfirmButton();
	}

	@Then("^displays 'Please fill the first Name'$")
	public void displays_Please_fill_the_first_Name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String expectedMessage="Please fill the First Name";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters invalid last name$")
	public void user_enters_invalid_last_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		bookingPageFactory.setFirstName("Prakhar");
		bookingPageFactory.setLastName("");
		bookingPageFactory.setConfirmButton();
	}

	@Then("^displays 'Please fill the Last Name'$")
	public void displays_Please_fill_the_Last_Name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String expectedMessage="Please fill the Last Name";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters invalid email$")
	public void user_enters_invalid_email() throws Throwable {
		bookingPageFactory.setFirstName("Prakhar");
		bookingPageFactory.setLastName("Khetan");
		bookingPageFactory.setEmail("");
		bookingPageFactory.setConfirmButton();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^display 'Please fill the Email'$")
	public void display_Please_fill_the_Email() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String expectedMessage="Please fill the Email";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters invalid mobile number$")
	public void user_enters_invalid_mobile_number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		bookingPageFactory.setFirstName("Prakhar");
		bookingPageFactory.setLastName("Khetan");
		bookingPageFactory.setEmail("prakhar.khetan@capgemini.com");
		bookingPageFactory.setMobileNo("");
		bookingPageFactory.setConfirmButton();
	}

	@Then("^display 'Please fill Mobile No\\.'$")
	public void display_Please_fill_Mobile_No() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		String expectedMessage="Please fill the Mobile No.";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters wrong mobile number$")
	public void user_enters_wrong_mobile_number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		bookingPageFactory.setFirstName("Prakhar");
		bookingPageFactory.setLastName("Khetan");
		bookingPageFactory.setEmail("prakhar.khetan@capgemini.com");
		bookingPageFactory.setMobileNo("9839603595");
		bookingPageFactory.setConfirmButton();
	}

	@Then("^display 'Please enter valid Mobile Number'$")
	public void display_Please_enter_valid_Mobile_Number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String expectedMessage="Please enter valid Contact no.";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters invalid Number of People staying$")
	public void user_enters_invalid_Number_of_People_staying() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		bookingPageFactory.setFirstName("Prakhar");
		bookingPageFactory.setLastName("Khetan");
		bookingPageFactory.setEmail("prakhar.khetan@capgemini.com");
		bookingPageFactory.setMobileNo("9839603595");
		bookingPageFactory.setPersonCount("");
		bookingPageFactory.setConfirmButton();
	}

	@Then("^display 'Number of people staying'$")
	public void display_Number_of_people_staying() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String expectedMessage="Please fill the Number of people attending";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user does not enter address$")
	public void user_does_not_enter_address() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

	@Then("^display 'Please Enter Address'$")
	public void display_Please_Enter_Address() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user enters invalid City$")
	public void user_enters_invalid_City() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		bookingPageFactory.setFirstName("Prakhar");
		bookingPageFactory.setLastName("Khetan");
		bookingPageFactory.setEmail("prakhar.khetan@capgemini.com");
		bookingPageFactory.setMobileNo("9839603595");
		bookingPageFactory.setPersonCount("2");
		bookingPageFactory.setCity("");
		bookingPageFactory.setConfirmButton();
	}

	@Then("^display 'Please fill City'$")
	public void display_Please_fill_City() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		String expectedMessage="Please select city";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters invalid State$")
	public void user_enters_invalid_State() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		bookingPageFactory.setFirstName("Prakhar");
		bookingPageFactory.setLastName("Khetan");
		bookingPageFactory.setEmail("prakhar.khetan@capgemini.com");
		bookingPageFactory.setMobileNo("9839603595");
		bookingPageFactory.setPersonCount("2");
		bookingPageFactory.setCity("Basti");
		bookingPageFactory.setState("");
		bookingPageFactory.setConfirmButton();
	}

	@Then("^display 'Please fill the State'$")
	public void display_Please_fill_the_State() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		String expectedMessage="Please select state";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters invalid name$")
	public void user_enters_invalid_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		bookingPageFactory.setFirstName("Prakhar");
		bookingPageFactory.setLastName("Khetan");
		bookingPageFactory.setEmail("prakhar.khetan@capgemini.com");
		bookingPageFactory.setMobileNo("9839603595");
		bookingPageFactory.setPersonCount("2");
		bookingPageFactory.setCity("Basti");
		bookingPageFactory.setState("U.P");
		bookingPageFactory.setCardHolder("");
		bookingPageFactory.setConfirmButton();
	}

	@Then("^displays 'Please fill the CardHolder Name'$")
	public void displays_Please_fill_the_CardHolder_Name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		String expectedMessage="Please fill the Card holder name";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters invalid Debit Card Number$")
	public void user_enters_invalid_Debit_Card_Number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		bookingPageFactory.setFirstName("Prakhar");
		bookingPageFactory.setLastName("Khetan");
		bookingPageFactory.setEmail("prakhar.khetan@capgemini.com");
		bookingPageFactory.setMobileNo("9839603595");
		bookingPageFactory.setPersonCount("2");
		bookingPageFactory.setCity("Basti");
		bookingPageFactory.setState("U.P");
		bookingPageFactory.setCardHolder("Prakhar");
		bookingPageFactory.setCardNumber("");
		bookingPageFactory.setConfirmButton();
	}

	@Then("^displays 'Please fill Debit Card Number'$")
	public void displays_Please_fill_Debit_Card_Number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String expectedMessage="Please fill the Debit card Number";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user does not enter CVV value$")
	public void user_does_not_enter_CVV_value() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		bookingPageFactory.setFirstName("Prakhar");
		bookingPageFactory.setLastName("Khetan");
		bookingPageFactory.setEmail("prakhar.khetan@capgemini.com");
		bookingPageFactory.setMobileNo("9839603595");
		bookingPageFactory.setPersonCount("2");
		bookingPageFactory.setCity("Basti");
		bookingPageFactory.setState("U.P");
		bookingPageFactory.setCardHolder("Prakhar");
		bookingPageFactory.setCardNumber("123456");
		bookingPageFactory.setCVV("");
		bookingPageFactory.setConfirmButton();
	}

	@Then("^displays 'Please fill CVV number'$")
	public void displays_Please_fill_CVV_number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		String expectedMessage="Please fill the CVV";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters invalid expiration month$")
	public void user_enters_invalid_expiration_month() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		bookingPageFactory.setFirstName("Prakhar");
		bookingPageFactory.setLastName("Khetan");
		bookingPageFactory.setEmail("prakhar.khetan@capgemini.com");
		bookingPageFactory.setMobileNo("9839603595");
		bookingPageFactory.setPersonCount("2");
		bookingPageFactory.setCity("Basti");
		bookingPageFactory.setState("U.P");
		bookingPageFactory.setCardHolder("Prakhar");
		bookingPageFactory.setCardNumber("123456");
		bookingPageFactory.setCVV("123");
		bookingPageFactory.setExpirationMonth("");
		bookingPageFactory.setConfirmButton();
	}

	@Then("^displays 'Please fill expiration month'$")
	public void displays_Please_fill_expiration_month() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		String expectedMessage="Please fill expiration month";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters invalid expiration year$")
	public void user_enters_invalid_expiration_year() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		bookingPageFactory.setFirstName("Prakhar");
		bookingPageFactory.setLastName("Khetan");
		bookingPageFactory.setEmail("prakhar.khetan@capgemini.com");
		bookingPageFactory.setMobileNo("9839603595");
		bookingPageFactory.setPersonCount("2");
		bookingPageFactory.setCity("Basti");
		bookingPageFactory.setState("U.P");
		bookingPageFactory.setCardHolder("Prakhar");
		bookingPageFactory.setCardNumber("123456");
		bookingPageFactory.setCVV("123");
		bookingPageFactory.setExpirationMonth("05");
		bookingPageFactory.setExpirationYear("");
		bookingPageFactory.setConfirmButton();
	}

	@Then("^displays 'Please fill expiration year'$")
	public void displays_Please_fill_expiration_year() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String expectedMessage="Please fill the expiration year";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters valid  payment details$")
	public void user_enters_valid_payment_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		bookingPageFactory.setFirstName("Prakhar");
		bookingPageFactory.setLastName("Khetan");
		bookingPageFactory.setEmail("prakhar.khetan@capgemini.com");
		bookingPageFactory.setMobileNo("9839603595");
		bookingPageFactory.setPersonCount("2");
		bookingPageFactory.setCity("Basti");
		bookingPageFactory.setState("U.P");
		bookingPageFactory.setCardHolder("Prakhar");
		bookingPageFactory.setCardNumber("123456");
		bookingPageFactory.setCVV("123");
		bookingPageFactory.setExpirationMonth("05");
		bookingPageFactory.setExpirationYear("2024");
		bookingPageFactory.setConfirmButton();
	}

	@Then("^displays 'Success' page$")
	public void displays_Success_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		driver.navigate().to("file://localhost/D:/Prakhar_Project/BDD/BDD_CaseStudy/src/success.html");
		driver.close();
	}


}
