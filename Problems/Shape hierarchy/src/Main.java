public class Main { // add this class to test output in IDE
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Triangle triangle = new Triangle(3, 4, 5);
        Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("Circle perimeter: " + circle.getPerimeter() + " area: " + circle.getArea());
        System.out.println("Triangle perimeter: " + triangle.getPerimeter() + " area: " + triangle.getArea());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter() + " area: " + rectangle.getArea());

    }
}


abstract class Shape {
    abstract double getPerimeter();
    abstract double getArea();
}

class Triangle extends Shape{

    double a;
    double b;
    double c;

    double area, perimeter;

    public Triangle(double a, double b, double c ){
        this.a = a;
        this.b = c;
        this.c = c;
    }

    @Override
    double getPerimeter() {
        return a + b + c;
    }

    @Override
    double getArea() {
        double sd = (a + b + c) / 2;
        return Math.sqrt(sd * (sd - a) * (sd - b) * (sd - c));
    }
}

class Rectangle extends Shape{

    double a;
    double b;

    protected Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }

    @Override
    double getPerimeter() {
        return a * 2 + b * 2;
    }

    @Override
    double getArea() {
        return a * b;
    }
}

class Circle extends Shape{
    double radius;

    protected Circle(double radius){
        this.radius = radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}