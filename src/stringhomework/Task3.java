package stringhomework;

public class Task3 {

    public static void main(String[] args) {
        System.out.println("---Task_3---");

        StringBuilder stringBuilder = new StringBuilder(StringDemo.scanner.nextLine());

        System.out.println(stringBuilder.toString().equals(stringBuilder.reverse().toString()));
    }
}
