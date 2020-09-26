package functionsobjects;

public class Task4 {

    public static void main(String[] args) {
        System.out.println("---Task_4---");

        //  Init arrays lengths
        int firstArrayLength = FunctionsObjects.getPositiveInteger("Input Positive First Array Length ");
        int secondArrayLength = FunctionsObjects.getPositiveInteger("Input Positive Second Array Length ");

        // Input First Array
        double[] array1 = new double[firstArrayLength];
        for (int i = 0; i < array1.length; ++i) {
            System.out.printf("Input Array1[%d] ", i);
            FunctionsObjects.checkInputDouble(String.format("Array1[%d] can be only Double. Try again. Input array1[%d] ", i, i));
            array1[i] = FunctionsObjects.scanner.nextDouble();
        }

        // Input First Array
        double[] array2 = new double[secondArrayLength];
        for (int i = 0; i < array2.length; ++i) {
            System.out.printf("Input Array2[%d] ", i);
            FunctionsObjects.checkInputDouble(String.format("Array2[%d] can be only Double. Try again. Input array2[%d] ", i, i));
            array2[i] = FunctionsObjects.scanner.nextDouble();
        }

        //  Create Combined Array
        double[] arrayForCombine = combineArrays(array1, array2);

        // Print Combined Array
        FunctionsObjects.printDoubleArrayWithFormat(arrayForCombine, "#.##");

        //  Calculate Average Of first and second Arrays
        double average = calculateAverageValueOfArrays(array1, array2);

        System.out.println();

        //  Print Average Of first and second Arrays
        System.out.printf("Average of Arrays = %.3f", average);

        System.out.println();
    }

    // Method which combine Arrays
    static double[] combineArrays(double[]... arrays) {
        int finalArrayLength = 0;
        for (double[] array : arrays) {
            finalArrayLength = finalArrayLength + array.length;
        }
        double[] finalArray = new double[finalArrayLength];
        int calculator = 0;
        for (double[] array : arrays) {
            for (double value : array) {
                finalArray[calculator] = value;
                ++calculator;
            }
        }
        return finalArray;
    }

    // Method which Calculate Average values and sum them
    static double calculateAverageValueOfArrays(double[]... arrays) {
        double average = 0;
        int calculator = 0;
        for (double[] array : arrays) {
            for (double value : array) {
                average = average + value;
                ++calculator;
            }
        }
        average = average / calculator;
        return average;
    }

}
