package QA_Demo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import LibGlobal.BaseClass;

public class QA_POJO extends BaseClass {
	
	
	public QA_POJO() {	
		PageFactory.initElements(driver, this);	
	}
	
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	private WebElement FirstName;
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	private WebElement LastName;
	
	@FindBy(xpath="//textarea[@ng-model='Adress']")
	private WebElement Address;
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement Email;
	
	@FindBy(xpath="//input[@ng-model='Phone']")
	private WebElement phone;
	
	@FindBy(xpath="//input[@value='FeMale']")
	private WebElement Female;
	
	@FindBy(xpath="//input[@value='Cricket']")
	private WebElement Cricket;
	
	@FindBy(xpath="//input[@value='Movies']")
	private WebElement Movies;
	
	@FindBy(xpath="Hockey")
	private WebElement Hockey;
	
	@FindBy(xpath="//div[@id='msdd']")
	private WebElement Languages;
	
	@FindBy(xpath="//select[@id='Skills']")
	private List<WebElement> Skills;
	
	@FindBy(xpath="//select[@id='country']")
	private WebElement SelectCountry;
	
	@FindBy(xpath="//select[@id='yearbox']")
	private WebElement Year;
	
	@FindBy(xpath="//select[@placeholder='Month']")
	private WebElement Month;
	
	@FindBy(xpath="//select[@id='daybox']")
	private WebElement Day;
	
	@FindBy(id="firstpassword")
	private WebElement password;
	
	@FindBy(id="secondpassword")
	private WebElement confirmPassword;

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getFemale() {
		return Female;
	}

	public WebElement getCricket() {
		return Cricket;
	}

	public WebElement getMovies() {
		return Movies;
	}

	public WebElement getHockey() {
		return Hockey;
	}

	public WebElement getLanguages() {
		return Languages;
	}

	public WebElement getSkills() {
		return (WebElement) Skills;
	}

	public WebElement getSelectCountry() {
		return SelectCountry;
	}

	public WebElement getYear() {
		return Year;
	}

	public WebElement getMonth() {
		return Month;
	}

	public WebElement getDay() {
		return Day;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmPassword() {
		return confirmPassword;
	}
	
	@FindBy(id="submitbtn")
	private WebElement submit;

	public WebElement getSubmit() {
		return submit;
	}
	
	

}
