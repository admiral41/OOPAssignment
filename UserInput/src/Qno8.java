/*
Q.no 8 Take side of a square from user and print area and perimeter of it. Also, calculate SI, Area
of triangle and Volume of Cube and Cuboid. Take the attributes as user input.
 */
import java.util.Scanner;
public class Qno8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter principle");
        float p = scanner.nextFloat();
        System.out.println("enter rate");
        float r = scanner.nextFloat();
        System.out.println("enter time");
        float t = scanner.nextFloat();
        float SI = (p * t * r) / 100;
        System.out.println("Simple interest is:" + SI);
        System.out.println("Enter base");
        float b = scanner.nextFloat();
        System.out.println("enter height");
        float h = scanner.nextFloat();
        float Area = b * h / 2;
        System.out.println("Area of triangle is:" + Area);
        System.out.println("Enter length");
        float l = scanner.nextFloat();
        float volofcube = l * l * l;
        System.out.println("Volumn of cube is:" + volofcube);
        float volofcuboid = l * b * h;
        System.out.println("Volume of cuboid is:" + volofcuboid);
        float areaofsq = l * l;
        System.out.println("Area of square is:" + areaofsq);
        float perimeter = 4 * l;
        System.out.println("Perimeter of square is:" + perimeter);
    }
}