package Utilities;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class InputValidator {
    public static String readString(String prompt) {
        System.out.print(prompt);
        return ConsoleHelper.scanner().nextLine().trim();
    }

    public static int readInt(String prompt) {
        while (true) {
            try {
                return Integer.parseInt(readString(prompt));
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Try again.");
            }
        }
    }

    public static double readDouble(String prompt) {
        while (true) {
            try {
                return Double.parseDouble(readString(prompt));
            } catch (NumberFormatException e) {
                System.out.println("Invalid amount. Try again.");
            }
        }
    }

    public static LocalDate readDate(String prompt) {
        while (true) {
            try {
                return LocalDate.parse(readString(prompt));
            } catch (DateTimeParseException e) {
                System.out.println("Use format yyyy-MM-dd (e.g. 2026-12-25).");
            }
        }
    }
}
