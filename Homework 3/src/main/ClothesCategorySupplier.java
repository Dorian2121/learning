package main;

public class ClothesCategorySupplier implements CategorySupplier {

	@Override
	public Category get() {
		
		return new Clothes();
	}

	@Override
	public String name() {
		
		return "Clothes";
	}

}
