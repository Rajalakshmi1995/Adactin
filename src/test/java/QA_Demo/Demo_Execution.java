package QA_Demo;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import LibGlobal.BaseClass;

public class Demo_Execution extends BaseClass{

	@BeforeClass
	public static void AtbeforeClass() {
		
		browserLaunch();
		clearCookies();
		windowMaximize();	
	}
	
	@Before
	public void AtBefore() {
		
		Date d = new Date();
		System.out.println(d);
		LaunchURL("http://demo.automationtesting.in/Register.html");
		System.out.println("///////////////Test Started///////////////////////");
	}
	
	@Test
	public void test1() throws IOException, InterruptedException {
		
		/*QA_POJO p = new QA_POJO();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		fillText(p.getFirstName(), readvaluefromExcel(0, 1));
		fillText(p.getLastName(), readvaluefromExcel(1, 1));
		fillText(p.getAddress(), readvaluefromExcel(2, 1));
		fillText(p.getEmail(), readvaluefromExcel(3, 1));
		fillText(p.getPhone(), readvaluefromExcel(4, 1));
		waituntil(p.getFemale(), 5000);
		//click(p.getFemale());
		click(p.getCricket());
		//waituntil(p.getHockey(), 5000);
		//click(p.getHockey());
	//	click(p.getMovies());
		fillText(p.getLanguages(), readvaluefromExcel(5, 1));
		dropdown(p.getSkills(), readvaluefromExcel(6, 1));
		dropdown(p.getSelectCountry(), readvaluefromExcel(7, 1));
		dropdown(p.getYear(), readvaluefromExcel(8, 1));
		dropdown(p.getMonth(), readvaluefromExcel(9, 1));
		dropdown(p.getDay(), readvaluefromExcel(10, 1));
		fillText(p.getPassword(), readvaluefromExcel(11, 1));
		fillText(p.getConfirmPassword(), readvaluefromExcel(12, 1));
		click(p.getSubmit());*/	
		String window = switchToWindow();
		System.out.println("Current Window ID : " + window);
		
	}
	
	@After
	public void AtAfter() {
		Date d = new Date();
		System.out.println(d);
		System.out.println("///////////////////Test Completed/////////////////");
		
	}
	
	//AfterClass
	public static void AtAfterClass() {
		close();
		quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
