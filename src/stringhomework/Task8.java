package stringhomework;

public class Task8 {

    public static void main(String[] args) {
        System.out.println("---Task_8---");

        // Input
        String word = StringDemo.scanner.nextLine();

        // Create api object.
        StringDemo api = new StringDemo();

        // Call api removeDuplicatedChars method.
        System.out.println(api.removeDuplicatedChars(word));
    }
}
