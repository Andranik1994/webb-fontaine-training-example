package datatypes;

import java.util.Scanner;

public class DataTypesDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*---Task_1---*/
        System.out.println("---Task_1---");
        System.out.print("Please enter temperature in Fahrenheit: ");
        double tF = scanner.nextDouble();
        System.out.printf("%.1f degree Fahrenheit is equal to %.1f in Celsius", tF, (tF - 32) * 5 / 9);
        System.out.println();

        /*---Task_2---*/
        System.out.println("\n---Task_2---");
        System.out.print("Input a value for inch: ");
        double inch = scanner.nextDouble();
        System.out.printf("%.1f inch is %.1f meters", inch, inch * 0.0254);
        System.out.println();

        /*---Task_3---*/
        System.out.println("\n---Task_3---");
        System.out.print("Input your weight: ");
        float myWeight = scanner.nextFloat();
        System.out.printf("Your weight on the Moon is = %.1f", myWeight * 0.17);
        System.out.println();

        /*---Task_4---*/
        System.out.println("\n---Task_4---");
        System.out.print("Input a number: ");
        int number = scanner.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.println(number + " X " + i + " = " + number * i);
        }
        System.out.println();

        /*---Task_5---*/
        System.out.println("\n---Task_5---");
        System.out.print("Input a first number: ");
        int fNum = scanner.nextInt();
        System.out.print("Input a second number: ");
        int sNum = scanner.nextInt();
        System.out.print("Input math operation: ");
        char operation = scanner.next().charAt(0);
        switch (operation) {
            case '+':
                System.out.printf("%d %s %d = %d", fNum, operation, sNum, fNum + sNum);
                break;
            case '-':
                System.out.printf("%d %s %d = %d", fNum, operation, sNum, fNum - sNum);
                break;
            case '*':
                System.out.printf("%d %s %d = %d", fNum, operation, sNum, fNum * sNum);
                break;
            case '/':
                float answer = (float) fNum / sNum;
                System.out.printf("%d %s %d = %.2f", fNum, operation, sNum, answer);
                break;
            case '%':
                System.out.printf("%d %s %d = %d", fNum, operation, sNum, fNum % sNum);
                break;
            default:
                System.out.println("There is no '" + operation + "' operation.");
                break;
        }
        System.out.println();

        /*---Task_6---*/
        System.out.println("\n---Task_6---");
        System.out.print("Input a first city X coordinate: ");
        double x1 = scanner.nextDouble();
        System.out.print("Input a first city X coordinate: ");
        double y1 = scanner.nextDouble();
        System.out.print("Input a first city Z coordinate: ");
        double z1 = scanner.nextDouble();
        System.out.println("---------------------------------");
        System.out.print("Input a second city X coordinate: ");
        double x2 = scanner.nextDouble();
        System.out.print("Input a second city X coordinate: ");
        double y2 = scanner.nextDouble();
        System.out.print("Input a second city Z coordinate: ");
        double z2 = scanner.nextDouble();
        float distance = (float) Math.pow((Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2) + Math.pow(z1 - z2, 2)), 0.5);
        System.out.println("The distance between 2 cities = " + distance);
        double mPointX = (x1 + x2) / 2;
        double mPointY = (y1 + y2) / 2;
        double mPointZ = (z1 + z2) / 2;
        System.out.println("The middle point between 2 cities is ( " + mPointX + ", " + mPointY + ", " + mPointZ + " )");
        System.out.println();

        /*---Task_7---*/
        System.out.println("\n---Task_7---");
        System.out.print("Input first number: ");
        int firstNum = scanner.nextInt();
        System.out.print("Input second number: ");
        int secondNum = scanner.nextInt();
        System.out.print("Input 3th number: ");
        int thirdNum = scanner.nextInt();
        int max;
        if (firstNum >= secondNum) {
            if (firstNum >= thirdNum) {
                max = firstNum;
            } else {
                max = thirdNum;
            }
        } else {
            if (secondNum >= thirdNum) {
                max = secondNum;
            } else {
                max = thirdNum;
            }
        }
        System.out.println("The greatest: " + max);
        System.out.println();

        /*---Task_8---*/
        System.out.println("\n---Task_8---");
        System.out.print("Input a number: ");
        float givenNumber = scanner.nextFloat();
        if (givenNumber >= 1000000) {
            System.out.println("large");
        } else if (givenNumber < 1 && givenNumber > 0) {
            System.out.println("small");
        } else if (givenNumber == 0) {
            System.out.println("zero");
        } else if (givenNumber < 0) {
            System.out.println("negative");
        } else {
            System.out.println("positive");
        }
        System.out.println();

        /*---Task_9---*/
        System.out.println("\n---Task_9---");
        System.out.print("Input number between 1 and 7: ");
        short dayNum = scanner.nextShort();
        switch (dayNum) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            case 0:
                System.out.println("God did not know programming");
                break;
            default:
                System.out.println("Week has only 7 days");
                break;
        }
        System.out.println();

        /*---Task_10---*/
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
            System.out.println("https://en.wikipedia.org/wiki/Parity_of_zero");
        }
        System.out.println("bye!");

    }

}
