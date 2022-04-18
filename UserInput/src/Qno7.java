/*
Take name, roll number and field of interest from user and print in the format below :Hey,
my name is xyz and my roll number is xyz. My field of interest are xyz.
 */
import java.util.Scanner;
public class Qno7 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter Your Name:");
        String name = myObj.next();
        System.out.print("Enter Your Roll number:");
        int roll = myObj.nextInt();
        System.out.print("Enter Your Field Of Interest:");
        String c = myObj.next();
        System.out.println("Hey,my name is "+name+" and my roll number is "+roll+". My Field of interest is "+c+".");
    }
}
