package stringhomework;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;


// TODO Don`t have a time for improve or add more tests.
public class StringDemo {
    static Scanner scanner = new Scanner(System.in);

    public static void checkInputInt(String warningMessage) {
        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.print(warningMessage);
                scanner.next();
                continue;
            }
            return;
        }
    }

    public static int getPositiveInteger(String message) {
        int length;
        do {
            System.out.print(message);
            checkInputInt("Number can be only Integer and Positive !!! Try again. ");
            length = scanner.nextInt();
        } while (length <= 0);
        return length;
    }

    // Method For Task1
    public String getCharAtIndex(String input, int index) {

        if (input == null || input.isEmpty()) {
            return Constants.OUT_OF_BOUNDS;
        }

        if (index < 0 || index >= input.length()) {
            return Constants.OUT_OF_BOUNDS;
        }

        return String.valueOf(input.charAt(index));
    }

    // Method For Task2
    public int calculateSequenceQuantity(String input) {
        int count = 0;
        char[] chars = new char[input.length()];

        for (int i = 0; i < input.length(); i++) {
            chars[i] = input.charAt(i);
            if (((chars[0] != ' ') && (i == 0)) || ((i > 0) && (chars[i] != ' ') && (chars[i - 1] == ' ')))
                count++;
        }

        return count;
    }

    // Method For Task3
    public String getReverse(String input) {

        if (input == null || input.isEmpty()) {
            return Constants.NO_SYMBOL;
        }

        StringBuilder stringBuilder = new StringBuilder(input);

        if (stringBuilder.toString().equals(stringBuilder.reverse().toString())) {
            return "Palindrome";
        } else return "Not a palindrome";

    }

    // Method For Task4
    public String checkParenthesis(String input) {
        int counter = 0;
        boolean flag;

        if (input == null || input.isEmpty()) {
            return Constants.NO_SYMBOL;
        }

        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) != '(' && input.charAt(i) != ')') {
                return Constants.STRANGE_SYMBOL;
            }

            if (input.charAt(i) == '(') {
                counter++;
            } else if (input.charAt(i) == ')') {
                counter--;
            }
        }

        flag = counter == 0;

        if (flag) {
            return "Valid";
        } else return "Invalid";
    }

    // Method For Task5
    public String checkContainSequence(String input, String sequence) {
        if (input == null || input.isEmpty()) {
            return Constants.NO_SYMBOL;
        }

        if (sequence == null || sequence.isEmpty()) {
            return Constants.NO_SYMBOL;
        }

        return String.valueOf(input.contains(sequence));
    }

    // Method For Task6
    public String checkStartsWith(String input, String value) {
        if (input == null || input.isEmpty()) {
            return Constants.NO_SYMBOL;
        }

        if (value == null || value.isEmpty()) {
            return Constants.NO_SYMBOL;
        }

        return String.valueOf(input.startsWith(value));
    }

    // Method For Task7
    public String checkEndsWith(String input, String value) {
        if (input == null || input.isEmpty()) {
            return Constants.NO_SYMBOL;
        }

        if (value == null || value.isEmpty()) {
            return Constants.NO_SYMBOL;
        }

        return String.valueOf(input.endsWith(value));
    }

    // Method For Task8
    public String removeDuplicatedChars(String input) {
        if (input == null || input.isEmpty()) {
            return Constants.NO_SYMBOL;
        }
        return Arrays.stream(input.split("")).distinct().collect(Collectors.joining());
    }

    // Method For Task9
    public String[] splitStringInEqualParts(String word, int pathQuantity) {

        if (word == null || word.isEmpty()) {
            return null;
        }

        if (pathQuantity < 0 || pathQuantity > word.length() / 2) {
            return null;
        }

        if (word.length() % pathQuantity != 0) {
            return null;
        }

        int partLength = word.length() / pathQuantity;
        String[] parts = new String[pathQuantity];
        int index = 0;
        for (int i = 0; i < word.length(); i += partLength) {
            parts[index] = word.substring(i, i + partLength);
            index++;
        }

        return parts;
    }

    // Method For Task10
    public String reverse(String word) {

        if (word == null || word.isEmpty()) {
            return word;
        }

        return reverse(word.substring(1)) + word.charAt(0);
    }

}
