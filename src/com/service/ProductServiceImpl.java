package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.Product;

public class ProductServiceImpl implements ProductService {
	
	static List<Product>  plist = new ArrayList<>();

	@Override
	public void addProduct(Product prod) {
		
		try {
			
			 Class.forName("");
			//
			
			String sql = "insert into product(name,company,price)values('"+prod.getName()+"','','')";
			//
			//
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
//		plist.add(prod);
//		System.out.println("----added success----size = "+plist.size());
	}

	@Override
	public void deleteProduct(int index) {
		
		//plist.remove(index);
	}

	@Override
	public List<Product> getAllProducts() {
		
		
		return plist;
	}
	

}
