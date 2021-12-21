package kohli.s;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchHotelPage extends Reusable {
	
	
	
	
	@FindBy(id="location")
	private WebElement txtLocation;
	
	@FindBy(id="hotels")
	private WebElement txtHotles;
	
	@FindBy(id="roomType")
	private WebElement txtRoomType;
	
	@FindBy(id="room_nos")
	private WebElement txtNoOfRooms;
	
	
	@FindBy(id="datepick_in")
	private WebElement txtCheckInDate;
	
	@FindBy(id="datepick_out")
	private WebElement txtChechOutDate;
	
	
	@FindBy(id="adult_room")
	private WebElement txtAdultPerRoom;
	
	
	@FindBy(id="child_room")
	private WebElement txtChildrenPerRoom;
	
	
	@FindBy(id="summit")
	private WebElement txtSearch ;
	
	
	
	public void searchHotel(String location, String hotels, String roomtype, String checkInDate, String checkOutDate, String adultsPerRoom, String childPerRoom) {
	
	
		
		
		
		
	}
		
		
		
		
		
		
		
	}
