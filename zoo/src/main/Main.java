package main;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static  Map <String, Animal> animals;

	public static void main(String[] args) {
		Customer customer = new Customer(1.00);
   customer.setTicket(buyTicket(customer));
   addAnimals();
   if (customer.checkTicket()) {
	   
	   feedTheAnimal("Chimpanzee");
	   goToExcursion();
	   
   } else {throw new IllegalArgumentException("you have no ticket");}
  
}
	public static void addAnimals() {
		animals = new HashMap<>();
		animals.put("Horse",new Horse("kick"));
		animals.put("Kangaroo",new Kangaroo("Jump"));
		animals.put("Chimpanzee",new Ñhimpanzee("Coding on javascript"));
	}
	public static Ticket buyTicket(Customer customer) {
		int ticketCounter = 0;
		if (customer.getMoney()>=Ticket.cost) {
			customer.setMoney(customer.getMoney()-Ticket.cost);
			ticketCounter++;
			return new Ticket(ticketCounter);
			
		}else {
			throw new NoSuchMoneyException();
		}
	}
	public static void feedTheAnimal(String animal) {
		animals.get(animal).feed();
		
}
	public static void goToExcursion () {
		animals.entrySet().stream().forEach(a -> a.getValue().feed());
		
	}

 
}