package main;

import java.util.Map;

public class Category {
public Map<String,Product> products;
public void addProduct(String name, Product product) {
	products.put(name, product);
}
}
