
public class Hotel {
private String Name;
private String Location;
private int StuffNumber;
private int RoomsNumber;
private int RoomPrice;
    
	public static int GeneralStuffNumber = 0;
	
    public String getName() {
		return Name;
	}
	
    public void setName(String Name) {
		this.Name = Name;
	}
	
	public String getLocation() {
		return Location;
	}

    public void setLocation(String Location) {
		this.Location = Location;
	}
	
    public int getStuffNumber() {
 		return StuffNumber;
	}
	
    public void setStuffNumber(int StuffNumber) {
		GeneralStuffNumber = GeneralStuffNumber - this.StuffNumber + StuffNumber;
		this.StuffNumber = StuffNumber;
	}
	
	public int getRoomsNumber() {
		return RoomsNumber;
	}
	
    public void setRoomsNumber(int RoomsNumber) {
		this.RoomsNumber = RoomsNumber;
	}
	
    public int getRoomPrice() {
		return RoomPrice;
	}
	
    public void setRoomPrice(int RoomPrice) {
		this.RoomPrice = RoomPrice;
	}
	
    public Hotel() {
		Name = "Geroge";
		Location = "Lviv";
		StuffNumber = 150;
		RoomsNumber = 100;
		RoomPrice = 450;
    }
	
    public Hotel (String Name, String Location, int StuffNumber, int RoomsNumber) {
		setName(Name);
		setLocation(Location);
		setStuffNumber(StuffNumber);
		setRoomsNumber(RoomsNumber);
		RoomPrice = 400;
    }
	
    public Hotel (String Name, String Location, int StuffNumber, int RoomsNumber, int RoomPrice) {
		setName(Name);
		setLocation(Location);
		setStuffNumber(StuffNumber);
		setRoomsNumber(RoomsNumber);
		setRoomPrice(RoomPrice);
    }
	
	public String toString() {
	    return "Hotel " + getName() + " with " + getStuffNumber() + " located in " + getLocation() + " has " + getRoomsNumber() + " rooms and price of each is " + getRoomPrice()  + " hrn." ;
		}
	
    static void printStaticSum() {
		System.out.println("There are " + GeneralStuffNumber + " employees in total.");
	}
	
    public void printSum() {
		System.out.println("Together with new " + getStuffNumber() + " employees, net of hotels " + getName() + " has got in general " + GeneralStuffNumber + " workers.");
		}
		
    public void resetValues(String Name, String Location, int StuffNumber, int RoomsNumber, int RoomPrice) {
		setName(Name);
		setLocation(Location);
		setStuffNumber(StuffNumber);
		setRoomsNumber(RoomsNumber);
		setRoomPrice(RoomPrice);
		}
}
