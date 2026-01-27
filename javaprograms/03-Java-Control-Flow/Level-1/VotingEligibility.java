
import java.util.Scanner;
class VotingEligibility {
    public static void main(String[] args) {
        // Read age from user
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        // Check voting eligibility (>=18)
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
        input.close();
    }
}
