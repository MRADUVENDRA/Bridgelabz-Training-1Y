
import java.util.Scanner;
class SumNaturalNumbersFormula {
    public static void main(String[] args) {
        // Read a number to check natural number and sum of n natural numbers
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        // Check if n is a natural number (positive integer)
        if (n > 0) {
            // Compute sum using formula n*(n+1)/2
            int sum = n * (n + 1) / 2;
            System.out.println("The sum of " + n + " natural numbers is " + sum);
        } else {
            // Not a natural number
            System.out.println("The number " + n + " is not a natural number");
        }
        input.close();
    }
}
