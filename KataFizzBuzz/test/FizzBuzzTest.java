import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
	FizzBuzz _fizzBuzz;

	@BeforeClass
	public void Setup(){
		_fizzBuzz = new FizzBuzz();
	}

    @Test
    public void Input_1_Must_Return_1() {
        String actualResult = _fizzBuzz.Say(1);

        assertEquals("1", actualResult);
    }

    @Test
    public void Input_2_Must_Return_2() {
        String actualResult = _fizzBuzz.Say(2);

        assertEquals("2", actualResult);
    }

    @Test
    public void Input_3_Must_Return_Fizz() {
        String actualResult = _fizzBuzz.Say(3);

        assertEquals("Fizz", actualResult);
    }

	@DataProvider(name = "Numbers")
	public static Object[][] Numbers(){
		return new Object[][]{{1,"1"}, {2, "2"}, {3, "Fizz"}};
	}

	@Test(dataProvider = "Numbers")
	public void FizzBuzzTests(int number, String expectedResult) {
        String actualResult = _fizzBuzz.Say(number);
        assertEquals(expectedResult, actualResult);
    }
}
