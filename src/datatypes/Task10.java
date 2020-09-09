package datatypes;

import java.awt.*;
import java.io.IOException;
import java.net.URI;

public class Task10 extends DataTypesDemo {

    public static void main(String[] args) {
        System.out.println("\n---Task_10---");
        System.out.print("Input a number: ");
        int someNumber = scanner.nextInt();
        if (someNumber != 0) {
            if (someNumber % 2 == 0) {
                System.out.println("Even Number");
            } else {
                System.out.println("Odd Number");
            }
        } else {
            Desktop desktop = java.awt.Desktop.getDesktop();
            try {
                desktop.browse(URI.create("https://en.wikipedia.org/wiki/Parity_of_zero"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("bye!");
    }
}
