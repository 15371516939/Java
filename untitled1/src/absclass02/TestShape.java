package absclass02;

public class TestShape {
    public static void main(String[] args) {
        Shape shape = new Circle(5);
        shape.getArea();
        System.out.println(shape.area);
        //System.out.println(shape.getArea());
        shape = new Rectangle(4,5);
        System.out.println(shape.getArea());
        shape = new Trapezoid(4,5);
        System.out.println(shape.getArea());
    }
}
