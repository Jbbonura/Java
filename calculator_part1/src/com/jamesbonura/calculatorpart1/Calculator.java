package com.jamesbonura.calculatorpart1;

import java.io.Serializable;

public class Calculator implements Serializable {
	private String operation;
	private Double operandOne;
	private Double operandTwo;
	
	public Calculator() {
		
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public Double getOperandOne() {
		return operandOne;
	}

	public void setOperandOne(Double operandOne) {
		this.operandOne = operandOne;
	}

	public Double getOperandTwo() {
		return operandTwo;
	}

	public void setOperandTwo(Double operandTwo) {
		this.operandTwo = operandTwo;
	}
	
	public double performOperation() {
		if(operation.equals("+")) {
			double sum = operandOne + operandTwo;
			return sum;
		}
		else {
			double difference = operandOne - operandTwo;
			return difference;
		}
	}
	
	public void getResults() {
		double answer = performOperation();
		System.out.println(operandOne + " " + operation + " " + operandTwo + " = " + answer);
	}

//	public void doMath() {
//		String temp = "";
//		while(!temp.equals("g")) {
//			//GET FIRST NUMBER AND CONVERT TO DOUBLE
//			System.out.print("Enter the first number or q to quit: ");
//			temp = System.console().readLine();
//			operandOne = Double.parseDouble(temp);
//			
//			//GET OPERAND AND VERIFY
//			System.out.print("Enter + or - or q to quit: ");
//			temp = System.console().readLine();
//			if(temp.equals("+") || temp.equals("-")) {
//				operation = temp;
//			}
//			else {
//				System.out.print("Please only enter + or -");
//				temp = System.console().readLine();
//				operation = temp;
//			}
//			
//			//GET LAST NUBMER AND CONVERT TO DOUBLE
//			System.out.print("Enter the last number or q to quit: ");
//			temp = System.console().readLine();
//			operandTwo = Double.parseDouble(temp);
//			
////			//GET RESULTS
//			getResults();
//		}
//	}
}
