import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorTest
{
	@DataProvider(name = "Numbers")
	public static Object[][] Numbers(){
		return new Object[][]{
				{"", 0},
				{"1", 1},
				{"2", 2},
				{"1,2", 3},
				{"3,7", 10},
		};
	}

	@Test(dataProvider = "Numbers")
	public void CalculatorTests(String text, int expectedResult)
	{
		Calculator calculator = new Calculator();
		int actualResult = calculator.Add(text);

		assertEquals(expectedResult, actualResult);
	}
}
