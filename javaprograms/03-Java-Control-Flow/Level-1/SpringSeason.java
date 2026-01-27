
import java.util.Scanner;
class SpringSeason {
    public static void main(String[] args) {
        // Read month and day from user
        Scanner input = new Scanner(System.in);
        int month = input.nextInt(); // 1=Jan, ..., 12=Dec
        int day = input.nextInt();
        // Spring is from March 20 (3/20) to June 20 (6/20)
        boolean isSpring = false;
        if (month < 3 || month > 6) {
            isSpring = false;
        } else if (month == 3) {
            isSpring = (day >= 20);
        } else if (month == 6) {
            isSpring = (day <= 20);
        } else {
            isSpring = true; // April or May
        }
        if (isSpring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
        input.close();
    }
}
