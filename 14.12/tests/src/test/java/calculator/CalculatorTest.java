package calculator;

import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
	private Calculator calculator;

	@BeforeEach
	void setUp () {
		System.out.println("Przed testem.");
		calculator = new Calculator();
	}

	@Test
	public void testAdditionMethod(){
		int a = 2;
		int b = 3;
		int result = calculator.addition(a, b);
		assertEquals (5, result);
	}

	@Test
	public void testAdditionMethodWithBigNumbers(){
		int a = 2147483647;
		int b = 3;
		int result = 0;
		try {
			result = calculator.addition(a, b);
		}catch( ArithmeticException e ) {
//			test passes
		}
		assertEquals ( 2147483647 + 3, result);
	}

	@Disabled
	@Test
	public void testSubstractionMethod(){

	}

	@Test
	public void testMultiplicationMethod(){

	}

	@Test
	public void testDivisionMethod(){

	}

//	todo jak testować wyjątek.
}
