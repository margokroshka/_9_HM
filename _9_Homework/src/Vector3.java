public class Vector3 {

    double x1;
    double y1;
    double z1;
    double x2;
    double y2;
    double z2;
    private static final String Constant = "Это трехмерный вектор ";

    public Vector3(double x1, double y1, double z1,double x2, double y2, double z2) {
        this.x1 = x1;
        this.y1 = y1;
        this.z1 = z1;
        this.x2 = x2;
        this.y2 = y2;
        this.z2 = z2;
    }
    public double Length(){
        return Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2))+((z1-z2)*(z1-z2)));
    }
    public double cos(){
        return  ((x1*x2+y1*y2+z1*z2)/(Math.sqrt((x1*x1)+(y1*y1)+(z1*z1))*Math.sqrt((x2*x2)+(y2*y2)+(z2*z2))));
    }
    public Vector3(double x1, double y1, double z1) {
        this.x1 = x1;
        this.y1 = y1;
        this.z1 = z1;
    }

    public void Vector(Vector3 v) {
        this.setX1(v.getX1());
        this.setY1(v.getY1());
        this.setZ1(v.getZ1());
    }
    // сумма векторов
    public Vector3 addVector(Vector3 v) {
        return new Vector3(getX1() + v.getX1(), getY1() + v.getY1(), getZ1() + v.getZ1());
    }

    // разность векторов
    public Vector3 minusVector(Vector3 v) {
        return new Vector3(getX1() - v.getX1(), getY1() - v.getY1(), getZ1() - v.getZ1());
    }

    @Override
    public String toString() {
        return "Vector3{" +
                Constant+
                "x1=" + x1 +
                ", y1=" + y1 +
                ", z1=" + z1 +
                ", x2=" + x2 +
                ", y2=" + y2 +
                ", z2=" + z2 +
                '}';
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getZ1() {
        return z1;
    }

    public void setZ1(double z1) {
        this.z1 = z1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public double getZ2() {
        return z2;
    }

    public void setZ2(double z2) {
        this.z2 = z2;
    }
}
