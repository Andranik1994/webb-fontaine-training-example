package stringhomework;

public class Task4 {

    public static void main(String[] args) {
        System.out.println("---Task_4---");

        // Input
        String sequence = StringDemo.scanner.nextLine();

        // Create api object.
        StringDemo api = new StringDemo();

        // Call api checkParenthesis method.
        System.out.println(api.checkParenthesis(sequence));
    }

}
