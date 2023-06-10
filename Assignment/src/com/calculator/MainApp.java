package com.calculator;

public class MainApp {
	
    public static void main(String[] args) {

        Validator numberValidator = new NumberValidator();
        Validator zeroValidator = new ZeroValueValidator();
        Validator operatorValidator = new OperatorValidator();

        String inputDatas[] = {"1234 + 23.45","3444 - 445","97 * 8","999 / 99.2","1234a + 23.45",
        											"3444  f445","97 * sd8","999 & 99.2","34 / 0"};


        for(String inputs : inputDatas){
            String inputArr[] = inputs.split("\\s+");//   two backslash \\s means whitespace or (" ")
            if(inputArr.length != 3){
                System.out.println("Invalid no of parameters, exact 3 accepting");
                continue;
            }

            if(numberValidator.validate(inputArr[0], inputArr[2]) && operatorValidator.validate(inputArr[1])){
                Calculator calculator = CalculatorFactory.getCalculator(inputArr[1]);
                if(calculator instanceof Division){
                    if(zeroValidator.validate(inputArr[2])){
                        System.out.println("Operand2 should not be 0 or 0.0 for Division");
                        continue;
                    }
                } 
                double result = calculator.calculate(Double.parseDouble(inputArr[0]), Double.parseDouble(inputArr[2]));
                System.out.println(inputs + "=" + result);
            } else{
                System.out.println("Invalid inputs : "+inputs);
            }

        }
    }

}
