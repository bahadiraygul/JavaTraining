package geometric.shapes;

public abstract class Shape {
     protected String color;
     protected boolean isFilled;

    public abstract double getArea();
    public abstract double getPerimeter();

    public Shape(){
        this.color="unknown";
        this.isFilled = false;
    }

    public Shape(String color, boolean isFilled){
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public boolean getIsFilled(){
        return isFilled;
    }

    public void setColor(String color) {
        this.color = color;
    }

   public void setIsFilled(boolean filled){
        this.isFilled = filled;
   }



    @Override
    public String toString() {
        return String.format("Shape with color of %s and %s",
                color, isFilled ? "filled" : "NotFilled");
    }
}
