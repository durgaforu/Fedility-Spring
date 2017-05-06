package com.product.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.dao.ProductDao;
import com.product.entities.Product;

@Service
public class ProductModelImpl implements ProductModel {

	@Autowired
	private ProductDao productDao;

	@Override
	public void saveProduct(Product prod) {

		productDao.saveProduct(prod);

	}

	@Override
	public void genericSaveDao(Object obj) {
		
		productDao.genericSaveDao(obj);
		
	}

	@Override
	public Object search(int key) {
		Object obj=productDao.search(key);
		return obj;
	}

}
