package datatypes;

public class Task10 extends DataTypesDemo {

    public static void main(String[] args) {
        System.out.println("\n---Task_10---");
        System.out.print("Input a number: ");
        int someNumber = scanner.nextInt();
        if (someNumber != 0) {
            if (someNumber % 2 == 0) {
                System.out.println("Even Number");
            } else {
                System.out.println("Odd Number");
            }
        } else {
            System.out.println("https://en.wikipedia.org/wiki/Parity_of_zero");
        }
        System.out.println("bye!");
    }
}
