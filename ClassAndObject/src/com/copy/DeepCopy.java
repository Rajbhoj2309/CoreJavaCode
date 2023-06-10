package com.copy;
class ABCD{
	int x=30;
	
}
public class DeepCopy {
	public static void main(String[] args) {
		ABCD abc=new ABCD();
		
		ABCD abc1=new ABCD();
		
		abc1.x=10;
		
		System.out.println(abc.x);
	}
}
