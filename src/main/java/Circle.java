/**
 * Created by StasMaster on 02.10.17.
 */
public class Circle extends Shape {
    private int radius;
    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(int radius, String color){

        this.radius = radius;
        this.setColor(color);
    }

    public Circle() {
        this.radius  = 10;
        this.setColor("blue");
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getPerimetr() {
        return 2 *3.14 * getRadius();
    }

    public double getArea() {
        return 2*getPerimetr()*getRadius();
    }




    @Override
    public String toString() {
        return "Circle{ \n" +
                "radius=" + radius + "\n"+
                "length=" + this.getPerimetr() + "\n"+
                "Square=" + this.getArea() + "\n"+
                "Color=" + this.getColor() + "\n"+
                '}';
    }
}
