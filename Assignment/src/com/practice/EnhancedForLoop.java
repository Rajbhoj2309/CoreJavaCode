package com.practice;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnhancedForLoop {
	 public static void main(String[] args) {
		 int primes[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
		 for (int t: primes) {
		 System.out.println(t);
		 }
		 String languages[] = { "C", "C++", "Java", "Python", "Ruby"};
		 for (String sample: languages) {
		 System.out.println(sample);
		 }
		 Vector<String>v=new Vector<String>();
		 v.add(null);
		 v.add("adsf");
		 v.add("556");
		 v.add("qwre");
		 
		 Enumeration<String>TT=v.elements();
		
		 }
}
