package pl.kriss3.bcit.comp1451;

import static org.junit.Assert.*;

import org.junit.Test;

public class Class04Lab02Test 
{

	@Test
	public void checkThatHelperPrintMessageReturnValidMessage() 
	{
		Helper hp = new Helper();
		assertEquals("This is a test method from class: Helper", hp.printMessage());
	}
}
