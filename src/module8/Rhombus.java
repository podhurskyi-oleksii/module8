package module8;

public class Rhombus implements nGon {

    private double sideSize;
    private double smallDiagonal;
    private double bigDiagonal;

    public double getSideSize() {
        return sideSize;
    }

    public void setSideSize(double sideSize) {
        this.sideSize = sideSize;
    }

    public double getSmallDiagonal() {
        return smallDiagonal;
    }

    public void setSmallDiagonal(double smallDiagonal) {
        this.smallDiagonal = smallDiagonal;
    }

    public double getBigDiagonal() {
        return bigDiagonal;
    }

    public void setBigDiagonal(double bigDiagonal) {
        this.bigDiagonal = bigDiagonal;
    }

    @Override
    public double getSize() {
        return 36.5d;
    }

    @Override
    public String getColor() {
        return "Yellow";
    }

    @Override
    public String getShapeName() {
        return "Rhombus";
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
