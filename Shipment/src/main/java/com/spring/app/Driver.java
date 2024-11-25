package com.spring.app;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Driver {
	public static void main(String[] args) {
//Fill the code
		Scanner sc=new Scanner(System.in);
		ApplicationContext c1=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Shipment Details1");
		System.out.println("Enter the Item Name");
		String name=sc.next();
		System.out.println("Enter the Item Price");
		double price=sc.nextDouble();
		System.out.println("Enter the ShipmentId");
		String sId=sc.next();
		System.out.println("Enter the Delivery Status");
		String status=sc.next();
		System.out.println("Shipment Details2");
		System.out.println("Enter the Item Name");
		String name1=sc.next();
		System.out.println("Enter the Item Price");
		double price1=sc.nextDouble();
		System.out.println("Enter the ShipmentId");
		String sId1=sc.next();
		System.out.println("Enter the Delivery Status");
		String status1=sc.next();
		Shipment s1=(Shipment) c1.getBean("s1");
		Item i1=s1.getItem();
		i1.setItemName(name);
		i1.setPrice(price);
		s1.setShipmentId(sId);
		s1.setDeliveryStatus(status);
		Shipment s2=(Shipment) c1.getBean("s1");
		Item i2=s2.getItem();
		i2.setItemName(name1);
		i2.setPrice(price1);
		s2.setShipmentId(sId1);
		s2.setDeliveryStatus(status1);
		System.out.println("Delivery status of shipment ID: " + s1.getShipmentId()+ " is " + s1.getDeliveryStatus());
		System.out.println("Delivery status of shipment ID: " + s2.getShipmentId()+ " is " + s2.getDeliveryStatus());
	}	
 
}