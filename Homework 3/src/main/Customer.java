package main;

import java.util.List;

public class Customer {
	private  double quantityOfMoney;
	
	private  List<Product> purchasedGoods;
	private  List<Product> basket;
	public Customer(double quantityOfMoney, List<Product> purchasedGoods, List<Product> basket) {
		super();
		this.quantityOfMoney = quantityOfMoney;
		this.purchasedGoods = purchasedGoods;
		this.basket = basket;
	}
	public final double getQuantityOfMoney() {
		return quantityOfMoney;
	}
	public final void setQuantityOfMoney(double quantityOfMoney) {
		this.quantityOfMoney = quantityOfMoney;
	}
	public final List<Product> getPurchasedGoods() {
		return purchasedGoods;
	}
	public final void setPurchasedGoods(List<Product> purchasedGoods) {
		this.purchasedGoods = purchasedGoods;
	}
	public final List<Product> getBasket() {
		return basket;
	}
	public final void setBasket(List<Product> basket) {
		this.basket = basket;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((basket == null) ? 0 : basket.hashCode());
		result = prime * result + ((purchasedGoods == null) ? 0 : purchasedGoods.hashCode());
		long temp;
		temp = Double.doubleToLongBits(quantityOfMoney);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		if (basket == null) {
			if (other.basket != null)
				return false;
		} else if (!basket.equals(other.basket))
			return false;
		if (purchasedGoods == null) {
			if (other.purchasedGoods != null)
				return false;
		} else if (!purchasedGoods.equals(other.purchasedGoods))
			return false;
		if (Double.doubleToLongBits(quantityOfMoney) != Double.doubleToLongBits(other.quantityOfMoney))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Customer [quantityOfMoney=" + quantityOfMoney + ", purchasedGoods=" + purchasedGoods + ", basket="
				+ basket + "]";
	}
}
