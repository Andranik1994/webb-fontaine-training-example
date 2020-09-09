package datatypes;

public class Task5 extends DataTypesDemo {

    public static void main(String[] args) {
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
                if (sNum != 0) {
                    float answer = (float) fNum / sNum;
                    System.out.printf("%d %s %d = %.2f", fNum, operation, sNum, answer);
                } else {
                    System.out.println("Can not dividing by 0");
                }
                break;
            case '%':
                System.out.printf("%d %s %d = %d", fNum, operation, sNum, fNum % sNum);
                break;
            default:
                System.out.println("There is no '" + operation + "' operation.");
                break;
        }
        System.out.println();
    }
}
