package com.lesson4;

public class SimpleCalculator {
	//declare instance variables
	private double firstNumber;
	private double secondNumber;
	private double result;
	
	//declare action of our processing method
	public void multiply(){
		result = firstNumber*secondNumber;
	}
	
	public void devide(){
		result = firstNumber/secondNumber;
	}
	
	public void display(){
		System.out.println("our first number: " + firstNumber);
		System.out.println("our second number: " + secondNumber);
		System.out.println();
	}
	//declare setter method-to receive a value from the user
	public void setFirstNumber(double number){
		//store number in the firstNumber  of instance variable
		firstNumber =number;
	}
	public void setSecondNumber(double num){
		//store number in the secondNumber  of instance variable
		secondNumber =num;
	}
	//getter method for instance result, which should retrieve/get the result of computing
	public double getResult(){
		return result;
	}
}
