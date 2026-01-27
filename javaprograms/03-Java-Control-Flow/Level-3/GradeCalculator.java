
import java.util.Scanner;
class GradeCalculator {
    public static void main(String[] args) {
        // Read marks for physics, chemistry, maths (out of 100)
        Scanner input = new Scanner(System.in);
        double p = input.nextDouble();
        double c = input.nextDouble();
        double m = input.nextDouble();
        // Compute average percentage
        double average = (p + c + m) / 3.0;
        String grade = "";
        String remarks = "";
        // Determine grade according to table
        if (average >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (average >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (average >= 60) {
            grade = "C";
            remarks = "Level 2, approaching agency-normalized standards";
        } else if (average >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (average >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "F";
            remarks = "Remedial standards";
        }
        // Print results
        System.out.println("Average mark = " + average);
        System.out.println("Grade = " + grade);
        System.out.println("Remarks = " + remarks);
        input.close();
    }
}
