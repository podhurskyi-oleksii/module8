package module8;

public class Circle implements Shape {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getSize() {
        return 7.775d;
    }

    @Override
    public String getColor() {
        return Shape.super.getColor();
    }

    @Override
    public String toString() {
        return "Shape name - " + getShapeName()
                + ", color - " + getColor()
                + ", size - " + getSize();
    }
}
