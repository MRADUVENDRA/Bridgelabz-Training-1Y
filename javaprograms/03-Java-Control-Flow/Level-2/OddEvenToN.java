
import java.util.Scanner;
class OddEvenToN {
    public static void main(String[] args) {
        // Print odd and even numbers from 1 to N
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is Even");
            } else {
                System.out.println(i + " is Odd");
            }
        }
        input.close();
    }
}
