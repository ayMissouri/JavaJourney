import java.util.Scanner;

public class CalcMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(12, 12));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Which operation? (a or s)");
        String choice = scanner.next();

        System.out.println("Enter your first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter your second number:");
        int secondNumber = scanner.nextInt();

        if (choice.equals("a")) {
            System.out.println("Answer is: " + calc.add(firstNumber, secondNumber));
        } else if (choice.equals("s")) {
            System.out.println("Answer is: " + calc.subtract(firstNumber, secondNumber));
        } else {
            System.out.println("Unknown Input!");
        }
    }
}