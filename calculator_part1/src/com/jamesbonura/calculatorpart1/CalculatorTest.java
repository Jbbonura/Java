package com.jamesbonura.calculatorpart1;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		
		//TEST DIRECTLY
		calc.setOperandOne(10.5);
		calc.setOperandTwo(5.2);
		calc.setOperation("+");
		calc.getResults();
		
//		//TEST ONGOING CALC
//		calc.doMath();
	}

}
