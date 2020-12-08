package stringhomework;

public class Task5 {

    public static void main(String[] args) {
        System.out.println("---Task_5---");

        // Input
        String original = StringDemo.scanner.nextLine();

        // Input specified sequence
        String sequence = StringDemo.scanner.nextLine();

        // Create api object.
        StringDemo api = new StringDemo();

        // Call api checkContainSequence method.
        System.out.println(api.checkContainSequence(original, sequence));
    }
}
