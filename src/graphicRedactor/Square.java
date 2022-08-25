package graphicRedactor;

public class Square extends nGon {

    private static final int angle = 45;
    private double sideSize;

    public void setSideSize(double sideSize) {
        this.sideSize = sideSize;
    }

    public double getSideSize() {
        return sideSize;
    }

    public int getAngle() {
        return angle;
    }

    @Override
    public String getShapeName() {
        return "Shape name is Square";
    }

    @Override
    public int getCountOfSides() {
        return 4;
    }

    @Override
    public int getCountOfAngles() {
        return 4;
    }
}
