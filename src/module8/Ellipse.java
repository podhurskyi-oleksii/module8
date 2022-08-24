package module8;

public class Ellipse implements Shape {

    private double smallRadius;
    private double bigRadius;

    public double getSmallRadius() {
        return smallRadius;
    }

    public void setSmallRadius(double smallRadius) {
        this.smallRadius = smallRadius;
    }

    public double getBigRadius() {
        return bigRadius;
    }

    public void setBigRadius(double bigRadius) {
        this.bigRadius = bigRadius;
    }

    @Override
    public double getSize() {
        return Shape.super.getSize();
    }

    @Override
    public String getColor() {
        return "Green";
    }

    @Override
    public String getShapeName() {
        return "Ellipse";
    }

    @Override
    public String toString() {
        return "Shape name - " + getShapeName()
                + ", color - " + getColor()
                + ", size - " + getSize();
    }

}
