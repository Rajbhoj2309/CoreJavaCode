package com.onlar_pattern.singleton;

import java.util.Objects;

public class DoubleCheckSingleton {
	private static DoubleCheckSingleton INSTANCE;

    private DoubleCheckSingleton(){}

    public static DoubleCheckSingleton getInstance(){
        if(Objects.isNull(INSTANCE)){
            synchronized (DoubleCheckSingleton.class){
                if(Objects.isNull(INSTANCE)){
                    INSTANCE = new DoubleCheckSingleton();
                }
            }
        }
        return INSTANCE;
    }

}
