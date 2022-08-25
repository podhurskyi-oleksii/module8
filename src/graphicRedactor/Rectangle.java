package graphicRedactor;

public class Rectangle extends nGon {

    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String getShapeName() {
        return "Shape name is Rectangle";
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
