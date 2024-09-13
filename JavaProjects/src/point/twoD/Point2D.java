package point.twoD;

public class Point2D {
     protected float x;
     protected float y;

    public Point2D(){
        this.x = 0;
        this.y = 0;
    }
    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    // Set x
    public void setX(float x) {
        this.x = x;
    }
    // Set y
    public void setY(float y) {
        this.y = y;
    }

    // Get x
    public float getX(){
        return x;
    }

    // Get y
    public float getY() {
        return y;
    }

    // Set XY

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    // Get XY
    public float[] getXY(){
        return new float[]{this.x, this.y};
    }

    @Override
    public String toString() {
        return String.format("(%f,%f)", x, y);
    }
}
