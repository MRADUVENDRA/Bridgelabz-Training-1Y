
import java.util.Scanner;
class CountdownWhile {
    public static void main(String[] args) {
        // Read starting value for countdown
        Scanner input = new Scanner(System.in);
        int counter = input.nextInt();
        // Use while loop to count down to 1
        while (counter >= 1) {
            System.out.println(counter);
            counter = counter - 1; // decrement
        }
        input.close();
    }
}
