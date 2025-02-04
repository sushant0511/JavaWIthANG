package com.java.testInheritance;

class Car
{
	public void fourTyre()
	{
		System.out.println("I have four tyre");
	}
}

class A2 extends Car
{
	public void powerWindows() {
		
		System.out.println("I have power windows");
	}
}


class A7 extends A2
{
	public void airBags()
	{
		System.out.println("I have air bags");
	}
}



public class Tester {


	public static void main(String[] args) {
		
		
		A7 a7=new A7();
		a7.airBags();
		a7.powerWindows();
		a7.fourTyre();
		
		
	}
	
}

