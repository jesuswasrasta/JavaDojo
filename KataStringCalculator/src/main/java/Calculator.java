import java.util.Arrays;
import java.util.List;

public class Calculator
{
	public int Add(String text)
	{
		if (text.isEmpty())
		{
			return 0;
		}
		List<String> numbers = Arrays.asList(text.split(","));

		int total = 0;
		for (String numberString: numbers)
		{
			int number = Integer.parseInt(numberString);
			total += number;
		}

		return total;
	}
}
