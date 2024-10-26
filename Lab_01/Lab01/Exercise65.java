package Lab01;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise65 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();

        double[] array = new double[size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
        }

        scanner.close();
        
        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));

        double sum = 0;
        for (double num : array) {
            sum += num;
        }

        double average = sum / size;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
