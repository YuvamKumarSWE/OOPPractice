public class Area {

    public static int area(double radius){
        return (int) (Math.PI * radius * radius);
    }

    public static double area(double length, double width) {
        return (length * width);
    }

    public static double area(double radius, int height) {
        return Math.PI * radius * height;
    }

}
