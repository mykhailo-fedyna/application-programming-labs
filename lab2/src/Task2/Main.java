package Task2;

public class Main {
    public static void main(String[] args) {
        final Shape circle = new Circle(5);
        final Shape square = new Square(4);
        final Shape rectangle = new Rectangle(3, 6);
        final Shape triangle = new Triangle(4, 5);
        final Shape cube = new Cube(3);
        final Shape pyramid = new Pyramid(9, 6);
        final Shape sphere = new Sphere(2);

        Shape[] shapes = {circle, square, rectangle, triangle, cube, pyramid, sphere};

        for (Shape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() +
                    " - Area: " + shape.area() +
                    ", Volume: " + shape.volume());
        }
    }
}

