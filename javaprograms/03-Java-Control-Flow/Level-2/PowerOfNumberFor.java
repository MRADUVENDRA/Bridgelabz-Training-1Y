
import java.util.Scanner;
class PowerOfNumberFor {
    public static void main(String[] args) {
        // Compute number^power using for loop
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int power = input.nextInt();
        if (power < 0) {
            System.out.println("Power should be non-negative integer");
            input.close();
            return;
        }
        long result = 1;
        for (int i = 1; i <= power; i++) {
            result = result * number;
        }
        System.out.println(number + "^" + power + " = " + result);
        input.close();
    }
}
