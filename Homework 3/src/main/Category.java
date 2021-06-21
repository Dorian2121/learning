package main;

import java.util.HashMap;
import java.util.Map;

public class Category {
public Map<String,Product> products = new HashMap<String, Product>();
public void addProduct(String name, Product product) {
	products.put(name, product);
}
}
