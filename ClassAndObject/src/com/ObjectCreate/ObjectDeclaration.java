package com.ObjectCreate;
class Don{
	String name;
	Don(String name){
		this.name=name;
	}
	public String namee() {
		String name="SHIVSENA";
		System.out.println(name);
		return this.name;
	}
}
class Bhai{
	Don don;
	Bhai(Don don){
		
	}
	public String name1() {
		String work=don.namee();
		return work;
	}
}
public class ObjectDeclaration extends Don{
	Don don;
	ObjectDeclaration(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
//		Don don=new Don("Shivsena");
//		
//		Bhai obj=new Bhai(don);
//		
//		System.out.println("Helli :"+don.name);   
//		don.namee();
//		obj.name1();
		try {System.out.println("hello");
			Class.forName("Don");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
