package homework2;

public class AutoOverriding {
	private int a;
	private int b;
	@Override
	public String toString() {
		return "AutoOverriding [a=" + a + ", b=" + b + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoOverriding other = (AutoOverriding) obj;
		if (a != other.a)
			return false;
		if (b != other.b)
			return false;
		return true;
	}
	public final int getA() {
		return a;
	}
	public final void setA(int a) {
		this.a = a;
	}
	public final int getB() {
		return b;
	}
	public final void setB(int b) {
		this.b = b;
	}
}
