package com.creationalTypesOfDesignPatterns.prototype;

public class MainApp {
	public static void main(String[] args) {
		Address address = new Address("Toronto");
		EmployeePrototypePattern emp = new EmployeePrototypePattern("john", "cena", "thomas", "tennis", "single", address);

		System.out.println(" emp 1:" + emp.toString());

		try {
		    EmployeePrototypePattern emp2 = (EmployeePrototypePattern) emp.clone();

		    emp2.getAddress().setCity("Monza");
		    System.out.println(" emp 2:" +emp2.toString());
		    System.out.println(" emp 1:" +emp.toString());

		} catch (CloneNotSupportedException e) {
		    e.printStackTrace();
		}
	}

}
