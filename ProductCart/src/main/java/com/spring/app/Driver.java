package com.spring.app;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String args[]) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Cart c = ctx.getBean(Cart.class);
	
		System.out.println("Total Price  Rs:"+c.getProductList().stream().mapToDouble(e->e.getPrice()).reduce(0, (a,b)->a+b));

	}
}
