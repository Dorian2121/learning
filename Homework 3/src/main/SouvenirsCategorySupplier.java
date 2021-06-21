package main;

public class SouvenirsCategorySupplier implements CategorySupplier {

	@Override
	public Category get() {

		return new Souvenirs();
	}

	@Override
	public String name() {

		return "Souvenirs";
	}

}
