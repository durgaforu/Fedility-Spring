package com.product.service;

import com.product.entities.Product;

public interface ProductService {

	public abstract void saveProduct(Product prod);
	public void genericSaveDao(Object obj);
	public Object search(int key);

}