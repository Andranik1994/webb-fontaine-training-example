package functionsobjects;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("---Task_1---");

        //  Input array Length
        int arrayLength = FunctionsObjects.getPositiveInteger("Input Positive Array Length ");

        //  Create array
        double[] array = new double[arrayLength];

        //  Input Array
        FunctionsObjects.inputDoubleArray(array);

        //  Double Array
        doubleArray(array);

        //  Print Final Array
        FunctionsObjects.printDoubleArrayWithFormat(array, "#.##");

        System.out.println();
    }

    //  Method Which Double Any Double Array
    static void doubleArray(double[] array) {
        for (int i = 0; i < array.length; ++i) {
            array[i] = array[i] * 2;
        }
    }

}
