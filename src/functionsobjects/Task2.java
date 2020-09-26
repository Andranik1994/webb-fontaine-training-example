package functionsobjects;

import java.text.DecimalFormat;

public class Task2 {

    public static void main(String[] args) {
        System.out.println("---Task_2---");

        //  Input array Length
        int arrayLength = FunctionsObjects.getPositiveInteger("Input Positive Array Length ");

        //  Create array
        double[] array = new double[arrayLength];

        //  Input Array
        FunctionsObjects.inputDoubleArray(array);

        //  Init Sum and Calculate Array Sum
        double sum  = calculateArraySum(array);

        //  Print Array Sum
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.printf("Array sum = %s", df.format(sum));

        System.out.println();
    }

    //  Method Which Calculate Sum of given doubles
    static double calculateArraySum(double... value) {
        double sum = 0;
        for (double i : value) {
            sum += i;
        }
        return sum;
    }

}
