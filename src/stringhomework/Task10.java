package stringhomework;

public class Task10 {

    public static void main(String[] args) {
        System.out.println("---Task_10---");

        // Input
        String word = StringDemo.scanner.nextLine();

        // Create api object.
        StringDemo api = new StringDemo();

        // Call api reverse method.
        System.out.println(api.reverse(word));
    }


}
