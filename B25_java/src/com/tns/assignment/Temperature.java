package com.tns.assignment;
import java.util.Scanner;
public class Temperature {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp=sc.nextInt();
		int week= sc.nextInt();
		for(int i=1;i<=week;i++)
		{
			temp =temp-2;
			System.out.println("week="+temp);
		}

	}

}
