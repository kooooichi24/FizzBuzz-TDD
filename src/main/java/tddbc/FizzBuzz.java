package tddbc;

/**
 * FizzBuzz を実現するためのクラス
 */
public class FizzBuzz {
    public String convert(int num) {
        if (num % 3 == 0) {
            return "Fizz";
        }
        if (num % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(num);
    }
}
