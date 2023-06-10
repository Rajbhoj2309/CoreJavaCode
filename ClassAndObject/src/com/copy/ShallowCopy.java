package com.copy;
class ABC{

	public int 	x=10;
	
}
public class ShallowCopy {
	public static void main(String[] args) {
		ABC obj1=new ABC();
		ABC obj2=obj1;
		obj2.x=30;
		System.out.println(obj1.x);
		System.out.println(obj2.x);
	}
	

}
