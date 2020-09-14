package loopsarrays;

public class Task8 {

    public static void main(String[] args) {
        System.out.println("---Task_8---");

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
        boolean firstIsSmaller;
        if (firstArrayLength <= secondArrayLength) {
            firstIsSmaller = false;
        } else {
            firstIsSmaller = true;
        }

        if (firstIsSmaller) {
            for (int i = 0; i < firstArrayLength; ++i) {
                for (int j = 0; j < secondArrayLength; ++j) {
                    if (array1[i] == array2[j]) {
                        finalArray = LoopsArraysDemo.addUnicNumberToDoubleArray(finalArray, array1[i]);
                    }
                }
            }
        } else {
            for (int i = 0; i < secondArrayLength; ++i) {
                for (int j = 0; j < firstArrayLength; ++j) {
                    if (array2[i] == array1[j]) {
                        finalArray = LoopsArraysDemo.addUnicNumberToDoubleArray(finalArray, array2[i]);
                    }
                }
            }
        }

        System.out.println("---The repeating values are---");
        for (int i = 0; i < finalArray.length; ++i) {
            if (i != finalArray.length - 1) {
                System.out.printf("%.2f, ", finalArray[i]);
            } else {
                System.out.printf("%.2f", finalArray[i]);
            }
        }

        System.out.println();
    }
}
