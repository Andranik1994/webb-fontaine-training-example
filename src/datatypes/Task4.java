package datatypes;

public class Task4 extends DataTypesDemo {

    public static void main(String[] args) {
        System.out.println("\n---Task_4---");
        System.out.print("Input a number: ");
        int number = scanner.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.println(number + " X " + i + " = " + number * i);
        }
        System.out.println();
    }
}
