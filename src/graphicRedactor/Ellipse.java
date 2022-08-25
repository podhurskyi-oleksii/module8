package graphicRedactor;

public class Ellipse extends Shape {

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
    public String getShapeName() {
        return "Shape name is Ellipse";
    }

}
