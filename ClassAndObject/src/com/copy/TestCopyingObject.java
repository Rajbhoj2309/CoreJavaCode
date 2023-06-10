package com.copy;

import java.io.IOException;

class A{
	void m1() {}
	
}
class B extends A{
	void m2() {}
}
class C extends A{
	void m3() {}
}
public class TestCopyingObject {
public static void main(String[] args)  {
	A a=new A();
	B b=new B();
	C c=new C();
	
	a = b;
	
	//b = a;//Error need typeCasting (B)a
//	b = c;// Error cannot convert from C to B
	try{
		//throw some error
		int bucket[]=new int[15];
		bucket[15]=38/6;
	}
	catch (ArithmeticException e) {
		System.out.println("Ari");
	}
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Arr");
	}
	catch(Exception ex){
		System.out.println("Excep");
	}

}

}
