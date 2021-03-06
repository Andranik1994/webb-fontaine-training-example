package loopsarrays;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("---Task_1---");

        int arrayLength = LoopsArraysDemo.getPositiveInteger("Input Positive Array Length ");

        int[] array = new int[arrayLength];
        int[] reversedArray = new int[arrayLength];

        for (int i = 0; i < arrayLength; ++i) {
            System.out.printf("Input array[%d] ", i);
            LoopsArraysDemo.checkInputInt(String.format("Array[%d] can be only Integer. Try again. Input array[%d] ", i, i));
            array[i] = LoopsArraysDemo.scanner.nextInt();
            reversedArray[arrayLength - i - 1] = array[i];
        }

        System.out.print("Input: ");
        for (int i = 0; i < arrayLength; ++i) {
            System.out.printf("%d ", array[i]);
        }

        System.out.print("\nResult: ");
        for (int i = 0; i < arrayLength; ++i) {
            System.out.printf("%d ", reversedArray[i]);
        }

        System.out.println();
    }
}
