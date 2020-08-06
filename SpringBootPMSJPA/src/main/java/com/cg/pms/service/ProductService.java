package com.cg.pms.service;

import java.util.List;

import com.cg.pms.entity.Product;
import com.cg.pms.exception.ProductException;

public interface ProductService {

	public Product findProductById(int productId) throws ProductException;
	public Product createProduct(Product product) throws ProductException;
	public Product updateProduct(Product product) throws ProductException;
	public Product deleteProductById(int productId) throws ProductException;
	
	public List<Product> listAllProducts() throws ProductException ;
}
