package stringhomework;

public class Task4 {

    public static void main(String[] args) {
        System.out.println("---Task_4---");

        String sequence = StringDemo.scanner.nextLine();

        System.out.println(checkParenthesis(sequence));

        System.out.println();
    }

    static boolean checkParenthesis(String word) {
        int counter = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '(') {
                counter++;
            } else if (word.charAt(i) == ')') {
                counter--;
            } else {
                return false;
            }
        }
        return counter == 0;
    }
}
