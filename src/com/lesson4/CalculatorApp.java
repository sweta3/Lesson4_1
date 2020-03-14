package com.lesson4;
/** CalculatorApp 
-- a simple calculator application to show how to use instantiable classes
-- the CalculatorApp reuses the instantiable class SimpleCalculator to perform the actual arithmetic operations
The class shows:
-- how to create an object of the instantiable class SimpleCalculator
-- how to use the setter methods to set/assign values to the instance variables (e.g. firstNumber and secondNumber) 
-- how to use a getter method to retrieve an instance variable's value (e.g. result)
-- how to use/invoke/call methods on the objects (e.g. calc.setFirstNumber(), calc.multiply(), etc.)
*/
//declare a class named CalculatorApp
public class CalculatorApp {
// declare the main method
public static void main(String args[]){
	// declare a variable of type SimpleCalculator
	SimpleCalculator calc;
	// create an object of type SimpleCalculator
	// we must create an object in order to use the methods (e.g. multiply(), divide()) of an instance/object of type SimpleCalculator 
	calc = new SimpleCalculator();
	// call/invoke the method display() on the object banana to display the values of the instance variables
	calc.display();
	// declare local variables
	// input
	double n1 = 2;
	n1 = 3;
	double n2=10;
	// store the input values into the instance variables of the object banana
	// use the setter method called setFirstNumber() to set/assign the value of variable n1 to the firstNumber instance variable
	calc.setFirstNumber(n1);
	calc.display();
	// use the setter method called setSecondNumber() to set/assign the value of variable n2 to the secondNumber instance variable
	calc.setSecondNumber(n2);
	calc.display();
	// processing
	// perform multiplication
	// instruct the object banana to perform a multiplication (i.e. call/invoke the method multiply() on the object named banana)
	calc.multiply();
	// output
	double r;
	// use the getter method to retrieve the result
	// 1) use the getter method called getResult() to retrieve the value of the result instance variable (i.e the result of the above multiplication)
	// 2) save the result in the double variable called r
	r = calc.getResult();
	// display the result
	System.out.println(r);
	// alternatively, the code from lines 51-57 can be rewritten as follows (note: use either one option or the other, otherwise the same result will be printed twice):
	System.out.println(calc.getResult());
	// System.out.println(banana.result);
	/* the above statement is commented out as it leads to a compilation error -- we cannot access the 
	object calc instance variables and methods which are declared with a private access modifier 
		-- the solution, in this case, is to declare a public getter method 
		-- in general we declare public setter and getter methods to access the instance variables */
}
}