package com.product.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.product.entities.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public void saveProduct(Product prod) {

		Session ses = sessionFactory.getCurrentSession();
		ses.save(prod);
		System.out.println("ProductDao: " + prod.getProdName() + " Saved");

	}

	@Transactional
	public void genericSaveDao(Object obj) {

		Session ses = sessionFactory.getCurrentSession();
		ses.saveOrUpdate(obj);
	}

	@Transactional
	public Object search(int key) {

		Session ses = sessionFactory.getCurrentSession();

		Object obj = ses.get(Product.class, 1);
		
		return obj;

	}

}
