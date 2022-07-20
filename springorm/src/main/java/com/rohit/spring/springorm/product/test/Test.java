package com.rohit.spring.springorm.product.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rohit.spring.springorm.product.dao.ProductDao;
import com.rohit.spring.springorm.product.entity.Product;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/rohit/spring/springorm/product/test/config.xml");
		ProductDao dao = (ProductDao) ctx.getBean("productDao");
		/*
		 * Product product= new Product(); product.setId(2); product.setName("mac");
		 * product.setDesc("Its awasome and fabolous"); product.setPrice("60000");
		 */
		//dao.create(product);
		//dao.update(product);
		//dao.delect(product);
		/*
		 * int id=2; Product product=dao.find(id); System.out.println(product);
		 */
		List<Product> product=dao.findall();
		System.out.println(product);
	}

}
