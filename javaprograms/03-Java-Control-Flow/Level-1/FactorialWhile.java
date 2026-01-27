
import java.util.Scanner;
class FactorialWhile {
    public static void main(String[] args) {
        // Compute factorial using while loop
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n < 0) {
            System.out.println("Factorial not defined for negative numbers");
            input.close();
            return;
        }
        int result = 1;
        int i = 1;
        while (i <= n) {
            result = result * i;
            i = i + 1;
        }
        System.out.println("Factorial of " + n + " is " + result);
        input.close();
    }
}
