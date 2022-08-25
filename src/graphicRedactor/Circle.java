package graphicRedactor;

public class Circle extends Shape {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    String getShapeName() {
        return "Shape name is Circle";
    }
}
