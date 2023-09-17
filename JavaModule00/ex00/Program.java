/**
* Calculate the sum of digits of a six-digit int number. 
* the number value is set directly in the code by explicitly 
* initializating the number variable.
*/

// Must re-build this exercise
public class Program {
    /**
    * @param  number    the number to be processed
    * @return           the sum of digits of the number
    */
    static int sumOfDigits (int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
    public  static void main(String... args) {
        int number = 479598;
        System.out.println(sumOfDigits(number));
    }
}