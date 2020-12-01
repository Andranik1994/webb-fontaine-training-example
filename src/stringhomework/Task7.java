package stringhomework;

public class Task7 {

    public static void main(String[] args) {
        System.out.println("---Task_7---");

        // Input
        String original = StringDemo.scanner.nextLine();

        // Input specified value
        String values = StringDemo.scanner.nextLine();

        // Create api object.
        StringDemo api = new StringDemo();

        // Call api checkEndsWith method.
        System.out.println(api.checkEndsWith(original, values));
    }
}
