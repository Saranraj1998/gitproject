package kohli.s;


	

	import java.io.IOException;

	import org.openqa.selenium.WebElement;
	public class BaceClassCreation {
	

	public static void main(String[] args) throws IOException, Exception {
		
		
		Results global=new Results();
		global.getDriver();
		global.maximize();
		global.getUrl("https://adactinhotelapp.com/");
		WebElement txtUser = global.findElementById("username");
		String pass = global.getData("Datas",1,0);
		global.enterSendkeys(txtUser, pass);
		WebElement txtpass = global.findElementById("password");
		String passdata = global.getData("Datas", 1, 1);
		global.enterSendkeys(txtpass, passdata);
		WebElement btnclick = global.findElementById("login");
		global.click(btnclick);
		WebElement location = global.findElementById("location");
		global.selectBytext(location, "London");
		WebElement hotels = global.findElementById("hotels");
		global.selectBytext(hotels, "Hotel Creek");
		WebElement roomType = global.findElementById("room_type");
		global.selectBytext(roomType, "Double");
		WebElement roomNos = global.findElementById("room_nos");
		global.selectBytext(roomNos, "2 - Two");
		WebElement dateIn = global.findElementById("datepick_in");
		dateIn.clear();
		String enterDate = global.getData("hotel", 1, 2);
		global.enterSendkeys(dateIn, enterDate);
		WebElement dateOut = global.findElementById("datepick_out");
		dateOut.clear();
		String dateExit = global.getData("hotel", 1, 3);
		global.enterSendkeys(dateOut, dateExit);
		WebElement roomMem = global.findElementById("adult_room");
		global.selectBytext(roomMem, "2 - Two");
		WebElement roommemChild = global.findElementById("child_room");
		global.selectBytext(roommemChild, "0 - None");
		WebElement btnclick1 = global.findElementById("Submit");
		global.click(btnclick1);
		WebElement btnclick2 = global.findElementById("radiobutton_0");
		global.click(btnclick2);
		WebElement btnclick3 = global.findElementById("continue");
		global.click(btnclick3);
		WebElement firstName = global.findElementById("first_name");
		String enterFirst = global.getData("hotel", 1, 4);
		global.enterSendkeys(firstName, enterFirst);
		WebElement lastName = global.findElementById("last_name");
		String enterLast = global.getData("hotel", 1, 5);
		global.enterSendkeys(lastName, enterLast);
		WebElement address = global.findElementById("address");
		String enterAddr = global.getData("hotel", 1, 6);
		global.enterSendkeys(address, enterAddr);
		WebElement ccNum = global.findElementById("cc_num");
		String enterccnum = global.getData("hotel", 1, 7);
		global.enterSendkeys(ccNum, enterccnum);
		WebElement cctype = global.findElementById("cc_type");
		global.selectBytext(cctype, "VISA");
		WebElement ccexpmonth = global.findElementById("cc_exp_month");
		global.selectBytext(ccexpmonth, "March");
		WebElement ccYear = global.findElementById("cc_exp_year");
		global.selectBytext(ccYear, "2022");
		WebElement cvv = global.findElementById("cc_cvv");
		String entercvv = global.getData("hotel", 1, 8);
		global.enterSendkeys(cvv, entercvv);
		WebElement btnclick4 = global.findElementById("book_now");
		global.click(btnclick4);
		
		WebElement order = global.findElementByXpath("//input[@id='order_no']");
		String value = global.getAttribute(order);
		global.insertNewNameSheet("hotel", 1, 9, value);
		
		
		
		
		
		
		
	}



	}
	
	

