package com.shop.pricematrix;

//Dependency class
public class PriceMatrixImpl implements Pricematrix {

	public PriceMatrixImpl() {
	
		System.out.println("--- PriceMatrixImpl obj created");
	}
	
	@Override
	public double getItemPrice(String itemCode) {
		// db to fetch data from DB
		return 100.00;

	}
	


}
