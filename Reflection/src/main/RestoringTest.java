package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RestoringTest {

	@Test
	void ShouldRestoreClassInformation() {
		Restoring restoring = new Restoring();
		StringClass testclass = new StringClass();
		String expected = "class modifier public"+"\n"+
				"class name main.StringClass"+"\n"+
				"class pakage main"+"\n"+
				"class fields :"+"\n"+
				"-1 private java.lang.String main.StringClass.one"+"\n"+
				"-2 private java.lang.String main.StringClass.two"+"\n"+
				"-3 private java.lang.String main.StringClass.three"+"\n"+
				"-4 private int main.StringClass.four"+"\n"+
				"class constructor :"+"\n"+
				"-1 public main.StringClass()"+"\n"+
				"class methods :"+"\n"+
				"-1 public java.lang.String main.StringClass.getFields()"+"\n";
           assertEquals(expected,restoring.restoreClassMetainf(testclass.getClass()) );
	}

}
