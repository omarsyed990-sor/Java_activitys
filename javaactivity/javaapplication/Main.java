import java.util.Scanner;

class Shape {

    // Area of Circle
    double area(double radius) {
        return 3.14 * radius * radius;
    }

    // Area of Rectangle
    double area(double length, double breadth) {
        return length * breadth;
    }

    // Area of Triangle
    double area(float base, float height) {
        return 0.5 * base * height;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Shape s = new Shape();

        // Circle
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        System.out.println("Area of Circle = " + s.area(radius));

        // Rectangle
        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth of rectangle: ");
        double breadth = sc.nextDouble();

        System.out.println("Area of Rectangle = " + s.area(length, breadth));

        // Triangle
        System.out.print("Enter base of triangle: ");
        float base = sc.nextFloat();

        System.out.print("Enter height of triangle: ");
        float height = sc.nextFloat();

        System.out.println("Area of Triangle = " + s.area(base, height));

        sc.close();
    }
}