package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestCalc {
	Calculator c=new Calculator();
	
	@Test
	public void testHello()
	{
		Assertions.assertEquals("Hello World", c.sayHello());
	}
	
	@Test
	public void TestAddition()
	{
		Assertions.assertEquals(400,c.addNos(300,200));
	}
	

}
