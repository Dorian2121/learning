package main;


public class StringClass {
	private String one = "test 1";
	private String two = "test2";
	private String three = "test 3";
	private int four = 22;

	public StringClass() {
	}

	public String getFields() {
		StringBuilder sb = new StringBuilder();
		sb.append(one + "\n");
		sb.append(two + "\n");
		sb.append(three + "\n");
		sb.append(four + "\n");
				return sb.toString();
	}

}
