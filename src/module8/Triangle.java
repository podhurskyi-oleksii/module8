package module8;

public class Triangle implements nGon {

    private double[] angles;

    public double[] getAngles() {
        return angles;
    }

    public void setAngles(double[] angles) {
        if (getAngles()[0] + getAngles()[1] + getAngles()[2] == 180)
            this.angles = angles;
        else
            return;
    }

    @Override
    public double getSize() {
        return 13;
    }

    @Override
    public String getColor() {
        return "Black";
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public int getSides() {
        return 3;
    }

    @Override
    public int getCountOfAngles() {
        return 3;
    }

    @Override
    public String toString() {
        return "Shape name - " + getShapeName()
                + ", color - " + getColor()
                + ", size - " + getSize();
    }
}
