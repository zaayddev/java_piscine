/**
* Calculate the sum of digits of a six-digit int number. 
* the number value is set directly in the code by explicitly 
* initializating the number variable.
*/

public class Program {
    /**
    * @param  number    the number to be processed
    * @return           the sum of digits of the number
    */
    static int sumOfDigits (int number) {
        return ((number % 1000000) / 100000) + ((number % 100000) / 10000) + ((number % 10000) / 1000) + ((number % 1000) / 100) + ((number % 100) /10) + (number % 10);
    }
    public  static void main(String... args) {
        int number = 479598;
        System.out.println(sumOfDigits(number));
    }
}