package com.dxc.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.dxc.beans.Product;

@Component
public class ProductRepo {

	 List<Product> products=new ArrayList<Product>();
	
	{
		products.add(new Product(1, "Mobile", 5000.0f, "Samsung"));
		products.add(new Product(2, "Watch", 2000.0f, "Titan"));
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public void addProduct(Product product) {
		this.products.add(product);
	}
	public void delProduct(int index) {//write your own logic here
		this.products.remove(index);
	}
	
}
