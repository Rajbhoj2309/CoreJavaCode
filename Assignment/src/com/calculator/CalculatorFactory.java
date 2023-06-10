package com.calculator;

public class CalculatorFactory {
	
	private static final Addition addition = new Addition();
    private static final Substraction substraction = new Substraction();
    private static final Multiplication multiplication = new Multiplication();
    private static final Division division = new Division();
    public static Calculator getCalculator(String operator){
         switch (operator) {
            case "+": return addition;
            case "-": return substraction;
            case "*": return multiplication;
            case "/": return division;
         }
        return null;
    }

}
