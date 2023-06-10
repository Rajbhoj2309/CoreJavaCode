package com.calculator;

import java.math.BigDecimal;

public class ZeroValueValidator implements Validator{
	 @Override
	    public boolean validate(String... dataToBeValidate){
	        for(String data : dataToBeValidate){
	            if(BigDecimal.ZERO.compareTo(new BigDecimal(data)) != 0){
	                return false;
	            }
	        }
	        return true;
	    }

}
