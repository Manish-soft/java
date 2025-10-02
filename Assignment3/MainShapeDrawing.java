
abstract class Shape {
    abstract void draw();
}


class Circle extends Shape {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing Circle of radius " + radius);
    }
}


class Rectangle extends Shape {
    int length, breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void draw() {
        System.out.println("Drawing Rectangle of length " + length + " and breadth " + breadth);
    }
}

 class MainShapeDrawing {
    public static void main(String[] args) {
        Shape circle = new Circle(7);
        Shape rectangle = new Rectangle(5, 10);

        circle.draw();
        rectangle.draw();
    }
}
