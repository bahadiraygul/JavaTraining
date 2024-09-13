package geometric.shapes;

public class MovableCircle implements Movable{
    private MovablePoint movablePoint;
    private float radius;

    public MovableCircle(float radius, int x, int y, int xSpeed, int ySpeed){
        this.movablePoint = new MovablePoint( x,  y, xSpeed ,  ySpeed);
        this.radius = radius;

    }


    @Override
    public void moveUp() {
        movablePoint.moveUp();
    }

    @Override
    public void moveDown() {
        movablePoint.moveDown();
    }

    @Override
    public void moveLeft() {
        movablePoint.moveLeft();
    }

    @Override
    public void moveRight() {
        movablePoint.moveRight();
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", movablePoint=" + movablePoint +
                '}';
    }
}
