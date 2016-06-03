public class FizzBuzz {
    public String Say(int number)
    {
        String result = "";
        if(number % 3 == 0)
        {
            result += "Fizz";
        }
        if(number % 5 == 0)
        {
            result += "Buzz";
        }
        if (result == "")
        {
            result = String.valueOf(number);
        }
        return result;
    }
}
