package com.interview.cloudtech1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class ABC //implements Comparable<ABC>
{
	private String name;
	private int id;
	
	
	public ABC(String name, int id) {
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
		return "ABC [name=" + name + ", id=" + id + "]";
	}
	//@Override
//	public int compareTo(ABC o) {
//		if(this.id>o.getId()) {
//			return -1;
//		}
//		return 1;
//	}
	
	
	
}
public class Comparable_UsingCustomClass {
public static void main(String[] args) {
	String str1="sachin";
	String str2=new String("sachin");
	
	System.out.println(str1==str2);
	List<ABC>asd=new ArrayList<ABC>();
	asd.add(new ABC("FJH", 10));
	asd.add(new ABC("TXZ", 29));
	asd.add(new ABC("JKL", 30));
	asd.add(new ABC("NMO", 25));
	asd.add(new ABC("ACD", 37));
	
//	List<ABC> collect = asd.stream().sorted((a,b)-> a.compareTo(b)).collect(Collectors.toList());
//	System.err.println(collect);
	
	 asd.stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName())).forEach(e->System.out.println(e));
	
	
	
	}
}
