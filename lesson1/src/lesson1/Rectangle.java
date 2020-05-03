package lesson1;

public class Rectangle extends Shape {
    private Point x1;
    private Point x2;
    private Point x3;
    private Point x4;

    @Override
    public String toString() {
        return "Rectangle"
                /*+ x1 +
                ";" + x2 +
                ";" + x3 +
                ";" + x4*/;
    }

    public Rectangle(Point x1, Point x2, Point x3, Point x4) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.x4 = x4;
    }

    @Override
    public double getPerimeter() {
        return getLength(x1, x2) + getLength(x2, x3) + getLength(x3, x4) + getLength(x1, x4);
    }

    @Override
    public double getArea() {
        return getLength(x1, x2) * getLength(x2, x3);
    }
}
