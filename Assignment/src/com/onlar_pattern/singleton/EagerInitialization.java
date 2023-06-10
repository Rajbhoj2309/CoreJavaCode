package com.onlar_pattern.singleton;

public class EagerInitialization {
	  private static EagerInitialization INSTANCE = new EagerInitialization();

	    private EagerInitialization() {
	    }

	    public static EagerInitialization getInstance() {
	        return INSTANCE;
	    }	    
}
