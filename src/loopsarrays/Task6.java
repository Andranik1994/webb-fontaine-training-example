package loopsarrays;

public class Task6 {

    public static void main(String[] args) {
        System.out.println("---Task_6---");

        int arrayLength = LoopsArraysDemo.getPositiveInteger("Input Positive Array Length: array[?][] = ");
        int arrayLength2 = LoopsArraysDemo.getPositiveInteger(String.format("Input Positive Array Length: array[%d][?] = ", arrayLength));


        double[][] array = new double[arrayLength][arrayLength2];


        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < arrayLength2; ++j) {
                System.out.printf("Input Array[%d][%d] ", i, j);
                LoopsArraysDemo.checkInputDouble(String.format("Array[%d][%d] can be only Double. Try again. Input array[%d][%d] ", i, j, i, j));
                array[i][j] = LoopsArraysDemo.scanner.nextDouble();
            }
        }

        double[] finalArray = new double[arrayLength * arrayLength2];
        int calculator = 0;
        for (double[] doubles : array) {
            for (int j = 0; j < arrayLength2; ++j) {
                finalArray[calculator] = doubles[j];
                calculator++;
            }
        }

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
