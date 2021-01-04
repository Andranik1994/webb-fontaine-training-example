package pointsandlines.tasks;

import pointsandlines.API;
import pointsandlines.Point;

public class Task3 {

    public static void main(String[] args) {

        System.out.println("---Is Given Point Belongs To The Area---");

        //Input point which you will find
        System.out.println("Input point which you will find");
        Point mainPoint = new Point();

        // Input 3 point in which we will find yours
        System.out.println("Input other points");
        Point pointA = new Point();
        Point pointB = new Point();
        Point pointC = new Point();

        // Check Is The Given Point Belong To The Area
        API.isTheGivenPointBelongToTheArea(mainPoint, pointA, pointB, pointC);

        //Input point which you will find
        System.out.println("Input point which you will find");
        Point mainPoint2 = new Point();

        // Input 4 point in which we will find yours
        System.out.println("Input other points");
        Point pointQ = new Point();
        Point pointW = new Point();
        Point pointE = new Point();
        Point pointR = new Point();


        // Check Is The Given Point Belong To The Area
        API.isTheGivenPointBelongToTheArea(mainPoint2, pointQ, pointW, pointE, pointR);

    }
}
