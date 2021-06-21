package main;

import java.util.HashMap;
import java.util.Map;

public enum CategoryFactory {

	INSTANCE();

	private final Map<String, CategorySupplier> suppliers;

	CategoryFactory() {
		suppliers = new HashMap<>();
		register(new GroceryCategorySupplier());
		register(new ClothesCategorySupplier());
		register(new FurnitureCategorySupplier());
		register(new SouvenirsCategorySupplier());
	}

	public void register(CategorySupplier supplier) {
		suppliers.put(supplier.name(), supplier);
	}

	public Category get(String name) {
		if (suppliers.containsKey(name)) {
			return suppliers.get(name).get();
		}
		throw new IllegalArgumentException("Supplier with name '" + name + "' not registered!");
	}

	public static CategoryFactory getInstance() {
		return INSTANCE;
	}

}
