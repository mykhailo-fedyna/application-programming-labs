package Task2;

public class Main {
    public static void main(String[] args) {
        final Triangle triangle = new Triangle(3, 4, 5, 2);
        final Square square = new Square(4);
        final Rectangle rectangle = new Rectangle(3, 5);
        final Circle circle = new Circle(3);

        final Cube cube = new Cube(2);
        final Sphere sphere = new Sphere(3);
        final Pyramid pyramid = new Pyramid(4, 6);

        System.out.println("=== 2D ФІГУРИ ===");
        System.out.println("Трикутник — площа: " + triangle.getArea());
        System.out.println("Квадрат — площа: " + square.getArea());
        System.out.println("Прямокутник — площа: " + rectangle.getArea());
        System.out.println("Коло — площа: " + circle.getArea());

        System.out.println("\n=== 3D ФІГУРИ ===");
        System.out.println("Куб — площа: " + cube.getArea() + ", об’єм: " + cube.getVolume());
        System.out.println("Сфера — площа: " + sphere.getArea() + ", об’єм: " + sphere.getVolume());
        System.out.println("Піраміда — площа: " + pyramid.getArea() + ", об’єм: " + pyramid.getVolume());
    }
}
