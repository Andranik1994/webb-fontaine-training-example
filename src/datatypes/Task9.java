package datatypes;

public class Task9 extends DataTypesDemo {

    public static void main(String[] args) {
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
    }
}
