package oop.polymorphisam;

public class Main {
    public static void main(String[] args) {
        Shape shape =  new Shape();
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        shape.area();
        triangle.area();
        shape.area();
    }
}
