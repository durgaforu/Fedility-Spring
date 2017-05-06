package com.product.model;
import com.product.entities.Product;
public interface ProductModel {

	public abstract void saveProduct(Product prod);
	public void genericSaveDao(Object obj);
	public Object search(int key);

}