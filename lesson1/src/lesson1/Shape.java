package lesson1;

public abstract class Shape {
    public abstract double getPerimeter();
    public abstract double getArea();
    protected double getLength(Point x1, Point x2) {
        return Math.sqrt(Math.pow(x1.getX() - x2.getX(), 2) + Math.pow(x1.getY() - x2.getY(), 2));
    }

    @Override
    public String toString() {
        return "Shape{}";
    }
}
