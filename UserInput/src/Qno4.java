// Q.no 4 Write a program to take two integer inputs from user and print sum and product of them.
import java.util.Scanner;
public class Qno4 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter 1st Integer: ");
        int num1 = myObj.nextInt();
        System.out.print("Enter 2nd Integer: ");
        int num2 = myObj.nextInt();
        int sum = num1+num2;
        int product = num1*num2;
        System.out.println("The sum of 2 integers: "+sum);
        System.out.println("The product of 2 integer: "+product);
    }
}
