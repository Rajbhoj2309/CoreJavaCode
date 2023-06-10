package com.calculator;

import java.util.regex.Pattern;

public class NumberValidator implements Validator{

	@Override
	public boolean validate(String... dataToBeValidate) {
		for(String data : dataToBeValidate){
            if(!(Pattern.matches("\\d+", data) || Pattern.matches("\\d+.?\\d+", data))){
                return false;
            }
        }
        return true;

	}

}
