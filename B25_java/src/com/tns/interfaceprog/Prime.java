package com.tns.interfaceprog;

public class Prime {
	public void deliverycharge() {
		System.out.println("There will be no  deliverycharges for prime users");
		}
	public static void main(String[] args) 
	{
	
		 Prime p=new Prime();
		 Nonprime NP=new Nonprime();
			p.deliverycharge();
		NP.deliverycharge();
		
	}

}