public class MoveablePoint extends Point2D {
    private float xSpeed;
    private float ySpeed;
    public MoveablePoint(){

    }
    public  MoveablePoint(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MoveablePoint(float x, float y, float xSpeed,float ySpeed){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed( float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        float[] array= {getXSpeed(),getYSpeed()};
        return array;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "(x,y)=(" + getX() +
                "," + getY() +")"+" ,speed=("+getXSpeed()+","+getYSpeed()+")"+
                '}';
    }
    public MoveablePoint move(){
        setX(getX()+xSpeed);
        setY(getY()+ySpeed);
        return this;
    }
}
