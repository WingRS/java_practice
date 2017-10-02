import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by StasMaster on 02.10.17.
 */
public class Rectangle extends Shape {
    private double length;
    private double height;

    public Rectangle() {
        this.length = 10;
        this.height = 20;
        this.setColor("blue");
    }

    public Rectangle(int lenghth, int height) {
        this.height = height;
        this.length = lenghth;
    }

    public Rectangle(int length, int height, String color) {
        this.length = length;
        this.height = height;
        this.setColor(color);
    }



    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getArea() {
        return this.height * this.length;
    }

    public double getPerimetr() {
        return (this.length+this.height)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{ \n" +
                "height=" + this.getHeight() + "\n"+
                "length=" + this.getLength() + "\n"+
                "Perim=" + this.getPerimetr() + "\n"+
                "Square=" + this.getArea() + "\n"+
                "Color=" + this.getColor() + "\n"+
                '}';
    }
}
