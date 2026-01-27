
import java.util.Scanner;
class SwitchCalculator {
    public static void main(String[] args) {
        // Simple calculator using switch-case with operator as string
        Scanner input = new Scanner(System.in);
        double first = input.nextDouble();
        double second = input.nextDouble();
        String op = input.next();
        double result;
        switch (op) {
            case "+":
                result = first + second;
                System.out.println(result);
                break;
            case "-":
                result = first - second;
                System.out.println(result);
                break;
            case "*":
                result = first * second;
                System.out.println(result);
                break;
            case "/":
                if (second == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    System.out.println(first / second);
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }
        input.close();
    }
}
