
import java.util.Scanner;
class BMICalculator {
    public static void main(String[] args) {
        // Calculate BMI and show weight status
        Scanner input = new Scanner(System.in);
        double weightKg = input.nextDouble(); // weight in kg
        double heightCm = input.nextDouble(); // height in cm
        double heightM = heightCm / 100.0; // convert to meters
        double bmi = weightKg / (heightM * heightM);
        String status = "";
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 25.0) {
            status = "Normal weight";
        } else if (bmi < 30.0) {
            status = "Overweight";
        } else {
            status = "Obese";
        }
        System.out.println("BMI = " + bmi);
        System.out.println("Status = " + status);
        input.close();
    }
}
