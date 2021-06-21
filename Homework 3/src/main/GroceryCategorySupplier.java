package main;

public class GroceryCategorySupplier implements CategorySupplier {

	@Override
	public Category get() {

		return new Grocery();
	}

	@Override
	public String name() {

		return "Grocery";
	}

}
