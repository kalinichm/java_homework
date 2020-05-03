package lesson1;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle extends Shape{
    private Point x1;
    private Point x2;

    @Override
    public String toString() {
        return "Circle" /*+ x1 +
                ";" + x2*/;
    }

    public Circle(Point x1, Point x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    @Override
    public double getPerimeter() {
        double radius = getLength(x1,x2);
        return 2*radius* PI;
    }

    @Override
    public double getArea() {
         double radius = getLength(x1,x2);
        return 2*pow(radius,2)* PI;
    }
}
