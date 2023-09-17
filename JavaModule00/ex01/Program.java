/**
* Determine if the input number is prime.
* (A prime is a number which has no dividers other than the number itself and 1)
*
* The program accepts the number entered from the keyboard as input and displays
* the result of checking whether that number is a prime. In addition, the program
* shall output the number of steps (iterations) required to perform the check. In this
* exercise, an iteration is a single comparison operation.
*
* For negative numbers, 0 and 1, display IllegalArgument message and shut down
* the program with the -1 code.
*/

import java.lang.Math;
import java.util.Scanner;

public class Program {
    /**
    * @param  number    the number to be processed
    * @return           true if the number is prime, false otherwise
    */
    static int iterartionCount = 0;

    static boolean isPrime(int number) {            
        if (number <= 1)
            return false;

        else if (number == 2 || number == 3) {
            iterartionCount++;
            return true;
        }
    
        for (int i = 2; i <= Math.sqrt(number); i++) {
            iterartionCount++;
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static void main (String... args) {
        Scanner myObj = new Scanner(System.in);
        int number = myObj.nextInt();
        if (number <= 1) {
            System.err.println("IllegalArgument");
            System.exit(-1);
        } else {
            System.out.println(isPrime(number) + " " + iterartionCount);   
        }
    }
}