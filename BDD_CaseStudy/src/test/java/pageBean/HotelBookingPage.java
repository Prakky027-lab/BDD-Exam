package pageBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelBookingPage {
	WebDriver driver;
	
	@FindBy(name="txtFN")
	@CacheLookup
	WebElement firstName;
	
	@FindBy(name="txtLN")
	@CacheLookup
	WebElement lastName;
	
	@FindBy(name="Email")
	@CacheLookup
	WebElement email;
	
	
	@FindBy(name="Phone")
	@CacheLookup
	WebElement mobileNo;
	
	@FindBy(name="city")
	@CacheLookup
	WebElement City; 
	
	@FindBy(name="state")
	@CacheLookup
	WebElement State;
	
	@FindBy(name="persons")
	@CacheLookup
	WebElement personCount;
	
	
	@FindBy(id="rooms")
	@CacheLookup
	WebElement Rooms;
	
	@FindBy(name="txtFN")
	@CacheLookup
	WebElement CardHolder;
	
	@FindBy(name="debit")
	@CacheLookup
	WebElement cardNumber;
	
	@FindBy(name="cvv")
	@CacheLookup
	WebElement CVV;
	
	@FindBy(name="month")
	@CacheLookup
	WebElement expirationMonth;
	
	@FindBy(name="year")
	@CacheLookup
	WebElement expirationYear;
	
	@FindBy(id="btnPayment")
	@CacheLookup
	WebElement confirmButton;

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
	}

	public WebElement getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email.sendKeys(email);
	}

	public WebElement getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo.sendKeys(mobileNo);
	}

	public WebElement getCity() {
		return City;
	}

	public void setCity(String city) {
		this.City.sendKeys(city);
	}

	public WebElement getState() {
		return State;
	}

	public void setState(String state) {
		this.State.sendKeys(state);
	}

	public WebElement getPersonCount() {
		return personCount;
	}

	public void setPersonCount(String personCount) {
		this.personCount.sendKeys(personCount);
	}

	public WebElement getRooms() {
		return Rooms;
	}

	public void setRooms(String rooms) {
		this.Rooms.sendKeys(rooms);
	}

	public WebElement getCardHolder() {
		return CardHolder;
	}

	public void setCardHolder(String cardHolder) {
		this.CardHolder.sendKeys(cardHolder);
	}

	public WebElement getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber.sendKeys(cardNumber);
	}

	public WebElement getCVV() {
		return CVV;
	}

	public void setCVV(String cVV) {
		this.CVV.sendKeys(cVV);
	}

	public WebElement getExpirationMonth() {
		return expirationMonth;
	}

	public void setExpirationMonth(String expirationMonth) {
		this.expirationMonth.sendKeys(expirationMonth);
		}

	public WebElement getExpirationYear() {
		return expirationYear;
	}

	public void setExpirationYear(String expirationYear) {
		this.expirationYear.sendKeys(expirationYear);
	}

	public WebElement getConfirmButton() {
		return confirmButton;
	}

	public void setConfirmButton() {
		this.confirmButton.click();
	}	
	
	public HotelBookingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
}
