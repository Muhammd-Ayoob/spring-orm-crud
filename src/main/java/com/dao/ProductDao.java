package com.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import springorm.entities.Product;

public class ProductDao {

	HibernateTemplate hibernateTemplate;
	
	
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}




	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}




	@Transactional
	public void insert(Product product)
	{
		hibernateTemplate.save(product);
	}
	
	
	
	
	public Product getProduct(int id)
	{
		Product product= hibernateTemplate.get(Product.class, id);
		
		return product;
	}
	
	
	public List<Product> getProducts()
	{
		List list = hibernateTemplate.loadAll(Product.class);
		
		return list;
	}
	
	
	public void delete(int id)
	{
		Product product= hibernateTemplate.get(Product.class, id);
		
		hibernateTemplate.delete(product);
	}
	
	
	@Transactional
	public void update(Product product)
	{
		hibernateTemplate.update(product);
	}
}
