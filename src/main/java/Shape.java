/**
 * Created by StasMaster on 02.10.17.
 */
public abstract class Shape {
    private String color;
    private boolean filled;
    public Shape() {
        color = "undefined";
        filled = false;
    }

    public Shape(String color, boolean filled) {

        this.filled = filled;
        this.color = color;
    }

    public String getColor() {
        if(color == null) { return  "undefined"; }
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimetr();
    public  abstract  String toString();


}
