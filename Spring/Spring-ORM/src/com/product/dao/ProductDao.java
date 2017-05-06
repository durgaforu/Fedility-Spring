package com.product.dao;
import com.product.entities.Product;

public interface ProductDao {

	public abstract void saveProduct(Product prod);
	public void genericSaveDao(Object obj);
	public Object search(int key);

}