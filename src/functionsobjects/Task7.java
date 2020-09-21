package functionsobjects;

public class Task7 {

    public static void main(String[] args) {
        System.out.println("---Task_7---");

        //  Input number
        int number = FunctionsObjects.getIntegerFromZero("Input number ");

        // Call method which give Factorial of number
        long factorial = getFactorial(number);

        // Print factorial of given number
        System.out.println("The Factorial of given number is = " + factorial);

        System.out.println();
    }

    // Method which Calculate Factorial of number
    static long getFactorial(int number) {
        if (number == 0) {
            return 1;
        }
        return getFactorial(number - 1) * number;
    }

}
