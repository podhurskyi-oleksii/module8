package module8;

public class ShapeDrawer {

    public static void main(String[] args) {
        Shape square = new Square();
        Shape circle = new Circle();
        Shape rhombus = new Rhombus();

        System.out.println(square.getShapeName());
        System.out.println(square.toString());

        System.out.println(circle.getShapeName());
        System.out.println(circle.toString());

        System.out.println(rhombus.getShapeName());
        System.out.println(rhombus.toString());
    }
}
