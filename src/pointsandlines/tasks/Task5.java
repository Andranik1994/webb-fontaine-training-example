package pointsandlines.tasks;

import pointsandlines.API;
import pointsandlines.Point;

public class Task5 {

    public static void main(String[] args) {

        System.out.println("---Can Be Drawn a Square With Given 4 Points---");

        // Input 4 point in which we will try drawn square
        System.out.println("Input other points");
        Point pointA = new Point();
        Point pointB = new Point();
        Point pointC = new Point();
        Point pointD = new Point();

        // Check Is The Given Point Belong To The Area
        API.isRealToDrawSquareWithGivenPoints(pointA, pointB, pointC, pointD);

    }

}
