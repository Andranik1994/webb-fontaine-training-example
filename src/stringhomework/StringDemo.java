package stringhomework;

import java.util.Scanner;

public class StringDemo {
    static Scanner scanner = new Scanner(System.in);

    public static void checkInputInt(String warningMessage) {
        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.print(warningMessage);
                scanner.next();
                continue;
            }
            return;
        }
    }

    public static int getPositiveInteger(String message) {
        int length;
        do {
            System.out.print(message);
            checkInputInt("Number can be only Integer and Positive !!! Try again. ");
            length = scanner.nextInt();
        } while (length <= 0);
        return length;
    }

    public static int getIntegerFromZeroToTextLength(String text, String message) {
        int length;
        do {
            System.out.print(message);
            checkInputInt("Number can be only Integer and >= 0 !!! Try again. ");
            length = scanner.nextInt();
        } while (length < 0 || length >= text.length());
        return length;
    }

}
