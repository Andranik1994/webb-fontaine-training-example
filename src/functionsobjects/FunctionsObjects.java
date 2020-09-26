package functionsobjects;

import functionsobjects.persons.Company;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class FunctionsObjects {
    static Scanner scanner = new Scanner(System.in);

    //  Positive Integer Input With Warning if not Integer Or number <0 0
    public static int getPositiveInteger(String message) {
        int length;
        do {
            System.out.print(message);
            checkInputInt("Number can be only Integer and Positive !!! Try again. ");
            length = scanner.nextInt();
        } while (length <= 0);
        return length;
    }

    //  Check Double Input
    public static void checkInputDouble(String warningMessage) {
        while (true) {
            if (!scanner.hasNextDouble()) {
                System.out.print(warningMessage);
                scanner.next();
                continue;
            }
            return;
        }
    }

    //  Check Integer Input
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

    // Input Double Array
    public static void inputDoubleArray(double[] array) {
        for (int i = 0; i < array.length; ++i) {
            System.out.printf("Input Array[%d] ", i);
            FunctionsObjects.checkInputDouble(String.format("Array[%d] can be only Double. Try again. Input array[%d] ", i, i));
            array[i] = FunctionsObjects.scanner.nextDouble();
        }
    }

    // Input Double Array with array Name
    public static void inputDoubleArray(double[] array, String name) {
        for (int i = 0; i < array.length; ++i) {
            System.out.printf("Input %s[%d] ", name, i + 1);
            FunctionsObjects.checkInputDouble(String.format("%s[%d] can be only Double. Try again. Input array[%d] ", name, i + 1, i + 1));
            array[i] = FunctionsObjects.scanner.nextDouble();
        }
    }

    // Print Double Array
    public static void printDoubleArrayWithFormat(double[] array, String format) {
        DecimalFormat df = new DecimalFormat(format);
        for (int i = 0; i < array.length; ++i) {
            if (i != array.length - 1) {
                System.out.printf("%s, ", df.format(array[i]));
            } else {
                System.out.printf("%s", df.format(array[i]));
            }
        }
    }

    // Input Integer >= 0
    public static int getIntegerFromZero(String message) {
        int length;
        do {
            System.out.print(message);
            checkInputInt("Number can be only Integer and >= 0 !!! Try again. ");
            length = scanner.nextInt();
        } while (length < 0);
        return length;
    }

    // Provide Random String From array
    public static String getRandomStringFrom(String[] array) {
        int random = new Random().nextInt(array.length);
        return array[random];
    }

    // Provide Random String From array
    public static Company getRandomCompanyFrom(Company[] array) {
        int random = new Random().nextInt(array.length);
        return array[random];
    }

}
