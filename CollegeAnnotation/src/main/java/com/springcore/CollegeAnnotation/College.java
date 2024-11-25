package com.springcore.CollegeAnnotation;

import org.springframework.stereotype.Component;

@Component
public class College {
	
	private Fees fees;
	
	public College(Fees fees) {
		super();
		this.fees = fees;
	}

	public void test() {
		System.out.println("Hello, divyani Chaudhari, You are able to do it");
	}

}
