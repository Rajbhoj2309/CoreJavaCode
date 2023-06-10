package com.ObjectCreate;
final class ABC{
	private final Integer id;
	private final String name;
	public ABC(Integer id ,String name) {
		this.id = id;
		this.name =name;
		
	}
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public static ABC getInstanceOf(int a, String b) {
		return new ABC(a,b);
	}
	public void display() {
		System.out.println(id+"  "+name);
	}
	@Override
	public String toString() {
		return "{"+id+ "   "+name +"}";
	}
}
public class ImmutableClass{
	private static ABC change(int a, String b) {
		 a=10;
		b="aaaaaaaaaaaa";
		return new ABC(a,b);
	}
	
	public static void main(String[] args) {
		ABC aa=ABC.getInstanceOf(30, "ccccc");
		System.out.println(aa);
		aa.display();
		change(aa.getId(),aa.getName());
		System.out.println(aa);
	}
	
}
