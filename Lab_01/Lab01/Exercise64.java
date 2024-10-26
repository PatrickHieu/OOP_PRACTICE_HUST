package Lab01;

import java.util.Scanner;

public class Exercise64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter month (1-12 or name): ");
        String monthInput = scanner.next();

        System.out.println("Enter year: ");
        int year = scanner.nextInt();

        int month = getMonthNumber(monthInput);
        if (month == -1 || year < 0) {
            System.out.println("Invalid month or year. Please try again.");
        } else {
            int days = getDaysInMonth(month, year);
            System.out.println("Days in " + monthInput + " of " + year + ": " + days);
        }
        scanner.close();
    }

    public static int getMonthNumber(String monthInput) {
        switch (monthInput.toLowerCase()) {
            case "january": case "jan.": case "jan": case "1": return 1;
            case "february": case "feb.": case "feb": case "2": return 2;
            default: return -1;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: return 31;
            case 4: case 6: case 9: case 11: return 30;
            case 2: return (isLeapYear(year)) ? 29 : 28;
            default: return -1;
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}    

