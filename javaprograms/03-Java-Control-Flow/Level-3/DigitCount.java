
import java.util.Scanner;
class DigitCount {
    public static void main(String[] args) {
        // Count number of digits in integer
        Scanner input = new Scanner(System.in);
        int number = Math.abs(input.nextInt()); // make positive
        int count = 0;
        if (number == 0) {
            count = 1;
        } else {
            while (number != 0) {
                number = number / 10;
                count = count + 1;
            }
        }
        System.out.println("Number of digits = " + count);
        input.close();
    }
}
