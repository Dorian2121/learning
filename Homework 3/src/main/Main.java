package main;

import java.util.List;



public class Main {
	Customer customer = new Customer(0.98);
	public static void main(String[] args) {
		
Category grocery = CategoryFactory.getInstance().get("Grocery");
grocery.addProduct("Bread",new Product(23, 0.99, "Bread"));
	}

	
	public void addToBasket(Customer customer,Product product) {
		customer.getBasket().add(product);
	 product.setQuantity(product.getQuantity()-1);
	}
	public void deleteFromBasket(Customer customer,Product product) {
		customer.getBasket().clear();
	}
	public void buy(Customer customer, Product product) {
		if (customer.getQuantityOfMoney()<calculateSumm(customer.getBasket())) {
			throw new IllegalArgumentException("Not Enough Money");
		}
		customer.setQuantityOfMoney(customer.getQuantityOfMoney()-calculateSumm(customer.getBasket()));
		customer.setPurchasedGoods(customer.getBasket());
		customer.getBasket().clear();
		
	}
	private double calculateSumm(List<Product> basket) {
		return basket.stream().mapToDouble((b)->b.getPrice()).sum();
	}
}
