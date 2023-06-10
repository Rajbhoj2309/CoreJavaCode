package com.ObjectCreate;

import java.util.Objects;

class Test{
	private String name;
	private int id;
	public Test(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Test [name=" + name + ", id=" + id + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	
	
}
public class HashCodeEqualMethodContract {
	
	public static void main(String[] args) {
		Test abc=new Test("abc",10);
		Test bcd=new Test("abc",10);
		
		System.out.println(abc);//Test [name=abc, id=10]
		System.out.println(abc.hashCode());//1579572132
		System.out.println(bcd);//Test [name=abc, id=10]
		System.out.println(bcd.hashCode());//359023572
		
	}

}
