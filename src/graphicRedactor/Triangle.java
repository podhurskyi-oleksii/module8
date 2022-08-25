package graphicRedactor;

public class Triangle extends nGon {

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
    public String getShapeName() {
        return "Shape name is Triangle";
    }

    @Override
    public int getCountOfSides() {
        return 3;
    }

    @Override
    public int getCountOfAngles() {
        return 3;
    }

}
