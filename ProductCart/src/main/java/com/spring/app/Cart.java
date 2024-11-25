package com.spring.app;
import java.util.*;

public class Cart {

	// fill the code
	ArrayList<Product>productList;

	public Cart(ArrayList<Product> list) {
		super();
		this.productList = list;
	}
	public Cart() {
		
	}

	public ArrayList<Product> getProductList() {
		return productList;
	}

	public void setProductList(ArrayList<Product> productList) {
		this.productList = productList;
	}
	


}
