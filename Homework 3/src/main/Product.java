package main;

public class Product  {
	private int quantity;
	private final double price;
	private final String name;
	public Product(int quantity, double price, String name) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.name = name;
	}
	public final int getQuantity() {
		return quantity;
	}
	public final void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public final double getPrice() {
		return price;
	}
	public final String getName() {
		return name;
	}

}
