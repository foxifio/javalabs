public class Hotel {
private String name;
private String location;
private int stuffNumber;
private int roomsNumber;
private int roomPrice;
    
	public static int generalStuffNumber = 0;
	
    public String getName() {
		return name;
	}
	
    public void setName(String name) {
		this.name = name;
	}
	
	public String getLocation() {
		return location;
	}

    public void setLocation(String location) {
		this.location = location;
	}
	
    public int getStuffNumber() {
 		return stuffNumber;
	}
	
    public void setStuffNumber(int stuffNumber) {
		generalStuffNumber = generalStuffNumber - this.stuffNumber + stuffNumber;
		this.stuffNumber = stuffNumber;
	}
	
	public int getRoomsNumber() {
		return roomsNumber;
	}
	
    public void setRoomsNumber(int roomsNumber) {
		this.roomsNumber = roomsNumber;
	}
	
    public int getRoomPrice() {
		return roomPrice;
	}
	
    public void setRoomPrice(int roomPrice) {
		this.roomPrice = roomPrice;
	}
	
    public Hotel() {
		name = "Geroge";
		location = "Lviv";
		stuffNumber = 150;
		roomsNumber = 100;
		roomPrice = 450;
    }
	
    public Hotel (String name, String location, int stuffNumber, int roomsNumber) {
		setName(name);
		setLocation(location);
		setstuffNumber(stuffNumber);
		setroomsNumber(roomsNumber);
		roomPrice = 400;
    }
	
    public Hotel (String name, String location, int stuffNumber, int roomsNumber, int roomPrice) {
		setName(name);
		setLocation(location);
		setStuffNumber(stuffNumber);
		setRoomsNumber(roomsNumber);
		setRoomPrice(roomPrice);
    }
	
	public String toString() {
	    return "Hotel " + getName() + " with " + getStuffNumber() + " located in " + getLocation() + " has " + getRoomsNumber() + " rooms and price of each is " + getRoomPrice()  + " hrn." ;
		}
	
    static void printStaticSum() {
		System.out.println("There are " + generalStuffNumber + " employees in total.");
	}
	
    public void printSum() {
		System.out.println("Together with new " + getStuffNumber() + " employees, net of hotels " + getName() + " has got in general " + generalStuffNumber + " workers.");
		}
		
    public void resetValues(String name, String location, int stuffNumber, int roomsNumber, int roomPrice) {
		setName(name);
		setLocation(location);
		setStuffNumber(stuffNumber);
		setRoomsNumber(roomsNumber);
		setRoomPrice(roomPrice);
		}
}