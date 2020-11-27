package stringhomework;

public class Task2 {

    public static void main(String[] args) {
        System.out.println("---Task_2---");

        String word = StringDemo.scanner.nextLine();

        System.out.println(calculateSequenceQuantity(word));
    }

    static int calculateSequenceQuantity(String word) {
        int count = 0;

        char[] chars = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            chars[i] = word.charAt(i);
            if (((chars[0] != ' ') && (i == 0)) || ((i > 0) && (chars[i] != ' ') && (chars[i - 1] == ' ')))
                count++;
        }
        return count;
    }
}
