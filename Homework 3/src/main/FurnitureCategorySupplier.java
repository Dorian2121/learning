package main;

public class FurnitureCategorySupplier implements CategorySupplier {

	@Override
	public Category get() {
		
		return new Furniture();
	}

	@Override
	public String name() {
		
		return "Furniture";
	}

}
