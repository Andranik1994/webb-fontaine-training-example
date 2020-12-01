package stringhomework;

public class Task6 {

    public static void main(String[] args) {
        System.out.println("---Task_6---");

        // Input
        String original = StringDemo.scanner.nextLine();

        // Input specified value
        String values = StringDemo.scanner.nextLine();

        // Create api object.
        StringDemo api = new StringDemo();

        // Call api checkStartsWith method.
        System.out.println(api.checkStartsWith(original, values));
    }
}
