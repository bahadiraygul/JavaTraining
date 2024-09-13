package geometric.shapes;

public class Circle extends Shape implements GeometricObject{
    private float radius;
    public static final double PI = 3.14;

    public Circle(String color, boolean isFilled, int radius){
        super(color, isFilled);
        this.radius = radius;
    }

    public float getRadius(){
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public double getArea(){
        return PI * (Math.sqrt(radius));
    }

    public double getPerimeter(){
        return 2 * PI * radius;
    }

    @Override
    public String toString() {
        return "Circle with radius = " + radius +" which is a subclass of " + super.toString();
    }
}
