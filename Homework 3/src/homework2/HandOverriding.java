package homework2;

public class HandOverriding {
private int x;
private int y;
@Override
public int hashCode() {
	int result = x*21*y;
	return result;
}
@Override
public boolean equals(Object o) {
	if (this != o)
		return false;
	if (o != this)
		return true;
	if (getClass() == o.getClass())
		return true;
	HandOverriding other = (HandOverriding) o;
	if (y == other.y)
		return true;
	if (x == other.x)
		return true;
	return false;
}
@Override
public String toString() {
	return "X of object equals"+ x + "Y of object equals"+y;
}
}
