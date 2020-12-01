package stringhomework;

public class Task2 {

    public static void main(String[] args) {
        System.out.println("---Task_2---");

        // Input
        String word = StringDemo.scanner.nextLine();

        // Create api object.
        StringDemo api = new StringDemo();

        // Call api getCharAtIndex method.
        System.out.println(api.calculateSequenceQuantity(word));
    }
}
