class Shape {
    public double area() {
        return 0;
    }
}

class Triangle extends Shape {
    double height;
    double base;

    double area;

    // override the method here

    @Override
    public double area() {
        area = base * height / 2;
        return area;
    }
}

class Circle extends Shape {
    double radius;
    double area;
    // override the method here
    @Override
    public double area() {
        area = Math.PI * (radius * radius);
        return area;
    }
}

class Square extends Shape {
    double side;
    double area;

    // override the method here

    @Override
    public double area() {
        area = side * side;
        return area;
    }
}

class Rectangle extends Shape {
    double width;
    double height;
    double area;

    // override the method here

    @Override
    public double area() {
        area = width * height;
        return area;
    }
}