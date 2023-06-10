package com.string;

public class reverseString {
	public static void main(String[] args) {
		System.out.println(reverseStrings("Hello"));
	}
	 static String reverseStrings(String input)
	{
		StringBuilder s=new StringBuilder();
		int bound=input.length();
		for (int i = 0; i < bound; i++) {
		int c=	input.charAt(input.length()-i-1);
			s.append((char)c);
		}
		return s.toString();
		
	}

}
