/*
Q.no 6 Ask user to give two double input for length and breadth of a rectangle and print area type
casted to int.
 */
import java.util.Scanner;
public class Qno6 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter Length:");
        double num1 = myObj.nextDouble();
        System.out.print("Enter Breadth:");
        double num2 = myObj.nextDouble();
        double area = num1*num2;
        System.out.println("The area of rectangle is:"+(int)area);
    }
}
