
import java.util.Scanner;
class ArmstrongNumber {
    public static void main(String[] args) {
        // Check Armstrong number (sum of cubes of digits)
        Scanner input = new Scanner(System.in);
        int original = input.nextInt();
        int number = original;
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit * digit * digit; // cube of digit
            number = number / 10;
        }
        if (sum == original) {
            System.out.println(original + " is an Armstrong Number");
        } else {
            System.out.println(original + " is not an Armstrong Number");
        }
        input.close();
    }
}
