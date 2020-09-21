package functionsobjects;

public class Task5 {

    public static void main(String[] args) {
        System.out.println("---Task_5---");

        //  Init array length
        int arrayLength = FunctionsObjects.getPositiveInteger("Input Positive First Array Length ");

        // Input  Array
        double[] array = new double[arrayLength];
        for (int i = 0; i < array.length; ++i) {
            System.out.printf("Input Array1[%d] ", i);
            FunctionsObjects.checkInputDouble(String.format("Array1[%d] can be only Double. Try again. Input array1[%d] ", i, i));
            array[i] = FunctionsObjects.scanner.nextDouble();
        }

        //  Input index
        int index = FunctionsObjects.getIntegerFromZero("Input Index which will be increase value ");

        //  Add 10% to number at array at index
        addTenPercentToArrayAtIndex(array, index);

        //  Print Array
        FunctionsObjects.printDoubleArrayWithFormat(array, "#.##");

        System.out.println();
    }

    //  Method which add 10% to number at array at index
    static void addTenPercentToArrayAtIndex(double[] array, int index) {
        array[index] += array[index] * 0.1;
    }
}
