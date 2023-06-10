package com.interview.abhijeet;
class Parent{
	int i;
	 Parent(int i) {
		i=i;
		System.out.println(i);
	}
	 Parent(){
		 
	 }
	 
}
class Child extends Parent{

	 
	
}
public class interview1 {
	public static void main(String[] args) {
		Parent i= new Parent();
		Child c=new Child();
	}
}
