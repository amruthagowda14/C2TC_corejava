package com.tns.assignment;
import java.util.Scanner;
public class Tax {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int wc=sc.nextInt();
		if(wc<=45) 
			System.out.println("No tax");
		else if(wc<75 && wc>45) 
			System.out.println("tax:475");
		else if(wc<125 && wc>75)
			System.out.println("tax:750");
		else if(wc<200 && wc>125) 
			System.out.println("tax:1225");
		else if(wc<350 && wc>200) 
			System.out.println("tax:1650");
		
		else 
			System.out.println("tax:2000");
		

	}
}
