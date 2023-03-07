package Execution;

import java.io.IOException;
import java.util.Date;
import java.util.Set;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.json.StaticInitializerCoercer;
import org.openqa.selenium.remote.ScreenshotException;

import LibGlobal.BaseClass;

public class ExecutionClass extends BaseClass{

	public static pojoClass p ;

		@BeforeClass
		
		public static void BrowserLaunch() {	
			browserLaunch();
			windowMaximize();
			clearCookies();
			
			//Set<String> windowHandles = driver.getWindowHandles();
			//System.out.println("Current Window is"+ windowHandles);	
		}
		@Before	
		public  void start() {
			
			System.out.println("*************Test Case started**********");
			Date d =new Date();
			System.out.println(d);
			
		}	
		@Test
		public  void BookHotel() throws IOException, InterruptedException {
			 pojoClass p = new pojoClass();
			
			 String URL = "http://adactinhotelapp.com/index.php";
				LaunchURL(URL);
				getTitle();
			fillText(p.getUserID(), readvaluefromExcel(0, 1));
			fillText(p.getPassword(), readvaluefromExcel(1, 1));
			click(p.getLogin());
			dropdown(p.getLocation(), "London");
			dropdown(p.getHotel(), readvaluefromExcel(3, 1));
			dropdown(p.getRoomType(), readvaluefromExcel(4, 1));
		 // dropdown(p.getRoomCount(), readvaluefromExcel(5, 1));
			clearText(p.getCheckinDate());
			fillText(p.getCheckinDate(), "26/01/2022");
		//	fillText(p.getCheckOutDate(), readvaluefromExcel(7, 1));
		//	dropdown(p.getAdultCount(), readvaluefromExcel(8, 1));
		//	dropdown(p.getChildCount(), readvaluefromExcel(9, 1));
			click(p.getSubmit());
			waituntil(p.getSelectbutton1(), 5000);
			click(p.getSelectbutton1());
			click(p.getContinueButton());
			fillText(p.getFirstName(), "RAJALAKSHMI");
			fillText(p.getLastName(), "kuppusamy");
			fillText(p.getAddress(), "No:33, Vasan Nagar, Lawspet. Puducherry-605008");
			fillText(p.getCardNo(), "7410852096307410");
			dropdown(p.getCardType(), "VISA");
			dropdown(p.getExpiryMonth(), "October");
			dropdown(p.getExpiryYear(), "2022");
			fillText(p.getCVVNumber(), "459");
			click(p.getBookNow());
			waituntil(p.getMyitinerary(), 5000);
			click(p.getMyitinerary());
			System.out.println("Hotel Booked");	
			System.out.println("Order ID:  " + getAttribute(p.getOrderID()));
			Takescreenshot("Booking Order");	
			click(p.getLogOut());
			
		}	
		
		@Test   
		public void CancelHotel() throws IOException {
			pojoClass p = new pojoClass();
			
			
			String URL = "http://adactinhotelapp.com/index.php";
			LaunchURL(URL);
			getTitle();
			fillText(p.getUserID(), readvaluefromExcel(0, 1));
			fillText(p.getPassword(), readvaluefromExcel(1, 1));
			click(p.getLogin());
			click(p.getBookedItinerary());
	//		click(p.getRecord2());
			System.out.println("Order Cancelled");
			Takescreenshot("Cancel Order");
			
		}	
		@After	
		public void End() {			
			Date d = new Date();
			System.out.println(d);
			System.out.println("***********Test Case Completed****************");
		}
		
		//	@AfterClass
		
		//public static void BrowserClose() {
			
		//		close();
		//	}*/
		
}
		
		

		
		
		
	
		
		
		
		
	


