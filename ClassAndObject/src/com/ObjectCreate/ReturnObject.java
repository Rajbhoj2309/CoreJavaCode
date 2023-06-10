/**
 * 
 */
package com.ObjectCreate;

import java.util.stream.Stream;

/**
 * @author Rajbhoj Kiran
 *
 */
/**
 * 
 * @category=class as Return type Object 
 *
 */
class Student{
	Student(){
		System.out.println("this is an invoked when its Class object created");
	}
	void ma() {
		System.out.println("method is crated for testing object retun reference through");
	}
	
}
class Teacher{
	int a;
	int b;
	Teacher(){
		
		System.out.println("Teacher.Teacher()");
	}
	int d;
Teacher(int j,int k){
		a=j;
		b=k;
		
	}
	
	int mt() {
		System.out.println("Teacher.mt()");
		return d=a+b;
	}
	boolean isEqualto(Teacher tt) {
		
		return tt.a==a && tt.b==b;
	}
	
}
public class ReturnObject {
	
	Student m1() {
		
		Student st=new Student();
//		st.ma();
		return st;
		
	}
	
	Object m2() {
		Teacher tt=new Teacher();
//		tt.mt();
		return Integer.valueOf(124);
	}
	
public static void main(String[] args) {
	ReturnObject ro=new ReturnObject(); // ro.m1();  ro.m2();
	Student s=ro.m1(); System.out.println(s);//com.ObjectCreate.Student@5e265ba4
	Object t=ro.m2(); System.out.println(t);//com.ObjectCreate.Teacher@123a439b
	Teacher check=new Teacher(10, 20);
	Teacher check1=new Teacher(20, 10);
	System.out.println("Check boolean is "+check.isEqualto(check1));
	
}

}
