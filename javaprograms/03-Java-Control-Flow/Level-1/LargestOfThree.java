
import java.util.Scanner;
class LargestOfThree {
    public static void main(String[] args) {
        // Read three numbers
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        // Compare and print which is largest
        System.out.println("Is the first number the largest? " + (a > b && a > c));
        System.out.println("Is the second number the largest? " + (b > a && b > c));
        System.out.println("Is the third number the largest? " + (c > a && c > b));
        input.close();
    }
}
