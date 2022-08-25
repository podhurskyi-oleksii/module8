package graphicRedactor;

public abstract class nGon extends Shape {

    protected int countOfSides;
    protected int countOfAngles;

    abstract int getCountOfSides();

    abstract int getCountOfAngles();
}
