package com.onlar_pattern.singleton;

import java.util.Objects;

public class LazyInitialization {
	private static LazyInitialization INSTANCE = null;

    private LazyInitialization() {
    }

    public synchronized static LazyInitialization getInstance() {
        if (Objects.isNull(INSTANCE)) {
            INSTANCE = new LazyInitialization();
        }
        return INSTANCE;
    }

}
