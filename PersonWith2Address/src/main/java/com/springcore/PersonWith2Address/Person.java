package com.springcore.PersonWith2Address;

public class Person {
    private String name;
    private Address officeAddress; 
    private Address homeAddress; 

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(Address officeAddress) {
        this.officeAddress = officeAddress;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public void showDetails() {
    	    System.out.println("Name: " + name);
    	    System.out.println("Home Address: " + (homeAddress != null ? homeAddress : "Not provided"));
    	    System.out.println("Office Address: " + (officeAddress != null ? officeAddress : "Not provided"));
    	}

    }

