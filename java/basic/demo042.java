import java.util.Scanner;

public class Demo042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a lowercase character: ");
        char lowerChar = scanner.next().charAt(0);

        // Convert the character to uppercase
        char upperChar = Character.toUpperCase(lowerChar);

        System.out.println("The uppercase of " + lowerChar + " is " + upperChar + ".");

        scanner.close();
    }
}