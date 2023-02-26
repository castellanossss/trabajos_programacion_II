package model;

public class Direction {
	
	private String city;
	private String neighbordhood;
	private String typeOfRoad;
	private short number;
	private String	prefix ;
	private  short generatingTrackNumber;
	private short generatingStreetPrefix;
	private short plateNumber;
	
	public Direction() {
		
	}
	public Direction(String city, String neighbordhood, String typeOfRoad, short number, String prefix,
			short generatingTrackNumber, short generatingStreetPrefix, short plateNumber) {
		super();
		this.city = city;
		this.neighbordhood = neighbordhood;
		this.typeOfRoad = typeOfRoad;
		this.number = number;
		this.prefix = prefix;
		this.generatingTrackNumber = generatingTrackNumber;
		this.generatingStreetPrefix = generatingStreetPrefix;
		this.plateNumber = plateNumber;
	}
	
}
