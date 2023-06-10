package com.typecasting;
/*
	double float long  int short byte
*/
public class WideningExplicit {
	public static void main(String[] args) {
		double con=25.5d;
		
		long l=(long) con;
		System.out.println(con  +"   "+l);
		
		float f=(float)con;
		System.out.println(f);
		
		int i=(int)con;
		System.out.println(i);
		
		short s=(short)con;
		System.out.println(s);
		
		byte b=(byte)con;
		System.out.println(b);
		
	}

}
