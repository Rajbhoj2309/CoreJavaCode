package com.calculator;

import java.util.Arrays;
import java.util.List;

public class OperatorValidator implements Validator{
	
	 List<String> operatorList = Arrays.asList("+","-","/","*");
	    @Override
	    public boolean validate(String... dataToBeValidate){
	        for(String data : dataToBeValidate){
	            if(!operatorList.contains(data.trim())){
	                return false;
	            }
	        }
	        return true;
	    }

}
