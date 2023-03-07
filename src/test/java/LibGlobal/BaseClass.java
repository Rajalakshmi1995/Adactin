package LibGlobal;

	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.text.SimpleDateFormat;
	import java.util.ArrayList;
	import java.util.Date;
	import java.util.Iterator;
	import java.util.List;
	import java.util.Set;

	import org.apache.commons.io.FileUtils;
	import org.apache.commons.lang3.time.DateFormatUtils;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.DateUtil;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.apache.xmlbeans.impl.store.Public2;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebDriver.Timeouts;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedCondition;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import io.github.bonigarcia.wdm.WebDriverManager;

	
	public class BaseClass {	
		public static WebDriver driver;
		
		public static Select select;
		
		public static Robot robot;
		
		public static JavascriptExecutor js;
		
		public static void browserLaunch() {
			
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();

		}

		public static void windowMaximize() {
			driver.manage().window().maximize();
			

		}
		
		
		public static void clearCookies() {
			driver.manage().deleteAllCookies();
		}
		
		
		
		public static void LaunchURL(String URL) {
			
			driver.get(URL);
		}
		
		public static String getTitle() {
			String Title = driver.getTitle();
			
			System.out.println(Title);
			return Title;

		}
		
		public static void clearText(WebElement element) {
			
			element.clear();

		}
		
		public static void close() {
			
			driver.close();
		}
		
		public static void quit() {
			driver.quit();
		}
		
		public static String getpagesource() {
			
			
			String pageSource = driver.getPageSource();
			System.out.println(pageSource);
			return pageSource;
		}
		
		public static void partition() {
			
			System.out.println("-------------------------------------------------------------");
		}
		
		public static void waituntil(WebElement webElement, int time) throws InterruptedException {
			
			
			WebDriverWait wait = new WebDriverWait(driver, 5000);
			wait.until(ExpectedConditions.visibilityOf(webElement)); 
			wait.until(ExpectedConditions.elementToBeClickable(webElement));
		}
		
		public static void fillText(WebElement element, String Value) {
		
			element.sendKeys(Value);
			
		}
		
		public static void javascriptClick(WebElement element) {
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", element);
		}
		
		public static void javascripttext() {
		 
			js.executeScript("document.getElementByxpath('//span[contains(text(),'Enter Email/Mobile number')]').value='SoftwareTestingMaterial.com'");
		}
		
		public static void click(WebElement element) {
			element.click();

		}

		private void switchFrame(WebElement element) {
			driver.switchTo().frame(element);
		

		}
		
		public static String getAttribute(WebElement element) {
			String text = element.getAttribute("value");
			//System.out.println(text);
			return text;
		}
		
		public static void AcceptAlert() {
			
			driver.switchTo().alert().accept();

		}
		
		
		public static void dismissAlert() {
			driver.switchTo().alert().dismiss();

		}
		
		public static void sendTexttoAlert(String Value) {
			driver.switchTo().alert().sendKeys(Value);

		}
		
		public static String switchToWindow() {
		
			String CurrentWindow = driver.getWindowHandle();
			
			Set<String> AllWindow = driver.getWindowHandles();

			Iterator<String> it = AllWindow.iterator();
			
			while(it.hasNext()){
				
				String ChildWindow = it.next(); 
				
				
				if(!ChildWindow.equalsIgnoreCase(CurrentWindow)) {
					
					driver.switchTo().window(ChildWindow);
					String title = driver.getTitle();
					System.out.println("Current Title is "+ title );	
				}
				
				
		}
			return CurrentWindow;
			
			
		
		
		}
		
		public static void switchToWindow2() {
			
			String parentWindow = driver.getWindowHandle();
			
			Set<String> AllWindow = driver.getWindowHandles();
			
			for (String ChildWindow : AllWindow) {
				
				if(!ChildWindow.equals(parentWindow)) {
					
					driver.switchTo().window(ChildWindow);
					System.out.println("Current Windpw ID : " +ChildWindow);
					
				}
				
				
			}	
					
		}
		
		
		
		
		
		public static void dropdown(WebElement Element, String Value) {
			
			
			 select = new Select(Element);
			 select.selectByVisibleText(Value);

		}
		
		public static void dropDownWithoutSelectTag(List <WebElement> AllOptions, String Value) {
			
			
			for (WebElement CurrentOption : AllOptions) {
				
				if(CurrentOption.equals(Value)) {
					
				CurrentOption.click();
				break;
				}
				
			}	
			
		}
		
		
		public static void copyandPaste(WebElement element) throws AWTException {
			
			
			 robot = new Robot();
			 robot.keyPress(KeyEvent.VK_CONTROL);
			 robot.keyPress(KeyEvent.VK_C);
			 robot.keyRelease(KeyEvent.VK_C);
			 robot.keyRelease(KeyEvent.VK_CONTROL);
			 
			 element.click();
			 
			 robot.keyPress(KeyEvent.VK_CONTROL);
			 robot.keyPress(KeyEvent.VK_V);
			 robot.keyRelease(KeyEvent.VK_C);
			 robot.keyRelease(KeyEvent.VK_CONTROL);

		}
		
		
		public static void Takescreenshot(String FileName) throws IOException {
		
			TakesScreenshot screenshot = (TakesScreenshot)driver;
			File source = screenshot.getScreenshotAs(OutputType.FILE);
			
			File Destination  = new File("C:\\Users\\Raji\\eclipse-workspace\\LanguageDetails\\Maven_Adactin\\ScreenShot"+FileName+".png");
			
			FileUtils.copyFile(source, Destination);
			
		}
		
		public static String readvaluefromExcel( int row, int col) throws IOException {
			
			File f = new File("C:\\Users\\Raji\\eclipse-workspace\\LanguageDetails\\Maven_Adactin\\Excel\\QA.xlsx");
			FileInputStream fin = new FileInputStream(f);
			XSSFWorkbook book = new XSSFWorkbook(fin);
			XSSFSheet sheet = book.getSheet("Sheet1");
			Row r= sheet.getRow(row);
			Cell cell = r.getCell(col);
			int type = cell.getCellType();
			 String Data = "" ;
			 
			 if(type == 1) {
				 
				 Data = cell.getStringCellValue();
			 }else if(DateUtil.isCellDateFormatted(cell)) {
				 
				 Date dateCellValue = cell.getDateCellValue();
				 SimpleDateFormat d = new SimpleDateFormat("DD-MM-YYYY");
				 Data = d.format(dateCellValue);
				 
			 }else {
				 
				 
				Double d = cell.getNumericCellValue();
				Data = String.valueOf(d);
			 }
			 
			 
			 return Data;
			 
		}
		
		
		
		public static void WriteValueinExcel(String FileName, int row, int col) throws IOException {
			
			File f = new File("C:\\Users\\Raji\\eclipse-workspace\\LanguageDetails\\Adactin_Maven\\Excel"+FileName+".xsls");
			FileOutputStream fout = new FileOutputStream("");
			Workbook book = new XSSFWorkbook();
			Sheet sheet = book.createSheet("Sheet1");
			Row r = sheet.createRow(row);
			Cell cell = r.createCell(col);
			book.write(fout);
		}
		
		
		public static void ScrollIntoView(WebElement element) {
			
			 js = (JavascriptExecutor)driver;
			 js.executeScript("arguments[0].scrollintoview(true)", element);
			
		}
		
		
	}

	
	

