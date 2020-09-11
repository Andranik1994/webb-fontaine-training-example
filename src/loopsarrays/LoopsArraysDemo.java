package loopsarrays;

import java.util.Scanner;

public class LoopsArraysDemo {
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

    public static int getIntegerFromZero(String message) {
        int length;
        do {
            System.out.print(message);
            checkInputInt("Number can be only Integer and >= 0 !!! Try again. ");
            length = scanner.nextInt();
        } while (length < 0);
        return length;
    }

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

    public static double[] addUnicNumberToDoubleArray(double[] array, double number) {

        for (int i = 0; i < array.length; ++i) {
            if (array[i] == number) {
                return array;
            }
        }

        double[] finalArray = new double[array.length + 1];
        for (int i = 0; i < array.length; ++i) {
            finalArray[i] = array[i];
        }
        finalArray[array.length] = number;

        return finalArray;
    }

    public static int[] addUnicNumberToIntArray(int[] array, int number) {

        for (int i = 0; i < array.length; ++i) {
            if (array[i] == number) {
                return array;
            }
        }

        int[] finalArray = new int[array.length + 1];
        for (int i = 0; i < array.length; ++i) {
            finalArray[i] = array[i];
        }
        finalArray[array.length] = number;

        return finalArray;
    }

    public static int[] addNumberToBeginningOfIntArray(int[] array, int number) {
        int[] finalArray = new int[array.length + 1];
        for (int i = 0; i < array.length; ++i) {
            finalArray[i + 1] = array[i];
        }
        finalArray[0] = number;

        return finalArray;
    }

    public static int[] removeIndexFromIntArray(int[] array, int index) {
        int[] finalArray = new int[array.length - 1];
        int k = 0;

        for (int i = 0; i < array.length; ++i) {
            if (i == index) {
                continue;
            }
            finalArray[k] = array[i];
            ++k;
        }

        return finalArray;
    }


}
