package com.springcore.PersonwithMultipleAdd;

public class Addresses {
	
	String StreetName;
	String City;
	String State;
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
	@Override
	public String toString() {
		return "Address [StreetName=" + StreetName + ", City=" + City + ", State=" + State + "]";
	}
	
	
		
}
