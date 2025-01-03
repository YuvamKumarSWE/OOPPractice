public class Area {
    static void area(double radius){
        System.out.println(Math.PI * radius * radius);
    }

    static void area(double length, double width){
        System.out.println(length * width);
    }

    static void area(double radius, int height){
        System.out.println(Math.PI * radius * height);
    }
}
