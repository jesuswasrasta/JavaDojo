import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
	@DataProvider(name = "Numbers")
	public static Object[][] Numbers(){
		return new Object[][]{
				{1, "1"},
				{2, "2"},
				{3, "Fizz"},
				{4, "4"},
				{5, "Buzz"},
				{6, "Fizz"},
				{7, "7"},
				{8, "8"},
				{9, "Fizz"},
				{10, "Buzz"},
				{11, "11"},
				{12, "Fizz"},
				{13, "13"},
				{14, "14"},
				{15, "FizzBuzz"},
		};
	}

	@Test(dataProvider = "Numbers")
	public void FizzBuzzTests(int number, String expectedResult) {
		FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.Say(number);

        assertEquals(expectedResult, actualResult);
    }
}
