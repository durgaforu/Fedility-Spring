package com.shop.bill;

import com.shop.pricematrix.PriceMatrixImpl;
import com.shop.pricematrix.Pricematrix;

public class BillingImpl {

	/*
	 * Design Issues -------------- 1. Too many dependency obj creations --> Per
	 * comes down, memory leaks
	 * 
	 * why Issue? ------------- --> Creting Dependency object in the Dependent
	 * Sol: Dont create Dependency in Dependent
	 * 
	 * use interfaces insted:
	 * 
	 * 
	 */

	private Pricematrix price;

	public void setPrice(Pricematrix price) {
		this.price = price;
	}

	public double cartPrice(String[] cart) {
		// PriceMatrixImpl price = new PriceMatrixImpl();

		double tot = 0.0;
		for (String itemCode : cart) {
			tot = tot + price.getItemPrice(itemCode);
		}

		return tot;
	}

}
