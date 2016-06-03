import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorTest
{
	@Test
	public void EmptyStringReturnsZero()
	{
		Calculator calculator = new Calculator();
		int expectedResult = calculator.Add("");

		assertEquals(0, expectedResult);
	}
}
