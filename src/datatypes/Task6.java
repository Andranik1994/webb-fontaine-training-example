package datatypes;

public class Task6 extends DataTypesDemo {

    public static void main(String[] args) {
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
        float distance = (float) Math.sqrt((Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2) + Math.pow(z1 - z2, 2)));
        System.out.println("The distance between 2 cities = " + distance);
        double mPointX = (x1 + x2) / 2;
        double mPointY = (y1 + y2) / 2;
        double mPointZ = (z1 + z2) / 2;
        System.out.println("The middle point between 2 cities is ( " + mPointX + ", " + mPointY + ", " + mPointZ + " )");
        System.out.println();
    }
}
