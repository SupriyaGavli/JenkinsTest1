package com.infosys.exercise;


import java.util.List;
public class SearchProductService {
	public List<String> getAllProducts(){
		return new SearchProductDAO().getAllProducts();
	}
	 public String getProductsById(int prodId){
		 return new SearchProductDAO().getProductsById(prodId);
	 }
}
