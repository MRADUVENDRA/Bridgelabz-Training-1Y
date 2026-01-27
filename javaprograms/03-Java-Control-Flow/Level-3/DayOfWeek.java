
import java.util.Scanner;
class DayOfWeek {
    public static void main(String[] args) {
        // Read month (m), day (d), year (y)
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int d = input.nextInt();
        int y = input.nextInt();
        // Apply formulas from Gregorian calendar (integer division)
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        // Print 0 for Sunday, 1 Monday, ... as required
        System.out.println(d0);
        input.close();
    }
}
