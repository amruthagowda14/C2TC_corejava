package com.tns.abstr;

public class myclass {

	public static void main(String[]args) {
		Multiply m = new Multiply();
		Addition a = new Addition();
		
		m.calculate(10,6);
		a.calculate(20,30);
	}
}