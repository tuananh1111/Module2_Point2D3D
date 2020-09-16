public class Main {
    public static void main(String[] args) {
        Point2D point2D=new Point2D();
        System.out.println(point2D.toString());
        point2D= new Point2D(5.0f,5.0f);
        System.out.println(point2D.toString());
        Point3D point3D=new Point3D();
        System.out.println(point3D.toString());
        point3D=new Point3D(5.5f,5.5f,10.0f);
        System.out.println(point3D.toString());

        MoveablePoint moveablePoint=new MoveablePoint();
        System.out.println(moveablePoint.toString());
        moveablePoint= new MoveablePoint(10.0f,10.0f,8f,8f);
        System.out.println(moveablePoint.toString());
        System.out.println(moveablePoint.move());
    }
}
