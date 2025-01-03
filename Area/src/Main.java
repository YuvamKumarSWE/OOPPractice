import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Choose an option to calculate the area:");
        System.out.println("1 : Circle Area");
        System.out.println("2 : Rectangle Area");
        System.out.println("3 : Cylinder Area");

        Scanner keyboard = new Scanner(System.in);
        int answer = keyboard.nextInt();

        switch (answer) {
            case 1: {
                System.out.println("Enter the radius of the circle:");
                double radius = keyboard.nextDouble();
                Area.area(radius); // Calls the void method for circle
                break;
            }
            case 2: {
                System.out.println("Enter the length of the rectangle:");
                double length = keyboard.nextDouble();
                System.out.println("Enter the width of the rectangle:");
                double width = keyboard.nextDouble();
                Area.area(length, width); // Calls the void method for rectangle
                break;
            }
            case 3: {
                System.out.println("Enter the radius of the cylinder:");
                double radius = keyboard.nextDouble();
                System.out.println("Enter the height of the cylinder:");
                double height = keyboard.nextDouble();
                Area.area(radius, height); // Calls the void method for cylinder
                break;
            }
            default: {
                System.out.println("Invalid option. Please enter 1, 2, or 3.");
            }
        }
    }
}