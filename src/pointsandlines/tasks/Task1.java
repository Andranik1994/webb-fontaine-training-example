package pointsandlines.tasks;

import pointsandlines.API;
import pointsandlines.Point;

public class Task1 {

    public static void main(String[] args) {

        System.out.println("---Distance---");

        // Input Point 1
        Point point1 = new Point();

        // Input Point 2
        Point point2 = new Point();

        // Print Distance using API
        Double distance = API.getDistance(point1, point2);
        System.out.printf("Distance Between Two Points = %.2f \n", distance);






    }
}
