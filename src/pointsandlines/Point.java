package pointsandlines;

import java.util.Scanner;

public class Point {

    private String pointName;
    private Double x;
    private Double y;

    public Point(String pointName, Double x, Double y) {

        if (pointName == null || pointName.isEmpty() || pointName.length() > 3 || !HomeworkHelper.isStringUpperCase(pointName)) {
            System.out.print(Constants.INPUT_POINT_NAME_FORMAT_WARNING);
            return;
        }

        this.pointName = pointName;
        this.x = x;
        this.y = y;
        System.out.printf("%s is created \n", this.toString());
    }

    public Point() {

        String pointName = inputPointName();

        System.out.printf("Input %s x coordinate: ", pointName);
        Double pointX = HomeworkHelper.inputDouble(Constants.INPUT_DOUBLE_WARNING);

        System.out.printf("Input %s y coordinate: ", pointName);
        Double pointY = HomeworkHelper.inputDouble(Constants.INPUT_DOUBLE_WARNING);

        this.pointName = pointName;
        this.x = pointX;
        this.y = pointY;
        System.out.printf("%s is created \n", this.toString());
    }

    public String getPointName() {
        return pointName;
    }

    public double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public static String inputPointName() {
        System.out.print("Input point name: ");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String name = scanner.next();
            if (name == null || name.isEmpty() || name.length() > 3 || !HomeworkHelper.isStringUpperCase(name)) {
                System.out.print(Constants.INPUT_POINT_NAME_FORMAT_WARNING);
                continue;
            }
            return name;
        }
    }

    @Override
    public String toString() {
        return String.format("%s = ( %.2f, %.2f )", pointName, x, y);
    }
}
