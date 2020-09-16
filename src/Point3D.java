public class Point3D extends Point2D {
    private float z;
    public Point3D(){

    }
    public Point3D(float x, float y, float z){
        super(x,y);
        this.z=z;
    }
    public void setZ(float z){
        this.z=z;
    }
    public float getZ(){
        return this.z;
    }
    public void setXYZ(float x, float y, float z){
        this.setXY(x,y);
        this.z=z;
    }
    public float[] getXYZ(){
        float[] array= {getX(),getY(),getZ()};
        return array;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +"  (x,y,z)=("+getX()+","+getY()+","+getZ()+")"+
                '}';
    }
}
