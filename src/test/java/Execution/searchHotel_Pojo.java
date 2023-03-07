package Execution;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import LibGlobal.BaseClass;

public class searchHotel_Pojo extends BaseClass{
	
	public searchHotel_Pojo() {
		
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="(//select[@class='search_combobox'])[1]")
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
	
	@FindBy(xpath="//select[@id='room_nos']")
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
	
	@FindBy(id="radiobutton_0")
	private WebElement selectbutton;
	
	@FindBy(id="continue")
	private WebElement continueButton;
	
	@FindBy(xpath="(//input[@class='reg_button'])[1]")
	private WebElement submit;

	public WebElement getSelectbutton() {
		return selectbutton;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
}
