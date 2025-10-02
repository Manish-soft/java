import java.util.Scanner;

// Shape interface with area calculation method
interface Shape {
    double calculateArea();
}

// Circle class implementing Shape
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14 * radius * radius;
    }
}

// Rectangle class implementing Shape
class Rectangle implements Shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return length * breadth;
    }
}

// Square class implementing Shape
class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}

// Main class
 class ShapeAreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Circle
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        Shape circle = new Circle(radius);
        System.out.println("Circle Area = " + circle.calculateArea());

        // Rectangle
        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double breadth = sc.nextDouble();
        Shape rectangle = new Rectangle(length, breadth);
        System.out.println("Rectangle Area = " + rectangle.calculateArea());

        // Square
        System.out.print("Enter side of square: ");
        double side = sc.nextDouble();
        Shape square = new Square(side);
        System.out.println("Square Area = " + square.calculateArea());

        sc.close();
    }
}
