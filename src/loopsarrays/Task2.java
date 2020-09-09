package loopsarrays;

public class Task2 extends LoopsArraysDemo {

    public static void main(String[] args) {
        System.out.println("---Task_2---");

        double[] array = new double[10];
        double sum = 0;

        for (int i = 0; i < array.length; ++i) {
            System.out.printf("Input Array[%d] ",i);
            checkInputDouble(String.format("Array[%d] can be only Double. Try again. Input array[%d] ", i, i));
            array[i] = scanner.nextDouble();
            sum += array[i];
        }

        System.out.println("Arithmetic mean of array elements = " + sum / array.length);

        System.out.println();
    }
}
