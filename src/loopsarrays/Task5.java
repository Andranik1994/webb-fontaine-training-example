package loopsarrays;

public class Task5 extends LoopsArraysDemo {

    public static void main(String[] args) {
        System.out.println("---Task_5---");

        int k = getPositiveInteger("Enter Positive K number ");

        int[] array = new int[0];

        System.out.println(k);

        while (k != 0) {
            array = addNumberToBeginningOfIntArray(array, k % 10);
            k = k / 10;
        }

        for (int i = 0; i < array.length; ++i) {
            if (i != array.length-1) {
                System.out.printf("%d, ", array[i]);
            } else {
                System.out.printf("%d", array[i]);
            }
        }

        System.out.println();
    }
}
