

/**
 * Created by StasMaster on 02.10.17.
 */
public class CircleTest {
    public static void main(String[] args) {

       Circle circle = new Circle(20);
        System.out.println(circle.toString());

        Circle circle_red = new Circle(10,"red");
        System.out.println(circle_red.toString());

        Circle default_cirlce = new Circle();
        System.out.println(default_cirlce.toString());

        Rectangle rect_red = new Rectangle(10,20,"red");
        System.out.println(rect_red.toString());

        Rectangle rect_nocolor = new Rectangle(15,22);
        System.out.println(rect_nocolor.toString());

        Rectangle rect_def = new Rectangle();
        System.out.println(rect_def.toString());

        Square square_red = new Square(10,"red");
        System.out.println(square_red.toString());

        Square square_nocolor = new Square(15);
        System.out.println(square_nocolor.toString());

        Square square_def = new Square();
        System.out.println(square_def.toString());
    }
}
