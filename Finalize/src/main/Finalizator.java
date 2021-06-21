package main;

public class Finalizator {
	int x = 22;
	protected void finalize() {
		
		System.out.println("finalize successfuly");
	}
}
