import java.util.Scanner;

public class Demo012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate the area
        double area = Math.PI * Math.pow(radius, 2);

        // Display the result
        System.out.printf("The area of the circle is: %.2f", area);
    }
}