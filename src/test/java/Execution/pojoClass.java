package Execution;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import LibGlobal.BaseClass;

public class pojoClass extends BaseClass {

	
	public pojoClass() {
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="username")
	private WebElement userID;


	@FindBy(id="password")
	private WebElement password;

	@FindBy(id="login")
	private WebElement Login;

	public WebElement getUserID() {
		return userID;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return Login;
	}
	
	@FindBy(xpath="//select[@id='location']")
	private WebElement location;
	
	
	@FindBy(xpath="//select[@id='hotels']")
	private WebElement hotel;
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}
	@FindBy(xpath="//select[@id='room_type']")
	private WebElement roomType;
	
	@FindBy(xpath="(//select[@class='search_combobox'])[4]")
	private WebElement roomCount;
	
	@FindBy(xpath="//input[@id='datepick_in']")
	private WebElement checkinDate;
	
	@FindBy(xpath="//input[@id='datepick_out']")
	private WebElement checkOutDate;
	
	
	@FindBy(xpath="//select[@id='adult_room']")
	private WebElement adultCount;
	
	@FindBy(xpath="//select[@id='child_room']")
	private WebElement childCount;

	

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomCount() {
		return roomCount;
	}

	public WebElement getCheckinDate() {
		return checkinDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdultCount() {
		return adultCount;
	}

	public WebElement getChildCount() {
		return childCount;
	}
	

	
	@FindBy(id="first_name")
	private WebElement firstName;
	
	@FindBy(id="last_name")
	private WebElement LastName;
	
	@FindBy(id="address")
	private WebElement Address;
	
	@FindBy(id="cc_num")
	private WebElement CardNo;
	
	@FindBy(id="cc_type")
	private WebElement CardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement ExpiryMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement ExpiryYear;
	
	@FindBy(id="cc_cvv")
	private WebElement CVVNumber;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCardNo() {
		return CardNo;
	}

	public WebElement getCardType() {
		return CardType;
	}

	public WebElement getExpiryMonth() {
		return ExpiryMonth;
	}

	public WebElement getExpiryYear() {
		return ExpiryYear;
	}

	public WebElement getCVVNumber() {
		return CVVNumber;
	}
	@FindBy(id="book_now")
	private WebElement BookNow;

	public WebElement getBookNow() {
		return BookNow;
	}
	
	@FindBy(xpath="(//input[@class='select_text'])[1]")
	private WebElement OrderID;
	
	@FindBy(id="my_itinerary")
	private WebElement myitinerary;

	public WebElement getOrderID() {
		return OrderID;
	}

	public WebElement getMyitinerary() {
		return myitinerary;
	}

	
	@FindBy(xpath="//input[@id=\"radiobutton_0\"]")
	private WebElement selectbutton1;
	
	public WebElement getSelectbutton1() {
		return selectbutton1;
	}
	@FindBy(id="continue")
	private WebElement continueButton;
	
	@FindBy(xpath="(//input[@class='reg_button'])[1]")
	private WebElement submit;

	public WebElement getSelectbutton() {
		return getSelectbutton();
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	@FindBy(id="logout")
	private WebElement LogOut;

	public WebElement getLogOut() {
		return LogOut;
	}
	
	@FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[2]/a[2]")
	private WebElement BookedItinerary;

	public WebElement getBookedItinerary() {
		return BookedItinerary;
	}
	
	@FindBy(xpath="btn_id_545770")
	private WebElement record2;

	public WebElement getRecord2() {
		return record2;
	}
}
