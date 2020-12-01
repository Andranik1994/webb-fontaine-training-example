package stringhomework;

public class Task3 {

    public static void main(String[] args) {
        System.out.println("---Task_3---");

        // Input
        String word = StringDemo.scanner.nextLine();

        // Create api object.
        StringDemo api = new StringDemo();

        // Call api getReverse method.
        System.out.println(api.getReverse(word));
    }
}
