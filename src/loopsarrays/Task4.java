package loopsarrays;

public class Task4 {

    public static void main(String[] args) {
        System.out.println("---Task_4---");

        int arrayLength = LoopsArraysDemo.getPositiveInteger("Input Positive Array Length ");

        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; ++i) {
            System.out.printf("Input Array1[%d] ", i);
            LoopsArraysDemo.checkInputInt(String.format("Array[%d] can be only Integer. Try again. Input array[%d] ", i, i));
            array[i] = LoopsArraysDemo.scanner.nextInt();
        }

        int k = LoopsArraysDemo.getPositiveInteger("Enter Positive K number ");

        int calculator;
        int[] finalArray = new int[0];


        for (int i : array) {
            calculator = 0;
            for (int value : array) {
                if (i == value) {
                    calculator += 1;
                }
                if (calculator > k) {
                    break;
                }
            }
            if (calculator == k) {
                finalArray = LoopsArraysDemo.addUnicNumberToIntArray(finalArray, i);
            }
        }

        if (finalArray.length > 0) {
            for (int value : finalArray) {
                System.out.printf("Number %d  occurs exactly %d times\n", value, k);
            }
        } else {
            System.out.printf("There is no number which occurs  %d time\n", k);
        }


        System.out.println();
    }
}
