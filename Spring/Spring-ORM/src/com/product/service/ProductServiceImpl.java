package com.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entities.Product;
import com.product.model.ProductModel;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductModel productModel;

	@Override
	public void saveProduct(Product prod) {

		productModel.saveProduct(prod);

	}

	@Override
	public void genericSaveDao(Object obj) {
		productModel.genericSaveDao(obj);

	}

	@Override
	public Object search(int key) {
		Object obj = productModel.search(key);
		return obj;
	}

}
