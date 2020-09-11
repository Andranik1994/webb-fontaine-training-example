package loopsarrays;

public class Task4 extends LoopsArraysDemo {

    public static void main(String[] args) {
        System.out.println("---Task_4---");

        int arrayLength = getPositiveInteger("Input Positive Array Length ");

        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; ++i) {
            System.out.printf("Input Array1[%d] ", i);
            checkInputInt(String.format("Array[%d] can be only Integer. Try again. Input array[%d] ", i, i));
            array[i] = scanner.nextInt();
        }

        int k = getPositiveInteger("Enter Positive K number ");

        int calculator;
        int[] finalArray = new int[0];



        for (int i = 0; i < array.length; ++i) {
            calculator = 0;
            for (int t = 0; t < array.length; ++t) {
                if (array[i] == array[t]) {
                    calculator += 1;
                }
                if (calculator > k) {
                    break;
                }
            }
            if (calculator == k) {
                finalArray = addUnicNumberToIntArray(finalArray, array[i]);
            }
        }

        if(finalArray.length>0) {
            for (int i = 0; i < finalArray.length; ++i) {
                System.out.printf("Number %d  occurs exactly %d times\n", finalArray[i], k);
            }
        } else {
            System.out.printf("There is no number which occurs  %d time\n", k);
        }


        System.out.println();
    }
}
