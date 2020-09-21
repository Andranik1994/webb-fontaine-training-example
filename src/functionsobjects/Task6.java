package functionsobjects;

public class Task6 {

    public static void main(String[] args) {
        System.out.println("---Task_6---");

        //  Input Fibonacci number at Index
        int index = FunctionsObjects.getIntegerFromZero("Input index  and get Fibonacci value at that index ");

        // Call method which give you Fibonacci number with that index
        long number = getFibonacciAtIndex(index);

        //  Print Fibonacci number at given index
        System.out.println(number);

        System.out.println();
    }

    // Method which give you fibonacci number at index
    static long getFibonacciAtIndex(int index) {
        if (index <= 1) {
            return index;
        } else {
            return getFibonacciAtIndex(index - 1) + getFibonacciAtIndex(index - 2);
        }
    }
}
