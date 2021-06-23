package main;

public class Ticket {

	public final static double cost = 10.00;
	public final int number;

public Ticket(int number) {
		
		this.number = number;
	}
public final double getCost() {
	return cost;
}
public final int getNumber() {
	return number;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	long temp;
	temp = Double.doubleToLongBits(cost);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + number;
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
	Ticket other = (Ticket) obj;
	if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(Ticket.cost))
		return false;
	if (number != other.number)
		return false;
	return true;
}
@Override
public String toString() {
	return "Ticket [cost=" + cost + ", number=" + number + "]";
}


}
