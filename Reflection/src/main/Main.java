package main;


public class Main {

	public static void main(String[] args) {
	StringClass stringClass = new StringClass();
	Restoring restoring = new Restoring();
	Hack hack = new Hack();
  	System.out.println(	restoring.restoreClassMetainf(stringClass.getClass()));
	System.out.println(stringClass.getFields());
hack.hackTheObject(stringClass);
System.out.println(stringClass.getFields());
	}
	
}
