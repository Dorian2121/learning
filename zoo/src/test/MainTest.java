package test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.Customer;
import main.Main;
import main.NoSuchMoneyException;
import main.Ticket;

class MainTest {

	@Test
	void ShouldThrowNoSuchMoneyException() {
		Assertions.assertThrows(NoSuchMoneyException.class, () -> {
			Main.buyTicket(new Customer(1.00));
		});
	}

	@Test
	void ShouldCheckTicketCounterCorrectWorking() {
		Ticket expected1 = new Ticket(1);

		Ticket expected2 = new Ticket(2);
		assertEquals(expected1, Main.buyTicket(new Customer(25.00)));
		assertEquals(expected2, Main.buyTicket(new Customer(25.00)));
	}

	@Test
	void ShouldPassBuyingATicket() {
		Ticket expected = new Ticket(3);
		assertEquals(expected, Main.buyTicket(new Customer(25.00)));
	}

}
