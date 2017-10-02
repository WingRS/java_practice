/**
 * Created by StasMaster on 02.10.17.
 */
public class Square extends  Rectangle{


    public Square() {
        this.setSide(20);
    }

    public Square(int side) {
        this.setSide(side);
        this.setColor("yellow");
    }

    public Square( int side, String color) {
        this.setColor(color);
        this.setHeight(side);
    }

    public double getSide() {
        return this.getHeight();
    }

    public double setSide(int side) {
        return this.getHeight();
    }

    public double getArea() {
        return this.getHeight() * this.getHeight();
    }

    public double getPerimetr() {
        return (this.getHeight())*4;
    }

    @Override
    public String toString() {
        return "Square{ \n" +
                "side=" + this.getSide() + "\n"+
                "Perim=" + this.getPerimetr() + "\n"+
                "Square=" + this.getArea() + "\n"+
                "Color=" + this.getColor() + "\n"+
                '}';
    }
}

