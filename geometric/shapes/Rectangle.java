package geometric.shapes;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle(String color, boolean isFilled, double width, double length){
        super(color, isFilled);
        this.width = width;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle with width = " +
                width +
                " and "
                + "length = " + length
                + " which is subclass off " + super.toString();
    }
}
