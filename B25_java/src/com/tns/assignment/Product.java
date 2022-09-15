package com.tns.assignment;
import java.util.Scanner;
public class Product {

	public static void main(String[] args) {
		int negatives=1;
	      int  num [] = {-1,-2,-3,1,2,3};

	      for(int i=0;i<num.length;i++)
	         {
	               if (num[i]<0)
	               {
	                  negatives*=num[i];
	               }
	               
	         }

	         System.out.println("The product of negatives is " + negatives);

	}
}
