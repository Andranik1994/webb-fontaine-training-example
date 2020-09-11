package loopsarrays;

public class Task9 extends LoopsArraysDemo {

    public static void main(String[] args) {
        System.out.println("---Task_9---");

        int arrayLength = getPositiveInteger("Input Positive Array Length ");
        int[] array = new int[arrayLength];

        for (int i = 0; i < arrayLength; ++i) {
            System.out.printf("Input array[%d] ", i);
            checkInputInt(String.format("Array[%d] can be only Integer. Try again. Input array[%d] ", i, i));
            array[i] = scanner.nextInt();
        }

        

        System.out.println();
    }
}
