package main;

import java.util.function.Supplier;

public interface CategorySupplier extends Supplier<Category> {
	String name();

}
