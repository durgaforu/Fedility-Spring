package com.shop.dao;

import org.springframework.stereotype.Repository;

@Repository
public class PriceMatrixImpl implements PriceMatrix {

	@Override
	public double getItemPrice(String prodId) {
		return 140.00;
	}

}
