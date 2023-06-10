package com.practice;

import java.util.Scanner;

public class SwapNumbersWithoutTemp {
	public static void main(String[] args) {
		int x, y;
		 System.out.println("Enter x and y");
		 Scanner in = new Scanner(System.in);
		 x = in.nextInt();
		 y = in.nextInt();
		 System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
		 x = x + y;//10+20
		 y = x - y;//30-20=10
		 x = x - y;//30-10=20
		 System.out.println("After Swapping\nx = "+x+"\ny = "+y);
	}

}
