
import java.util.Scanner;
class CountdownFor {
    public static void main(String[] args) {
        // Read starting value
        Scanner input = new Scanner(System.in);
        int start = input.nextInt();
        // Use for loop to count down
        for (int i = start; i >= 1; i--) {
            System.out.println(i);
        }
        input.close();
    }
}
