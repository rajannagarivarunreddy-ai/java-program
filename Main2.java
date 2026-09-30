public class Main2 {
    public static void main(String[] a) {
        Circle C = new Circle();
        C.radius = 5.0;
        System.out.println(C.area());
    }
}
class Circle {
    double radius;
    double area()
    {return Math.PI*radius*radius;}
}