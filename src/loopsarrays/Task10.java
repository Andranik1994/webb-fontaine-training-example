package loopsarrays;

public class Task10 {

    public static void main(String[] args) {
        System.out.println("---Task_10---");

        int number = LoopsArraysDemo.getPositiveInteger("Input Positive number ");

        while (number > 0) {
            System.out.printf("Write number, you have %d try : ", number);
            if (LoopsArraysDemo.scanner.next().equals("-1")) {
                System.out.println("YOU WIN !!! :D");
                break;
            }
            --number;
            if (number == 0) {
                System.out.println("YOU LOOS !!! :(");
            }
        }

        System.out.println();
    }
}
