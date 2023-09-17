import java.util.Scanner;

class Program {
    static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

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
            System.out.print("-> ");
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();

                if (isPrime(sumOfDigits(input)))
                    count++;
                if (input == 42) {
                    System.out.println("   Count of coffee-request: " + count);
                    break;
                }
            } else {
                System.out.println("   Invalid input. Please enter an integer.");
                scanner.next();
            }
        }
        scanner.close();
    }

    public static void main(String... args) {
        twentyForFinder();
    }
}