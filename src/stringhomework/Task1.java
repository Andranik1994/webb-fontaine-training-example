package stringhomework;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("---Task_1---");

        // Input word
        String word = StringDemo.scanner.next();

        // Input index
        int index = StringDemo.getPositiveInteger("Input Index which will be find in String ");

        // Create api object.
        StringDemo api = new StringDemo();

        // Call api getCharAtIndex method.
        System.out.println(api.getCharAtIndex(word, index));
    }
}
