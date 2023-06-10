package com.onlar_pattern.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Using Serialization & Deserialization, we can create new instance
 * thereby breaking SingletonPattern
 */
public class SingletonDeserializationExample implements Serializable{
	 private static SingletonDeserializationExample single_instance = null;
	    /**
	     * Making the constructor as private
	     */
	    private SingletonDeserializationExample() {

	    }
	    /**
	     * Static method to create instance of Singleton class
	     * @return single object of 'SingletonDeserializationExample' class
	     */
	    public static SingletonDeserializationExample getInstance() {
	        /**
	         * Ensuring only one instance is created
	         */
	        if (single_instance == null)
	            single_instance = new SingletonDeserializationExample();
	        return single_instance;
	    }
	    // this method to used for prevent the singleton design pattern
//	    protected Object readResolve() {
//	        return SingletonDeserializationExample.getInstance();
//	    }

	    public static void main(String[] args) throws IOException, ClassNotFoundException {

	        /**
	         * Serializing the object into byte stream and saving into a file
	         */
	        SingletonDeserializationExample objectOne = SingletonDeserializationExample.getInstance();
	        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.text"));
	        out.writeObject(objectOne);
	        out.close();

	        /**
	         * Deserializing the byte-stream from the file into a new object
	         */
	        ObjectInput in = new ObjectInputStream(new FileInputStream("file.text"));
	        SingletonDeserializationExample objectTwo = (SingletonDeserializationExample) in.readObject();
	        in.close();

	        /**
	         * Checking the hashCode for both the objects which would be different,
	         * meaning the objects are different
	         */
	        System.out.println("Hashcode of Object 1 - " + objectOne.hashCode());
	        System.out.println("Hashcode of Object 2 - " + objectTwo.hashCode());

	    }

}
