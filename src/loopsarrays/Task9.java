package loopsarrays;

public class Task9 {

    public static void main(String[] args) {
        System.out.println("---Task_9---");

        int arrayLength = LoopsArraysDemo.getPositiveInteger("Input Positive Array Length ");
        int[] array = new int[arrayLength];

        for (int i = 0; i < arrayLength; ++i) {
            System.out.printf("Input array[%d] ", i);
            LoopsArraysDemo.checkInputInt(String.format("Array[%d] can be only Integer. Try again. Input array[%d] ", i, i));
            array[i] = LoopsArraysDemo.scanner.nextInt();
        }

        int numberWhichWillBeDeleted;
        do {
            numberWhichWillBeDeleted = LoopsArraysDemo.getIntegerFromZero("Input Index which will be deleted ");
        } while (numberWhichWillBeDeleted >= arrayLength);

        for (int i = 0; i < array.length; ++i) {
            if (i != array.length - 1) {
                System.out.printf("%d, ", array[i]);
            } else {
                System.out.printf("%d", array[i]);
            }
        }

        System.out.println();

        array = LoopsArraysDemo.removeIndexFromIntArray(array, numberWhichWillBeDeleted);

        for (int i = 0; i < array.length; ++i) {
            if (i != array.length - 1) {
                System.out.printf("%d, ", array[i]);
            } else {
                System.out.printf("%d", array[i]);
            }
        }

        System.out.println();
    }
}
