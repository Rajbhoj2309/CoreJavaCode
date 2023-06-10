package com.practice;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		int n, reverse = 0;
		 System.out.println("Enter the number to reverse");
		 Scanner in = new Scanner(System.in);
		 n = in.nextInt();
		 while( n != 0 )
		 {
		 reverse = reverse * 10;
		 System.out.println("1st >> "+reverse);
		 reverse = reverse + n%10;
		 System.out.println("2nd >> "+reverse);
		 n = n/10;
		 System.out.println("ansss >> "+n);
		 }
		 System.out.println("Reverse of entered number is "+reverse);
	}

}
