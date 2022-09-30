public class Main {
    public static void main(String[] args) {
        Vector2 vector2 = new Vector2(12, 10, 2, 3);
        Vector2 vector2_1 = new Vector2(10, 12, 3, 2);
        Vector3 vector3 = new Vector3(10, 5, 8, 2, 4, 3);
        Vector3 vector3_1 = new Vector3(5, 10, 8, 4, 2, 8);

        System.out.println(vector2.Length());
        System.out.println(vector3.Length());
        System.out.println(vector2.cos());
        System.out.println(vector3.cos());
        System.out.println(vector2.Length() * vector2_1.Length() * vector2.cos());
        System.out.println(vector3.Length() * vector3_1.Length() * vector3.cos());
        System.out.println(vector2.addVector(vector2_1));
        System.out.println(vector3.minusVector(vector3_1));
        

    }
}