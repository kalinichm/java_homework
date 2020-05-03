package lesson1;

public class Board {
    Shape[] shapes = new Shape[4];

    public Shape getShape(int place) {
        return shapes[place];
    }

    public void setShape(Shape shape, int place) {
        if (shapes[place] == null) {
            shapes[place] = shape;
            System.out.println(shape + "  was set ");
        } else {
            System.out.println("This place is occupied ");
        }
    }


    public void deleteShape(int place) {
        shapes[place] = null;
        System.out.println(" A shape was deleted ");
    }


    public void infoOfBoard() {
        double totalArea = 0;
        for (int i = 0; i < shapes.length; i++) {

            if (shapes[i] != null) {

                if (i == 3) {
                    System.out.print(shapes[i].toString() + ".");
                    totalArea += shapes[i].getArea();
                    System.out.println(" Total area =" + totalArea);
                } else {
                    System.out.print(shapes[i].toString() + ", ");
                    totalArea += shapes[i].getArea();
                }
            } else {

                if (i == 3) {
                    System.out.print("this place is empty.");
                    System.out.println(" Total area =" + totalArea);
                } else {
                    System.out.print("this place is empty, ");
                }
            }
        }

    }

}





