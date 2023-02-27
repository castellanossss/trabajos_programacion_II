package model;

public class Address {
	
	private String country;
	private String state;
	private String city;
	private String neighbordhood;
	private String adress;
	
	public Address() {
		
	}

	public Address(String country, String state, String city, String neighbordhood) {
		super();
		this.country = country;
		this.state = state;
		this.city = city;
		this.neighbordhood = neighbordhood;
	}
	public String toString() {
		return "Country:"+country+",State:"+state+",city:"+city+",neighbordhood"+neighbordhood+",adress"+adress;
	}	
}
