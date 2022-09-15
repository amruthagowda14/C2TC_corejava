package com.tns.assignment;
import java.util.Scanner;
public class Light {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        int hours=sc.nextInt();
	        if(hours<18)
	        {
	        	
	          System.out.println("lights on");
	        }
	        else if(hours<=24 && hours>18)
	        {
	        System.out.println("lights off");    
	        }

	}
}
