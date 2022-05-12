package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.ProductDao;

import springorm.entities.Product;

public class Test {
	
	static ApplicationContext applicationContext;
	
	public static void main(String args[])
	{

	 applicationContext=new ClassPathXmlApplicationContext("config.xml");
	
	ProductDao productDao= applicationContext.getBean("productDao" ,ProductDao.class);
	

	

	Product product= new Product();
	
	product.setId(1);
	product.setProductName("Mobile");
	product.setPrice(120000);
	
	productDao.update(product);
	
	
	//System.out.println(productDao.getProduct(2));
	
	/*List<Product> list = productDao.getProducts();
	
	for(Product product2: list)
	{
		System.out.println(product2);
	}*/
	
	}
	
	
	
}
