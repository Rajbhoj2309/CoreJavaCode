package com.string;

import java.util.stream.IntStream;

public class reverseStringJava8 {
	public static void main(String[] args) {
		System.out.println(reverseStrings("Hellow"));
	}
	 static String reverseStrings(String input)
	{
		return IntStream.range(	0,input.length())
				.map(i ->input.charAt(input.length()-i-1))
				.collect(StringBuilder::new,(s,c) ->s.append((char) c), StringBuilder::append).toString();
		
	}

}
