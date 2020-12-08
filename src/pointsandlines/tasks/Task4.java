package pointsandlines.tasks;

import pointsandlines.API;
import pointsandlines.Line;
import pointsandlines.Point;

public class Task4 {
    public static void main(String[] args) {

        System.out.println("---Is Given Point Belongs To The Area---");

        //Input line
        System.out.println("Input line parameters");
        Line line = new Line();

        //Input point which we will check
        Point point = new Point();

        // Check Is The Given Point Is In The Line
        API.isPointInTheLine(point, line);
    }
}
