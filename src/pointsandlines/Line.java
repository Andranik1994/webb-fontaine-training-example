package pointsandlines;

import java.util.Scanner;

public class Line {


    private String lineName;
    private Double m;
    private Double b;

    public Line() {
        String lineName = inputLineName();

        System.out.printf("Input line m parameter: %s", lineName);
        Double m = HomeworkHelper.inputDouble(Constants.INPUT_DOUBLE_WARNING);

        System.out.printf("Input line b parameter: %s", lineName);
        Double b = HomeworkHelper.inputDouble(Constants.INPUT_DOUBLE_WARNING);

        this.lineName = lineName;
        this.m = m;
        this.b = b;
        System.out.printf("%s is created \n", this.toString());
    }

    public Line(String lineName, Double m, Double b) {
        if (lineName == null || lineName.isEmpty() || lineName.length() > 2 || !HomeworkHelper.isStringUpperCase(lineName)) {
            System.out.print(Constants.INPUT_LINE_NAME_FORMAT_WARNING);
            return;
        }
        this.lineName = lineName;
        this.m = m;
        this.b = b;
    }

    public String getLineName() {
        return lineName;
    }

    public Double getM() {
        return m;
    }

    public void setM(Double m) {
        this.m = m;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public static String inputLineName() {
        System.out.print("Input line name: ");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String name = scanner.next();
            if (name == null || name.isEmpty() || name.length() > 2 || !HomeworkHelper.isStringUpperCase(name)) {
                System.out.print(Constants.INPUT_LINE_NAME_FORMAT_WARNING);
                continue;
            }
            return name;
        }
    }


    @Override
    public String toString() {
        return String.format("%s is y=%.2fx+%.2f", lineName, m, b);
    }
}
