package pointsandlines.tasks;

import pointsandlines.API;
import pointsandlines.Constants;
import pointsandlines.HomeworkHelper;
import pointsandlines.Point;

public class Task2 {
    public static void main(String[] args) {

        System.out.println("---Middle Point---");

        // Input Point 1
        Point point1 = new Point();

        // Input Point 2
        Point point2 = new Point();

        // Print Middle Point using API with Points method
        Point middlePoint = API.getMiddlePoint(point1, point2);
        System.out.printf("Middle Point is: %s \n", middlePoint);

        // Print Middle Point using API with Points method
        System.out.print("Input x1 coordinate: ");
        Double x1 = HomeworkHelper.inputDouble(Constants.INPUT_DOUBLE_WARNING);
        System.out.print("Input y1 coordinate: ");
        Double y1 = HomeworkHelper.inputDouble(Constants.INPUT_DOUBLE_WARNING);
        System.out.print("Input x2 coordinate: ");
        Double x2 = HomeworkHelper.inputDouble(Constants.INPUT_DOUBLE_WARNING);
        System.out.print("Input y2 coordinate: ");
        Double y2 = HomeworkHelper.inputDouble(Constants.INPUT_DOUBLE_WARNING);
        Point middlePoint2 = API.getMiddlePoint(x1, y1, x2, y2);
        System.out.printf("Middle Point is: %s \n", middlePoint2);

    }
}
