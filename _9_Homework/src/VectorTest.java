public class VectorTest {
    double x;
    double y;
    double z;

    public VectorTest(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void Vector(VectorTest v) {
        this.setX(v.getX());
        this.setY(v.getY());
        this.setZ(v.getZ());
    }
    // сумма векторов
    public VectorTest addVector(VectorTest v) {
        return new VectorTest(getX() + v.getX(), getY() + v.getY(), getZ() + v.getZ());
    }

    // разность векторов
    public VectorTest minusVector(VectorTest v) {
        return new VectorTest(getX() - v.getX(), getY() - v.getY(), getZ() - v.getZ());
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
}
