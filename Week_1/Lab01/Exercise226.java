package Lab01;

import java.util.Scanner;

public class Exercise226 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose (1: first-degree , 2: second-degree): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Solve first-degree ax + b = 0");
            System.out.print("a: ");
            double a = scanner.nextDouble();
            System.out.print("b: ");
            double b = scanner.nextDouble();
            if (a == 0) System.out.println("Error!");
            else System.out.println("x = " + (-b / a));
        } 
        else if (choice == 2) {
            System.out.println("Solve second-degree ax² + bx + c = 0");
            System.out.print("a: ");
            double a = scanner.nextDouble();
            System.out.print("b: ");
            double b = scanner.nextDouble();
            System.out.print("c: ");
            double c = scanner.nextDouble();

            double delta = b * b - 4 * a * c;
            if (delta > 0) {
                System.out.println("x1 = " + ((-b + Math.sqrt(delta)) / (2 * a)));
                System.out.println("x2 = " + ((-b - Math.sqrt(delta)) / (2 * a)));
            } else if (delta == 0) {
                System.out.println("x = " + (-b / (2 * a)));
            } else {
                System.out.println("No real roots");
            }
        } else {
            System.out.println("Error!");
        }

        scanner.close();
    }
}
