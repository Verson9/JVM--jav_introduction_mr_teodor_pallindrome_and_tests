package calculator;

public class Calculator {

	int addition(int a, int b){ return  Math.addExact(a, b); }

	int division(int a, int b) throws IllegalArgumentException {
		int result;
		try {
			result = a / b;
		}catch(IllegalArgumentException e) {
			result = Integer.parseInt("Tylko cwele dzielo przez zero!!!");
		}
		return result;
	}

	int substraction(int a, int b){return a-b;}
	int multiplication(int a, int b) {return a*b;}








}
