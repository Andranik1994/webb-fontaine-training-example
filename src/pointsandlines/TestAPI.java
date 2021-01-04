package pointsandlines;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestAPI {

    // TODO I try :D
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Test
    public void testGetDistance() {
        Point point1 = new Point("ABS", 2.0, 3.0);
        Point point2 = new Point("ABS", 2.0, 4.0);
        Double result = API.getDistance(point1, point2);
        assert result == 1.0;

        point1 = null;
        result = API.getDistance(point1, point2);
        Assert.assertNull(result);

        point1 = point2;
        point2 = null;
        result = API.getDistance(point1, point2);
        Assert.assertNull(result);

        point1 = null;
        result = API.getDistance(point1, point2);
        Assert.assertNull(result);
    }

    @Test
    public void testCheckTheGivenPointBelongToTheAreaCalculation() {

        Point middlePoint = new Point("ABF", 0.5, 0.5);

        Point point1 = new Point("ABA", 0.0, 0.0);
        Point point2 = new Point("ABB", 0.0, 1.0);
        Point point3 = new Point("ABC", 1.0, 1.0);
        Point point4 = new Point("ABD", 1.0, 0.0);

    }

}
