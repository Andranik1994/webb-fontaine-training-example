package stringhomework;

public class Task9 {

    public static void main(String[] args) {
        System.out.println("---Task_9---");

        // Input
        String word = StringDemo.scanner.nextLine();

        // Input path quantity
        int pathQuantity = StringDemo.getPositiveInteger("Input Positive Path Quantity ");

        // Create api object.
        StringDemo api = new StringDemo();

       // Create paths
        String[] parts = api.splitStringInEqualParts(word, pathQuantity);

        // Print Paths
        for (String part : parts) {
            System.out.println(part);
        }

        System.out.println();
    }


}
