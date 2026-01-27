
import java.util.Scanner;
class SumUntilZero {
    public static void main(String[] args) {
        // Sum numbers until user enters 0
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        while (true) {
            double v = input.nextDouble();
            if (v == 0.0) {
                break;
            }
            total = total + v;
        }
        System.out.println("Total = " + total);
        input.close();
    }
}
