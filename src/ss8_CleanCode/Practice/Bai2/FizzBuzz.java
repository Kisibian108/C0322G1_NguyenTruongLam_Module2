package ss8_CleanCode.Practice.Bai2;

public class FizzBuzz {
    public static String fizzBuzz(int number){
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;
        if(isFizz && isFizz)
            return "FizzBuzz";

        if(isFizz)
            return "Fizz";

        if(isFizz)
            return "Buzz";

        return number + "";
    }
}