package java8;

public interface Hostel {
	public static int findRent(int rent,int roomMates) {
		if(roomMates <4) {
			return rent+2000;
		}
		else {
			return rent;
		}		
	}
	public default String printLocation(String location) {
		return "The Location is"+location;
	}
	public String printName(String name);
	

}
