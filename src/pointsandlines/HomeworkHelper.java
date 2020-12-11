package pointsandlines;

import java.util.Scanner;

public class HomeworkHelper {

    //  TODO How write test for this?
    public static Double inputDouble(String warningMessage) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (!scanner.hasNextDouble()) {
                System.out.print(warningMessage);
                scanner.next();
                continue;
            }
            return Double.valueOf(scanner.next());
        }
    }

    public static boolean isStringHasLowCase(String str){
        if (str == null || str.isEmpty() || str.isBlank()) {
            return true;
        }

        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            if (!Character.isUpperCase(c))
                return true;
        }
        return false;
    }

}
