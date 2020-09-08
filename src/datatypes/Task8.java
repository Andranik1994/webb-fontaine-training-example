package datatypes;

public class Task8 extends DataTypesDemo {

    public static void main(String[] args) {
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
    }
}
