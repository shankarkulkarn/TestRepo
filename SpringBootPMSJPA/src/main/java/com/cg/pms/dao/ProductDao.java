package com.cg.pms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.pms.entity.Product;
import com.cg.pms.exception.ProductException;

public interface ProductDao 
{
	public Product findProductById(int productId) throws ProductException;
	public Product createProduct(Product product) throws ProductException;
	public Product updateProduct(Product product) throws ProductException;
	public Product deleteProductById(int productId) throws ProductException;
	
	public List<Product> listAllProducts() throws ProductException ;
	  
}
