package graphicRedactor;

public class Rhombus extends nGon {

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
    public String getShapeName() {
        return "Shape name is Rhombus";
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
