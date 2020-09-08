package datatypes;

public class Task1 extends DataTypesDemo {

    public static void main(String[] args) {
        System.out.println("---Task_1---");
        System.out.print("Please enter temperature in Fahrenheit: ");
        double tF = scanner.nextDouble();
        System.out.printf("%.1f degree Fahrenheit is equal to %.1f in Celsius", tF, (tF - 32) * 5 / 9);
        System.out.println();
    }
}
