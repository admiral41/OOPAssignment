/*
Q.no 5 Take two integer inputs from user. First calculate the sum of two then product of two.
Finally, print the sum and product of both obtained results.
 */
import java.util.Scanner;
public class Qno5 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter 1st Integer:");
        int num1 = myObj.nextInt();
        System.out.println("Enter 2nd Integer");
        int num2 = myObj.nextInt();
        float sum = num1+num2;
        float product=num1*num2;
        System.out.println("The sum is :"+sum);
        System.out.println("The product is:"+product);
    }
}
