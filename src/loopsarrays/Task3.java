package loopsarrays;

public class Task3 {

    public static void main(String[] args) {
        System.out.println("---Task_3---");

        int firstArrayLength = LoopsArraysDemo.getPositiveInteger("Input Positive First Array Length ");
        int secondArrayLength = LoopsArraysDemo.getPositiveInteger("Input Positive Second Array Length ");

        double[] array1 = new double[firstArrayLength];
        for (int i = 0; i < array1.length; ++i) {
            System.out.printf("Input Array1[%d] ", i);
            LoopsArraysDemo.checkInputDouble(String.format("Array1[%d] can be only Double. Try again. Input array1[%d] ", i, i));
            array1[i] = LoopsArraysDemo.scanner.nextDouble();
        }

        double[] array2 = new double[secondArrayLength];
        for (int i = 0; i < array2.length; ++i) {
            System.out.printf("Input Array2[%d] ", i);
            LoopsArraysDemo.checkInputDouble(String.format("Array2[%d] can be only Double. Try again. Input array2[%d] ", i, i));
            array2[i] = LoopsArraysDemo.scanner.nextDouble();
        }

        double[] finalArray = new double[0];
        boolean flag;

        for (double value : array1) {
            flag = true;
            for (double v : array2) {
                if (value == v) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                finalArray = LoopsArraysDemo.addUnicNumberToDoubleArray(finalArray, value);
            }
        }

        if (finalArray.length > 0) {
            for (double v : finalArray) {
                System.out.printf("Number %.2f from first array is not occur in second\n", v);
            }
        } else {
            System.out.println("All numbers are repeated.");
        }

        System.out.println();
    }
}
