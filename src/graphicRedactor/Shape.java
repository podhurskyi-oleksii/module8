package graphicRedactor;

public interface Shape {

    default double getSize() {
        return 12.34d;
    }

    default String getColor() {
        return "White";
    }

    String getShapeName();
}
