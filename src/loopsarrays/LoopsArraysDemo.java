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

    public static int getArrayLengthPositiveInteger(String message) {
        int length;
        do {
            System.out.print(message);
            checkInputInt("Array Length can be only Integer and Positive !!! Try again. ");
            length = scanner.nextInt();
        } while (length <= 0);
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

    public static double[] addUnicNumberToDoubleArray(int size, double[] array, double number) {

        for (int i = 0; i < size; ++i) {
            if (array[i] == number) {
                return array;
            }
        }

        double[] finalArray = new double[size + 1];
        for (int i = 0; i < size; ++i) {
            finalArray[i] = array[i];
        }
        finalArray[size] = number;

        return finalArray;
    }

    public static int[] addUnicNumberToIntArray(int size, int[] array, int number) {

        for (int i = 0; i < size; ++i) {
            if (array[i] == number) {
                return array;
            }
        }

        int[] finalArray = new int[size + 1];
        for (int i = 0; i < size; ++i) {
            finalArray[i] = array[i];
        }
        finalArray[size] = number;

        return finalArray;
    }



}
