package _06_inheritance.excercise.model_excercise2;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z){
      super.setXY(x,y);
      this.z=z;
    }
    public float[] getXYZ(){
        float[] arr2=new float[3];
        arr2[0]=super.getXY()[0];
        arr2[1]=super.getXY()[1];
        arr2[2]=super.getXY()[2];
        return arr2;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                '}'+super.toString();
    }

    public static void main(String[] args) {
        Point3D point3D=new Point3D(3.2f, 2.5f, 4.6f);
        System.out.println(point3D.toString());
    }
}
