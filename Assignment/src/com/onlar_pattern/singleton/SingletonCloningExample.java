package com.onlar_pattern.singleton;

/**
 * Using Cloneable Interface, we can create more than one instance in a Singleton class by
 * simply using the clone() on the first object
 */
public class SingletonCloningExample  implements Cloneable {
	 private static SingletonCloningExample single_instance = null;

	    @Override
	    protected Object clone() throws CloneNotSupportedException
	    {
	        return super.clone();// break the singleton by using clone
//	    	return single_instance; //prevent the singleton by using instance of the class.
	    }

	    /**
	     * Making the constructor as private
	     */
	    private SingletonCloningExample() {}

	    /**
	     * Static method to create instance of Singleton class
	     * @return single object of 'SingletonCloningExample' class
	     */
	    public static SingletonCloningExample getInstance() {
	        /**
	         * Ensuring only one instance is created
	         */
	        if (single_instance == null)
	            single_instance = new SingletonCloningExample();
	        return single_instance;
	    }

	    public static void main(String[] args) throws CloneNotSupportedException {

	        /**
	         * Instantiating SingletonCloningExample class with variable 'objectOne'
	         */
	        SingletonCloningExample objectOne = SingletonCloningExample.getInstance();

	        /**
	         * Cloning the 'objectOne' using clone()
	         */
	        SingletonCloningExample objectTwo = (SingletonCloningExample) objectOne.clone();
	        
	        Object objectThree = SingletonCloningExample.getInstance().clone();
	        

	        /**
	         * Checking the hashCode for both the objects which would be different,
	         * meaning the objects are different
	         */
	        System.out.println("Hashcode of Object 1 - " + objectOne.hashCode());
	        System.out.println("Hashcode of Object 2 - " + objectTwo.hashCode());
	        System.out.println("Hashcode of Object 3 - " + objectThree.hashCode());
	    }

}
