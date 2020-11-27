package stringhomework;

import loopsarrays.LoopsArraysDemo;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Task9 {

    public static void main(String[] args) {
        System.out.println("---Task_9---");

        String word = StringDemo.scanner.nextLine();
        bla(word,4);

        int pathQuantity = StringDemo.getPositiveInteger("Input Positive Path Quantity ");
        splitStringInEqualParts(word, pathQuantity);
        System.out.println();
    }
    static void splitStringInEqualParts(String word, int pathQuantity) {
        if (word.length() % pathQuantity == 0) {
            char[][] dividedStrings = new char[pathQuantity][word.length() / pathQuantity];
            for (int i = 0; i < pathQuantity; i++) {
                for (int j = 0; j < word.length() / pathQuantity; j++) {
                    int charNum = (word.length() / pathQuantity * i + j);
                    dividedStrings[i][j] = word.charAt(charNum);
                }
            }
            for (int i = 0; i < pathQuantity; i++) {
                for (int j = 0; j < word.length() / pathQuantity; j++) {
                    System.out.print(dividedStrings[i][j]);
                }
                System.out.println();
            }
        } else {
            System.out.println("Error!");
        }
    }

    static void bla(String word, int pathQuantity) {
        if (word.length() % pathQuantity == 0) {
            int partLength = word.length() / pathQuantity;
            for (int i = 0; i < pathQuantity; i++) {
               String[] blabla = word.split(word.substring(partLength));
                word = word.replace(word.substring(0, partLength),"");
                System.out.println(Arrays.toString(blabla));
            }
        } else {
            System.out.println("Error!");
        }
    }
}
