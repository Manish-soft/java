class ShapeArea {

    // Area of Square
    void calculateArea(int side) {
        int area = side * side;
        System.out.println("Square Area = " + area);
    }

    // Area of Rectangle
    void calculateArea(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Rectangle Area = " + area);
    }

    // Area of Circle
    void calculateArea(double radius) {
        double area = 3.14 * radius * radius;
        System.out.println("Circle Area = " + String.format("%.2f", area));
    }
}

// Main class
 class ShapeAreaCalculation {
    public static void main(String[] args) {
        ShapeArea shape = new ShapeArea();

        // Sample inputs
        shape.calculateArea(5);             // Square
        shape.calculateArea(4, 6);          // Rectangle
        shape.calculateArea(3.0);           // Circle
    }
}
