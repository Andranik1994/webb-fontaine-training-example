package pointsandlines;

public class API {

    /**
     * @param point1 is first point
     * @param point2 is the second point
     * @return Distance
     */
    public static Double getDistance(Point point1, Point point2) {
        if (point1 == null || point2 == null) {
            return null;
        }
        return Math.sqrt(Math.pow((point2.getX() - point1.getX()), 2) + Math.pow((point2.getY() - point1.getY()), 2));
    }

    /**
     * @param point1 is first point
     * @param point2 is the second point
     * @return middle Point of two Points
     */
    public static Point getMiddlePoint(Point point1, Point point2) {
        if (point1 == null || point2 == null) {
            return null;
        }
        return new Point(Point.inputPointName(), (point1.getX() + point2.getX()) / 2, (point1.getY() + point2.getY()) / 2);
    }

    /**
     * @param x1 X1 coordinate
     * @param y1 Y1 coordinate
     * @param x2 X2 coordinate
     * @param y2 XY coordinate
     * @return middle Point of your coordinates
     */
    public static Point getMiddlePoint(Double x1, Double y1, Double x2, Double y2) {
        return new Point(Point.inputPointName(), (x1 + x2) / 2, (y1 + y2) / 2);
    }

    /**
     * @param points points
     * @return area
     */
    private static Double calculateArea(Point... points) {
        if (points.length < 3) {
            return null;
        }

        if (points.length > 4) {
            System.out.println(Constants.VERY_HARD_MATH_WARNING);
            return null;
        }

        if (points.length == 3) {
            return Math.abs((points[0].getX() * (points[1].getY() - points[2].getY()) +
                    points[1].getX() * (points[2].getY() - points[0].getY()) +
                    points[2].getX() * (points[0].getY() - points[1].getY())) / 2.0);

        }

        return Math.abs(((points[0].getX() * points[1].getY() - points[1].getX() * points[0].getY()) +
                (points[1].getX() * points[2].getY() - points[2].getX() * points[1].getY()) +
                (points[2].getX() * points[3].getY() - points[3].getX() * points[2].getY()) +
                (points[3].getX() * points[0].getY() - points[0].getX() * points[3].getY())) / 2);
    }

    /**
     * @param mainPoint point which you find
     * @param points    points
     * @return is The Given Point Belong To The Area
     */
    private static Boolean checkTheGivenPointBelongToTheAreaCalculation(Point mainPoint, Point... points) {
        if (points.length < 3) {
            return null;
        }

        if (points.length > 4) {
            System.out.println(Constants.VERY_HARD_MATH_WARNING);
            return null;
        }

        if (points.length == 3) {
            Double a = calculateArea(points[0], points[1], points[2]);
            Double b = calculateArea(mainPoint, points[1], points[2]);
            Double c = calculateArea(points[0], mainPoint, points[2]);
            Double d = calculateArea(points[0], points[1], mainPoint);
            if (a != null && b != null && c != null && d != null) {
                return a == b + c + d;
            } else {
                System.out.println(Constants.SOMETHING_WENT_WRONG);
                return null;
            }
        }

        Double a = calculateArea(points[0], points[1], points[2], points[3]);
        Double b = calculateArea(points[0], mainPoint, points[1]);
        Double c = calculateArea(points[1], mainPoint, points[2]);
        Double d = calculateArea(points[2], mainPoint, points[3]);
        Double e = calculateArea(points[3], mainPoint, points[0]);
        if (a != null && b != null && c != null && d != null && e != null) {
            return a.equals(b + c + d + e);
        } else {
            System.out.println(Constants.SOMETHING_WENT_WRONG);
            return null;
        }
    }

    /**
     * @param mainPoint point which you find
     * @param points    points
     */
    public static void isTheGivenPointBelongToTheArea(Point mainPoint, Point... points) {
        Boolean flag = checkTheGivenPointBelongToTheAreaCalculation(mainPoint, points);

        if (flag == null) {
            System.out.println(Constants.SOMETHING_WENT_WRONG);
            return;
        }

        if (flag) {
            System.out.print("Inside");
        } else System.out.print("Outside");
    }

    /**
     * @param point point which we will check
     * @param line  line
     * @return is Point In The Line
     */
    private static Boolean checkPointInTheLine(Point point, Line line) {
        if (point == null) {
            System.out.println(Constants.SOMETHING_WENT_WRONG);
            return null;
        }

        if (line == null) {
            System.out.println(Constants.SOMETHING_WENT_WRONG);
            return null;
        }

        return point.getY() == line.getM() * point.getX() + line.getB();
    }

    /**
     * @param point point
     * @param line  line
     */
    public static void isPointInTheLine(Point point, Line line) {
        Boolean flag = checkPointInTheLine(point, line);

        if (flag == null) {
            System.out.println(Constants.SOMETHING_WENT_WRONG);
            return;
        }

        if (flag) {
            System.out.print("In");
        } else System.out.print("Out");
    }

    /**
     * @param point1 point number 1
     * @param point2 point number 2
     * @param point3 point number 3
     * @param point4 point number 4
     * @return can Be Drawn Square With Given Points
     */
    private static Boolean canBeDrawnSquareWithGivenPoints(Point point1, Point point2, Point point3, Point point4) {
        if (point1 == null || point2 == null || point3 == null || point4 == null) {
            System.out.println(Constants.SOMETHING_WENT_WRONG);
            return null;
        }

        Double distance2 = getDistance(point1, point2);
        Double distance3 = getDistance(point1, point3);
        Double distance4 = getDistance(point1, point4);

        if (distance2 == 0 || distance3 == 0 || distance4 == 0) {
            return false;
        }

        if (distance2.equals(distance3) && Math.sqrt(2) * distance2 == distance4 && Math.sqrt(2) * getDistance(point2, point4) == getDistance(point2, point3)) {
            return true;
        }

        if (distance3.equals(distance4) && Math.sqrt(2) * distance3 == distance2 && 2 * getDistance(point3, point2) == getDistance(point3, point4)) {
            return true;
        }
        return distance2.equals(distance4) && Math.sqrt(2) * distance2 == distance3 && Math.sqrt(2) * getDistance(point2, point3) == getDistance(point2, point4);
    }

    /**
     *
     * @param point1 point number 1
     * @param point2 point number 2
     * @param point3 point number 3
     * @param point4 point number 4
     */
    public static void isRealToDrawSquareWithGivenPoints(Point point1, Point point2, Point point3, Point point4) {
        Boolean flag = canBeDrawnSquareWithGivenPoints(point1, point2, point3, point4);

        if (flag == null) {
            System.out.println(Constants.SOMETHING_WENT_WRONG);
            return;
        }

        if (flag) {
            System.out.print("Yes");
        } else System.out.print("No");
    }
}
