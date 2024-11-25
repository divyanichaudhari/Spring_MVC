package com.springcore.PersonwithMultipleAdd;

public class personService {
	
	private Person person;

	public personService(Person person) {
		super();
		this.person = person;
	}
	
	public void setUserName(String name) {
		person.setName(name);
	}

	public void addAddresses(String streetName, String city, String state) {
        Addresses address = new Addresses();
        address.setStreetName(streetName);
        address.setCity(city);
        address.setState(state);
        person.addAddress(address);
    }
}
