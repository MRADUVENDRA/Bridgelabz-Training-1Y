
import java.util.Scanner;
class SumUntilNonPositive {
    public static void main(String[] args) {
        // Sum until user enters zero or a negative number using break
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        while (true) {
            double v = input.nextDouble();
            if (v <= 0.0) {
                break; // stop on zero or negative
            }
            total = total + v;
        }
        System.out.println("Total = " + total);
        input.close();
    }
}
