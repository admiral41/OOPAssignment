/*
Write a program to enter the values of two variables 'a' and 'b' from keyboard and then
check if both the conditions 'a < 50' and 'a < b' are true.
 */
import java.util.Scanner;
public class Qno12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter value of a");
        double a=scanner.nextDouble();
        System.out.println("Enter value of b");
        double b= scanner.nextDouble();
        System.out.println((a<50)&&(a<b));
    }
}
