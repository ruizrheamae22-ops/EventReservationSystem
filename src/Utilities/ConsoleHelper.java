package Utilities;

import java.util.Scanner;

public class ConsoleHelper {
    private static final Scanner SC = new Scanner(System.in);

    public static Scanner scanner() { return SC; }

    public static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void header(String title) {
        clear();
        System.out.println("==================================");
        System.out.println(" " + title);
        System.out.println("==================================");
    }

    public static void pause() {
        System.out.print("\nPress Enter to continue...");
        SC.nextLine();
    }
}
