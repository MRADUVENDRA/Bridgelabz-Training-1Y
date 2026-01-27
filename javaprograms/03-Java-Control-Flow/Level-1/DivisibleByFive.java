
import java.util.Scanner;
class DivisibleByFive {
    public static void main(String[] args) {
        // Create a Scanner to read user input
        Scanner input = new Scanner(System.in);
        // Read an integer number from the user
        int number = input.nextInt();
        // Check if number is divisible by 5 using modulus operator
        if (number % 5 == 0) {
            // Print true if divisible
            System.out.println("Is the number " + number + " divisible by 5? true");
        } else {
            // Print false otherwise
            System.out.println("Is the number " + number + " divisible by 5? false");
        }
        // Close the scanner to free resources
        input.close();
    }
}
