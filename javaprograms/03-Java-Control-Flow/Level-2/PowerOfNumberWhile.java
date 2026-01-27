
import java.util.Scanner;
class PowerOfNumberWhile {
    public static void main(String[] args) {
        // Compute power using while loop
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int power = input.nextInt();
        if (power < 0) {
            System.out.println("Power should be non-negative integer");
            input.close();
            return;
        }
        long result = 1;
        int i = 1;
        while (i <= power) {
            result = result * number;
            i = i + 1;
        }
        System.out.println(number + "^" + power + " = " + result);
        input.close();
    }
}
