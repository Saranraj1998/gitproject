package kohli.s;


	

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.text.SimpleDateFormat;
	import java.util.Date;
	import java.util.List;
	import java.util.Set;

	import org.apache.poi.hssf.usermodel.HSSFWorkbook;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.DateUtil;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;
	public class Results {


		  WebDriver driver;
		//Setup Driver
		public  void getDriver() {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}
		//Get URL-	1
		public  void getUrl(String url) {
			driver.get(url);
		}
		//Get title-2
		public String getTitle() {
			String title = driver.getTitle();
			return title;
		}
		//Get current URL-3
		public String getCurrentUrl() {
			String currentUrl = driver.getCurrentUrl();
			return currentUrl;
		}
		//close Browser-4
		public  void close() {
	        driver.close(); 
		}
		//quit-5
		public  void quit() {
			driver.quit();
		}
		//locators by id-6
		public WebElement findElementById(String datas) {
	        WebElement element = driver.findElement(By.id(datas));
	        return element;
	     }
		//locators by name-7
		public WebElement findElementByName(String datas) {
			WebElement element = driver.findElement(By.name(datas));
			return element;
		}
		//locators by class-8
		public WebElement findElementByClass(String datas) {
			WebElement element = driver.findElement(By.className(datas));
			return element;
		}
		//locators by xpath-9
		public WebElement findElementByXpath(String datas) {
			WebElement element = driver.findElement(By.xpath(datas));
			return element;
		}
		//Sendkeys-10
		public void enterSendkeys(WebElement element,String data) {
			element.sendKeys(data);
		}
		//click-11
		public void click(WebElement element) {
			element.click();
		}
		//get text-12
		public String getText(WebElement element) {
			   String text = element.getText();
			   return text;
		}
		//Get attribute-13
		public String getAttribute(WebElement element) {
			String attribute = element.getAttribute("value");
			return attribute;
		}
		//mouse over action-14
		public void mouseOverAction(WebElement element) {
			Actions action = new Actions(driver);
			action.moveToElement(element).perform();
		}
		//Drag and Drop-15
		public void dragAndDrop(WebElement source,WebElement target) {
			Actions action = new Actions(driver);
			action.dragAndDrop(source, target).perform();
		}
		//Right click-16
		public void rightClick(WebElement element) {
			Actions action = new Actions(driver);
			action.contextClick(element).perform();
		}
		//doubleClick-17
		public void doubleClick(WebElement element) {
			Actions action = new Actions(driver);
			action.doubleClick(element).perform();
		}
		//Simple alert-18
		public Alert simpleAlert() {
			Alert alert = driver.switchTo().alert();
			alert.accept();
			return alert;
		}
		//ConfirmAlert-19
		public Alert confirmAlert() {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
			return alert;
		}
		//Prompt Alert-20
		public Alert promptAlertSendkeys(String datas) {
			Alert alert = driver.switchTo().alert();
			alert.sendKeys(datas);
			return alert;
		}
		//prompt alert with gettext-21
		public String proAlertGetText() {
			Alert alert = driver.switchTo().alert();
			String text2 = alert.getText();
			return text2;
		}
		//navigate to url-22
		public void navigateUrl(String url) {
			driver.navigate().to(url);
		}
		//navigate to back-23
		public void navigateBack() {
			driver.navigate().back();
		}
		//navigate to forward-24
		public void navigateForward() {
			driver.navigate().forward();
		}
		//navigate refresh-25
		public void navigateRefresh() {
			driver.navigate().refresh();
		}
		//JavasciptExcutorclick-26
		public void javaScriptExcutorclick(WebElement element) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click()",element);
		}
		//JavascriptExecutorsetAttribute-27
		public void jsExecutorsSetAtrribute(WebElement element,String datas) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].setAttribute('value','"+datas+"')", element);
		}
		//Javascriptexxcutor getattribute-28
		public String jsExecutorGetAttribute(WebElement element) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			String script = executor.executeScript("arguments[0].getAttibute('value')", element).toString();
			return script;
		}
		//scroll down-29
		public void javaexecutorScrollDown(WebElement element) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].scrollIntoView(false)",element);
		}
		//scroll up-30
		public void javaexecutorScrollUp(WebElement element) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].scrollIntoView(true)",element);
		}
		//take screenshot-31
		public File screenShot() {
			TakesScreenshot screenshot = (TakesScreenshot) driver;
			File file = screenshot.getScreenshotAs(OutputType.FILE);
			return file;
		}
		//selectbyindex-32
		public void selectByindex(WebElement element,int index) {
			Select select = new Select(element);
			select.selectByIndex(index);
		}
		//selectbytext-33
		public void selectBytext(WebElement element,String text) {
			Select select = new Select(element);
			select.selectByVisibleText(text);
		}
		//selectbyvalue-34
		public void selectByvalue(WebElement element,String datas) {
			Select select = new Select(element);
			select.selectByValue(datas);
		}
		//selectbyall selected options-35
		public List selectalloptions(WebElement element) {
			Select select = new Select(element);
			List<WebElement> list = select.getAllSelectedOptions();
			return list;
		}
		//selectfirstoptions-36
		public WebElement selectFirstOptions(WebElement element) {
			Select select = new Select(element);
			WebElement firstSelectedOption = select.getFirstSelectedOption();
			return firstSelectedOption;
		}
		//select get options-37
		public List SelectGetOptions(WebElement element) {
			Select select = new Select(element);
			List<WebElement> options = select.getOptions();
			return options;
		}
		//deselectByindex-38
		public void deselectByIndex(WebElement element,int index) {
			Select select = new Select(element);
			select.deselectByIndex(index);
		}
		//deselectByvalue-38
		public void deselectByValue(WebElement element,String value) {
			Select select = new Select(element);
			select.deselectByValue(value);
		}
		//deselectBytext-39
		public void deselectBytext(WebElement element,String text) {
			Select select = new Select(element);
			select.deselectByVisibleText(text);
		}
		//deselectAll-40
		public void deselectAll(WebElement element) {
			Select select = new Select(element);
			select.deselectAll();
		}
		//Frame id-41
		public void frameId(String datas) {
			driver.switchTo().frame(datas);
		}
		//frameindex-42
		public void frameIndex(int index) {
			driver.switchTo().frame(index);
		}
		//frame webelement-43
		public void frameWebelement(WebElement element) {
			driver.switchTo().frame(element);
		}
		//Getwindow handle-44
		public String windowhandleById() {
			String windowHandle = driver.getWindowHandle();
			return windowHandle;
		}
		//getWindowHandles-45	
		public Set windowsHandles() {
			Set<String> windowHandles = driver.getWindowHandles();
			return windowHandles;
		}

	   //windowsmaximize

	 public void maximize() {
		 driver.manage().window().maximize();
	 }
	 
	 public String getData(String sheetName,int rowNo,int CellNo) throws IOException {
			
			String data=null;
			
			
			File file = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Parag\\ExcelSheet\\Excel.xlsx");
			
			FileInputStream stream = new FileInputStream(file);
			
			Workbook workbook = new XSSFWorkbook(stream);
			
			Sheet sheet = workbook.getSheet(sheetName);
			
			Row row = sheet.getRow(rowNo);
			
			Cell cell = row.getCell(CellNo);
			
			int type = cell.getCellType();
			
			
			
			if(type==0) {
				if(DateUtil.isCellDateFormatted(cell)) {
					Date cellValue = cell.getDateCellValue();
					SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
					 data =format.format(cellValue);
				}else {
					double cellValue = cell.getNumericCellValue();
					long l = (long)cellValue;
					 data = String.valueOf(l);
				}
			}
			if(type==1) {
				 String x = cell.getStringCellValue();
			data=x;
			}	
			return data;
			
		}
			
	public  void getTextfromWeb() throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement txtUser = driver.findElement(By.id("Skills"));
		Select select=new Select(txtUser);
		List<WebElement> options = select.getOptions();
		
		File file = new File("C:\\Users\\New\\Desktop\\New folder\\MavenPrograms\\filess\\test.xls");
		Workbook book = new HSSFWorkbook();
		Sheet createSheet = book.createSheet("Datas");
		for (int i = 0; i < options.size(); i++) {
			WebElement element = options.get(i);
			String text = element.getText();
			System.out.println(text);
		
		Row row = createSheet.createRow(i);	

		Cell cell=row.createCell(0);
		cell.setCellValue(options.get(i).getText());
		}
		FileOutputStream out = new FileOutputStream(file);
		book.write(out);
	}

	public void insertNewNameSheet(String sheetName,int rowNo,int cellNo,String newData) throws IOException {
		
		File file = new File("C:\\\\Users\\\\New\\\\Desktop\\\\New folder\\\\MavenPrograms\\\\filess\\\\hotelapp.xlsx");
		
		FileInputStream stream = new FileInputStream(file);
		
		Workbook workbook = new XSSFWorkbook(stream);
		
		Sheet sheet = workbook.getSheet(sheetName);
		
		Row row = sheet.getRow(rowNo);

		Cell cell = row.createCell(cellNo);
		
		cell.setCellValue(newData);
		
		FileOutputStream outputStream = new FileOutputStream(file);
		
		workbook.write(outputStream);	

	}

	}


