package graphicRedactor;

public class Rectangle implements nGon {

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
    public double getSize() {
        return 28.0d;
    }

    @Override
    public String getColor() {
        return "Green";
    }

    @Override
    public String getShapeName() {
        return "Rectangle";
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
