package com.onlar_pattern.singleton;

import java.util.Objects;

public class DoubleCheck {
	 private static DoubleCheck INSTANCE;

	    private DoubleCheck() {
	    }

	    public static DoubleCheck getInstance() {
	        if (Objects.isNull(INSTANCE)) {
	            synchronized (DoubleCheck.class) {
	                if (Objects.isNull(INSTANCE)) {
	                    INSTANCE = new DoubleCheck();
	                }
	            }
	        }
	        return INSTANCE;
	    }

}
