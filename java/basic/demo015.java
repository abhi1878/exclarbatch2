import java.util.Scanner;

public class Demo015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Before swapping: firstNumber = " + firstNumber + ", secondNumber = " + secondNumber);

        // Swap numbers using a temporary variable
        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;

        System.out.println("After swapping: firstNumber = " + firstNumber + ", secondNumber = " + secondNumber);
    }
}