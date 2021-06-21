package main;

public class Main {

	public static void main(String[] args) {
		Finalizator f = new Finalizator();
		System.out.println("start");
		int x = f.x;
		x++;
		Test t = new Test();
		f=t;
		int y = f.x;
		System.gc();
		System.out.println(x);
		System.out.println(y);
	}

}
