package stringhomework;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Task8 {

    public static void main(String[] args) {
        System.out.println("---Task_8---");

        String word = StringDemo.scanner.nextLine();

        System.out.println(removeDuplicatedChars(word));
    }

    static String removeDuplicatedChars(String word) {
        return Arrays.stream(word.split("")).distinct().collect(Collectors.joining());
    }
}
