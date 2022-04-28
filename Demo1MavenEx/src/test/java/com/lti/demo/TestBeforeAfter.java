package com.lti.demo;

public class TestBeforeAfter {
	
	@Test
	public void testAddition()
	{
	System.out.println("test add method ");
	Calculator c= new Calculator();
	int result= c.addNos(100, 300);
	Assertions.assertEquals(400, result);
	}
	@Test
	public void testSub()
	{
	System.out.println("test sub method ");
	Calculator c= new Calculator();
	int result= c.subNos(100, 50) ;
	Assertions.assertEquals(50, result);
	}

}
