package lesson1;

public class Triangle extends Shape {
    private Point x1;
    private Point x2;
    private Point x3;

    @Override
    public String toString() {
        return "Triangle"/* + x1 +
                ";" + x2 +
                ";" + x3*/;
    }

    public Triangle(Point x1, Point x2, Point x3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
    }

    @Override
    public double getPerimeter() {
        return getLength(x1, x2) + getLength(x1, x3) + getLength(x2, x3);
    }

    @Override
    public double getArea() {
        double side1 = getLength(x1, x2);
        double side2 = getLength(x1, x3);
        double side3 = getLength(x2, x3);
        double polP = (side1 + side2 + side3) / 2;
        return Math.sqrt(polP * (polP - side1) * (polP - side2) * (polP - side3));
    }


    }

