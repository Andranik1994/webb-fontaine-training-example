package stringhomework;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("---Task_1---");

        String word = StringDemo.scanner.next();

        int number = StringDemo.getIntegerFromZeroToTextLength(word, "Input Index which will be find in String ");

        System.out.println(word.charAt(number));

        System.out.println();
    }
}
