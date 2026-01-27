
import java.util.Scanner;
class FirstIsSmallest {
    public static void main(String[] args) {
        // Scanner to read three integers
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        // Check if the first number is strictly smaller than both others
        boolean isSmallest = (number1 < number2) && (number1 < number3);
        // Print result
        System.out.println("Is the first number the smallest? " + isSmallest);
        input.close();
    }
}
