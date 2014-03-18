package bhaskara;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testDelta() {
		
		Calculator calc = new Calculator();
		
		assertEquals("Delta value", calc.delta(4, 10, 2), 68.0, 0.1);
		
		
//		
//		System.out.println("Delta " + calc.delta(4, 10, 2));
//		
//		System.out.println("Result " + Arrays.toString(calc.calculate(4, 10, 2)));
//		
		
		
//		fail("Not yet implemented");
	}

	@Test
	public void testCalculator() {
		Calculator calc = new Calculator();
		
		try {			
			double[] result = calc.calculate(4, 10, 2);
			assertEquals("Result 1", result[0], -0.219223593596, 0.000000000001);

			assertEquals("Result 2", result[1], -2.2807764064, 0.000000001);
		}
		catch(Exception ex) {
			fail(ex.getMessage());
		}
	}
	
	
	@Test(expected=Exception.class)
	public void testException() throws Exception {
		Calculator calc = new Calculator();
		
		calc.calculate(2, 3, 4);
		
	}
}
