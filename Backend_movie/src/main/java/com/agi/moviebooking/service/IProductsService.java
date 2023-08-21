package com.agi.moviebooking.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.agi.moviebooking.dto.ProductsDTO;
import com.agi.moviebooking.entity.Products;

public interface IProductsService {
	
	public String addProducts(ProductsDTO productDto);
	
	public List<Products> getAllProducts();
	
	public String updateProducts(ProductsDTO productDto);
	
	public String deleteProducts(long id);
	
	public Products getProductById(long id);
	
	public void saveMultiple(MultipartFile file);
	
	public List<Products> getSortedProduct();

}
