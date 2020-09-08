package datatypes;

public class Task3 extends DataTypesDemo {

    public static void main(String[] args) {
        System.out.println("\n---Task_3---");
        System.out.print("Input your weight: ");
        float myWeight = scanner.nextFloat();
        System.out.printf("Your weight on the Moon is = %.1f", myWeight * 0.17);
        System.out.println();
    }
}
