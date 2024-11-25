
package com.springcore.PersonwithMultipleAdd;

import java.util.ArrayList;
import java.util.List;

import com.springcore.PersonwithMultipleAdd.Addresses;
public class Person {
    private String name;

    private List<Addresses> addresses = new ArrayList<>(); 
    
    //Default constructor
    public Person() {
    	
    }
   
    public Person(String name) {
    	this.name = name;
    }
    
    //getter setter
    public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Addresses> getAddresses() {
        return addresses;
    }

    // Method to add a single address
    public void addAddress(Addresses address1) {
        this.addresses.add(address1);
    }
    
    public void showDetails() {
        System.out.println("Name: " + name);
        if (!addresses.isEmpty()) {
            System.out.println("Addresses:");
            for (Addresses address : addresses) {
                System.out.println(" - " + address);
            }
        } else {
            System.out.println("No addresses provided.");
        }
    }
}
