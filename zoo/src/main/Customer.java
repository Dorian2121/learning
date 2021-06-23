package main;

public class Customer {
private  double money;
private Ticket ticket;
public Customer(double money) {
	
	this.money = money;
}
public final double getMoney() {
	return money;
}
public final void setMoney(double money) {
	this.money = money;
}
public final Ticket getTicket() {
	return ticket;
}
public final void setTicket(Ticket ticket) {
	this.ticket = ticket;
}
public boolean checkTicket() {
	if(ticket!=null) {
		return true;
	}return false;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	long temp;
	temp = Double.doubleToLongBits(money);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((ticket == null) ? 0 : ticket.hashCode());
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
	Customer other = (Customer) obj;
	if (Double.doubleToLongBits(money) != Double.doubleToLongBits(other.money))
		return false;
	if (ticket == null) {
		if (other.ticket != null)
			return false;
	} else if (!ticket.equals(other.ticket))
		return false;
	return true;
}
@Override
public String toString() {
	return "Customer [money=" + money + ", ticket=" + ticket + "]";
}

}