package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Hack;
import main.StringClass;

class HackTest {

	

		@Test
		void ShouldChangeStringsInClassTheClass() {
			Hack hack = new Hack();
			StringClass actual 	= new StringClass();
			hack.hackTheObject(actual);
			String expected = "You're hacked. Send 10 btc to 34kNXokGAdmLvsJFFZdrkn27PPtvYLXDYS"+"\n"+
					"You're hacked. Send 10 btc to 34kNXokGAdmLvsJFFZdrkn27PPtvYLXDYS"+"\n"+
					"You're hacked. Send 10 btc to 34kNXokGAdmLvsJFFZdrkn27PPtvYLXDYS"+"\n"+
					"22" + "\n";
	assertEquals(expected, actual);
			
		}

}
