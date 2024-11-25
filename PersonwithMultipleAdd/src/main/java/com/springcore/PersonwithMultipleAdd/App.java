package com.springcore.PersonwithMultipleAdd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	
    	personService ps = (personService) context.getBean("personService");
    	
    	ps.setUserName("Divyani Chaudhari");
    	ps.addAddresses("Savata nagar", "Nashik", "Maharashtra");
    	ps.addAddresses("Sector 20/B", "Airoli", "Maharashtra");
    	ps.addAddresses("Jalandhar nagar", "Varangaon", "Maharashtra");
    	ps.addAddresses("Sector 16", "Airoli", "Madhyapradesh");
    	
    	
    	Person person = (Person) context.getBean("person");
    	
    	System.out.println("Name of the User" + person.getName());
    	
    	System.out.println("Multiple addresses of the User" );
    	for(Addresses addme : person.getAddresses()) {
    		System.out.println("Address:" + addme.getStreetName() +"," + addme.getCity() +" ," + addme.getState());
    	}
    }
}
