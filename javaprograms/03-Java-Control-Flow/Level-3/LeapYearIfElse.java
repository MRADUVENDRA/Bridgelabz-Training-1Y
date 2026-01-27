
import java.util.Scanner;
class LeapYearIfElse {
    public static void main(String[] args) {
        // Read year
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        // Check Gregorian calendar lower bound
        if (year < 1582) {
            System.out.println("Year must be 1582 or later");
            input.close();
            return;
        }
        // Leap year rules
        if (year % 400 == 0) {
            System.out.println("Year is a Leap Year");
        } else if (year % 100 == 0) {
            System.out.println("Year is not a Leap Year");
        } else if (year % 4 == 0) {
            System.out.println("Year is a Leap Year");
        } else {
            System.out.println("Year is not a Leap Year");
        }
        input.close();
    }
}
