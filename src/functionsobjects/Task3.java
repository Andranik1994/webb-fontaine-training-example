package functionsobjects;

public class Task3 {

    public static void main(String[] args) {
        System.out.println("---Task_3---");

        //  Create array for triangle sides
        double[] triangleSidesArray = new double[3];

        //  Input triangle sides
        FunctionsObjects.inputDoubleArray(triangleSidesArray, "Side");

        //  Calculate and print triangle area
        double area = calculateTriangleArea(triangleSidesArray);

        System.out.println();
    }

    // Method which calculate and return triangle area. return 0 if there is no such type of triangle.
    static double calculateTriangleArea(double... triangleSide) {
        //  Check input data
        if (triangleSide.length != 3) {
            System.out.println("Triangle must have 3 side. Input Triangle sides Again !");
            return 0;
        } else {
            //  Calculation
            double p = 0;
            for (double i : triangleSide) {
                p = p + i / 2;
            }
            //  Check that triangle is real
            if (triangleSide[0] < p && triangleSide[1] < p && triangleSide[2] < p) {
                double area = Math.sqrt(p * (p - triangleSide[0]) * (p - triangleSide[1]) * (p - triangleSide[2]));
                System.out.println("The area of the triangle is " + area);
                return area;
            } else {
                System.out.println("No such Type of Triangle. Input Triangle sides Again !");
                return 0;
            }
        }

    }

}
