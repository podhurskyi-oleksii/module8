package module8;

public class Square implements nGon {

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
        return "Square";
    }

    @Override
    public double getSize() {
        return 112.34d;
    }

    @Override
    public String getColor() {
        return "Blue";
    }

    @Override
    public int getSides() {
        return 4;
    }

    @Override
    public int getCountOfAngles() {
        return 4;
    }

    @Override
    public String toString() {
        return "Shape name - " + getShapeName()
                + ", color - " + getColor()
                + ", size - " + getSize();
    }
}
