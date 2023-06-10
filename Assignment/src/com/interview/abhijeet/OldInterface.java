package com.interview.abhijeet;


interface AAA{
	default public void newDefaultMethod() {
		System.out.println("this is interface default method");
	}
	static void tq() {

		System.out.println("adkfihsfghuds");
		}
}
class BBB implements AAA{
	
}
public class OldInterface {
	public static void main(String[] args) {
		BBB obj=new BBB();
		obj.newDefaultMethod();
		AAA.tq();
	}

}
