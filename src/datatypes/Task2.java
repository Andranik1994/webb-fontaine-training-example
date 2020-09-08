package datatypes;

public class Task2 extends DataTypesDemo {

    public static void main(String[] args) {
        System.out.println("\n---Task_2---");
        System.out.print("Input a value for inch: ");
        double inch = scanner.nextDouble();
        System.out.printf("%.1f inch is %.1f meters", inch, inch * 0.0254);
        System.out.println();
    }
}
