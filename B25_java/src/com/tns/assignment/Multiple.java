package com.tns.assignment;
import java.util.Scanner;
public class Multiple {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//Initialization
		int number=sc.nextInt();
		if(number%3==0) {
			System.out.println("multiple of 3");
		}
		else {
			System.out.println("not multiple of 3");
		}


	}

}