package com.creationalTypesOfDesignPatterns.prototype;

public class EmployeePrototypePattern implements Cloneable{
	 private String first_name; //required field
	    private String last_name; //required field
	    private String middle_name; //optional_field
	    private String favourite_hobby; //optional field
	    private String martial_status; //optional field
	    private Address address;

	    EmployeePrototypePattern(String first_name , String last_name , String middle_name , String favourite_hobby , String martial_status , Address address){
	        this.first_name = first_name;
	        this.last_name = last_name;
	        this.middle_name = middle_name;
	        this.favourite_hobby = favourite_hobby;
	        this.martial_status = martial_status;
	        this.address = address;
	    }

	    public Address getAddress() {
	        return address;
	    }

	    public void setAddress(Address address) {
	        this.address = address;
	    }

	    @Override
	    public String toString() {
	        return "EmployeePrototypePattern{" +
	                "first_name='" + first_name + '\'' +
	                ", last_name='" + last_name + '\'' +
	                ", middle_name='" + middle_name + '\'' +
	                ", favourite_hobby='" + favourite_hobby + '\'' +
	                ", martial_status='" + martial_status + '\'' +
	                ", address=" + address.getCity() +
	                '}';
	    }

	    public void setFirst_name(String first_name) {
	        this.first_name = first_name;
	    }

	    public void setLast_name(String last_name) {
	        this.last_name = last_name;
	    }

	    public void setMiddle_name(String middle_name) {
	        this.middle_name = middle_name;
	    }

	    public void setFavourite_hobby(String favourite_hobby) {
	        this.favourite_hobby = favourite_hobby;
	    }

	    public void setMartial_status(String martial_status) {
	        this.martial_status = martial_status;
	    }

	    @Override
	    public Object clone() throws CloneNotSupportedException{
	      return super.clone();
	    }

}
