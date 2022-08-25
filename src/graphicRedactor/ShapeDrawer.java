package graphicRedactor;

public class ShapeDrawer {
    public void shapeDrawer(Shape shape) {
        System.out.println(shape.getShapeName());
    }
}


class ShapeDrawerTest {
    public static void main(String[] args) {
        ShapeDrawer shape = new ShapeDrawer();
        shape.shapeDrawer(new Square());
        shape.shapeDrawer(new Triangle());
        shape.shapeDrawer(new Circle());
    }
}