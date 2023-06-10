package com.ObjectCreate;
class Onkar{
	Onkar() {
		System.out.println("onkar");
	
	}
	 void m2() {
		System.out.println("business logic");
	}
}
public class ReturnObject1 {
	Onkar m1() {
		System.out.println("1");
		Onkar oo=new Onkar();
		oo.m2();
		return oo;
	}
	public static void main(String[] args) {
		ReturnObject1 oo=new ReturnObject1();
		Onkar s=oo.m1();
		System.out.println(s);
	}
}
