package com.springcore.PersonWithOneAdd;

public class Address {
	
	String StreetName;
	String City;
	String State;
	
	public Address(String streetName, String city, String state) {
		super();
		StreetName = streetName;
		City = city;
		State = state;
	}
	public String getStreetName() {
		return StreetName;
	}
	public void setStreetName(String streetName) {
		StreetName = streetName;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	
	

}
