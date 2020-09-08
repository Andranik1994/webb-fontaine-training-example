package datatypes;

public class Task7 extends DataTypesDemo {

    public static void main(String[] args) {
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
    }
}
