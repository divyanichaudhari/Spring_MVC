package com.springcore.PersonWithOneAdd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Info info = (Info) context.getBean("infoBean");

        System.out.println("Name: " + info.getName());
        System.out.println("Address:");
        System.out.println("  Street: " + info.getAddress().getStreetName());
        System.out.println("  City: " + info.getAddress().getCity());
        System.out.println("  State: " + info.getAddress().getState());

        
    }
}
