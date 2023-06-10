package com.onlar_pattern.singleton;

import java.util.Objects;

public class LazyInit {
	private static LazyInit INSTANCE = null;

    private LazyInit() {
    	
    }

    public static LazyInit getInstance() {
        if (Objects.isNull(INSTANCE)) {
            synchronized (LazyInit.class) {
                INSTANCE = new LazyInit();
            }
        }
        return INSTANCE;
    }

}
