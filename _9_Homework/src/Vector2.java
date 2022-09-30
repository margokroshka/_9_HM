import java.util.Arrays;
import java.util.Random;

public class Vector2 {
    double x1;
    double y1;
    double x2;
    double y2;
    private static final String Constant = "Это двумерный вектор ";

    public Vector2(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Vector2(double x1, double y1) {
        this.x1 = x1;
        this.y1 = y1;
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

    public double Length(){
        return  Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
    }
    public double cos(){
        return  ((x1*x2+y1*y2)/(Math.sqrt((x1*x1)+(y1*y1))*Math.sqrt((x2*x2)+(y2*y2))));

    }
    public Vector2(double x, double y, double z) {
        this.x1 = x;
        this.y1 = y;

    }

    public void Vector(Vector2 v) {
        this.setX1(v.getX1());
        this.setY1(v.getY1());

    }
    // сумма векторов
    public Vector2 addVector(Vector2 v) {
        return new Vector2(getX1() + v.getX1(), getY1() + v.getY1());
    }

    // разность векторов
    public Vector2 minusVector(Vector2 v) {
        return new Vector2(getX1() - v.getX1(), getY1() - v.getY1());
    }

    @Override
    public String toString() {
        return "Vector2{" +
                Constant+
                "x1=" + x1 +
                ", y1=" + y1 +
                ", x2=" + x2 +
                ", y2=" + y2 +
                '}';
    }

    //    public static void Massiv(){
//        int N=3;
//        int leght;
//        String[] massivVector=new String[N];
//        for (int i = 0; i <N; i++) {
//            Random random=new Random();
//            massivVector[i]= random.toString();
//            leght=N;
//        }
//        System.out.println(Arrays.toString(massivVector));
//    }


}
