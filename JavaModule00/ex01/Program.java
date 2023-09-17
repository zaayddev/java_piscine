import java.lang.Math;
import java.util.Scanner;

public class Program {
    static int iterartionCount = 0;

    static boolean isPrime(int number) {            
        if (number <= 1)
            return false;

        else if (number == 2 || number == 3)
            return true;
    
        for (int i = 2; i <= Math.sqrt(number); i++) {
            iterartionCount++;
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static void main (String... args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("-> ");
        int number = myObj.nextInt();
        if (number <= 0) {
            System.err.println("   IllegalArgument");
            System.exit(-1);
        } else {
            System.out.println("   " + isPrime(number) + " " + iterartionCount);   
        }
    }
}