/** 
* Implement a program that will count the number of elements for a
* specified set of numbers whose sum of digits is a prime number. To keep it simple,
* let’s assume that this potentially infinite sequence of queries is still limited, and the last
* sequence element is number 42.
*/

import java.util.Scanner;

class Program {
    /**
    * @param  number    the number to be processed
    * @return           the sum of digits of the number
    */
    static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
    
    /**
    * @param  number    the number to be processed
    * @return           true if the number is prime, false otherwise
    */
    static boolean isPrime(int number) {            
        if (number <= 1)
            return false;

        else if (number == 2 || number == 3)
            return true;
    
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    static void twentyForFinder() {
        Scanner scanner = new Scanner(System.in);
        int input;
        int count = 0;

        while (true) {
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();

                if (isPrime(sumOfDigits(input)))
                    count++;
                if (input == 42) {
                    System.out.println("Count of coffee-request : " + count);
                    break;
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
            }
        }
        scanner.close();
    }

    public static void main(String... args) {
        twentyForFinder();
    }
}