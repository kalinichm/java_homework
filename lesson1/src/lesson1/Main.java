package lesson1;

public class Main {

    public static void main(String[] args) {
        Point a = new Point(-3,5);
        Point b = new Point(3,-3);
        Point c = new Point(9,5);
        Point d = new Point(0,5);
        Board board = new Board();
        Triangle triangle1 = new Triangle(a,b,c);
        Rectangle rectangle = new Rectangle(a,b,c,d);
        Triangle triangle2 = new Triangle(a,b,d);
        Circle circle = new Circle(d, a);

       /* board.setShape(circle, 1);
        board.setShape(triangle2, 0);
        board.setShape(rectangle, 2);
*/
       /* Shape shape1 = board.getShape(1);
        System.out.println(shape1.getArea());
        Shape shape2 = board.getShape(0);
        System.out.println(shape2.getArea());
        Shape shape3 = board.getShape(2);

        System.out.println(shape1.getArea()+shape2.getArea()+shape3.getArea());*/

        board.infoOfBoard();

    }



}
