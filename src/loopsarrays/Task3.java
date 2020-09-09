package loopsarrays;

public class Task3 extends LoopsArraysDemo {

    public static void main(String[] args) {
        System.out.println("---Task_3---");

        int firstArrayLength = getArrayLengthPositiveInteger("Input Positive First Array Length ");
        int secondArrayLength = getArrayLengthPositiveInteger("Input Positive Second Array Length ");

        double[] array1 = new double[firstArrayLength];
        for (int i = 0; i < array1.length; ++i) {
            System.out.printf("Input Array1[%d] ", i);
            checkInputDouble(String.format("Array1[%d] can be only Double. Try again. Input array1[%d] ", i, i));
            array1[i] = scanner.nextDouble();
        }

        double[] array2 = new double[secondArrayLength];
        for (int i = 0; i < array2.length; ++i) {
            System.out.printf("Input Array2[%d] ", i);
            checkInputDouble(String.format("Array2[%d] can be only Double. Try again. Input array2[%d] ", i, i));
            array2[i] = scanner.nextDouble();
        }

        double[] finalArray = new double[0];
        boolean flag;

        for (int i = 0; i < array1.length; ++i) {
            flag = true;
            for (int j = 0; j < array2.length; ++j) {
                if (array1[i] == array2[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                finalArray = addUnicNumberToDoubleArray(finalArray.length,finalArray,array1[i]);
            }
        }

        if (finalArray.length>0) {
            for (int i = 0; i < finalArray.length; ++i) {
                System.out.printf("Number %.2f from first array is not occur in second\n", finalArray[i]);
            }
        } else {
            System.out.println("All numbers are repeated.");
        }

        System.out.println();
    }
}
