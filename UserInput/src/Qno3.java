/*
Q.no 3 Write a program to take input of the total marks of four subjects of a student and calculate
the total percentage secured. Then display the percentage and final result of the student;
a. If equal to or more than 70 -> First Class
b. If more than 59 -> Upper second Class
c. If more than 49 -> Second class
d. If more than 39 -> Third class and if below than 40 the result is fail.

 */
import java.util.Scanner;
public class Qno3 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Scanner myMark = new Scanner(System.in);
        System.out.print("Enter your Physics Mark:");
        float phy = myMark.nextFloat();
        System.out.print("Enter your Math Mark:");
        float math = myMark.nextFloat();
        System.out.print("Enter your Chemistry Mark:");
        float chem = myMark.nextFloat();
        System.out.print("Enter your Biology Mark");
        float bio = myMark.nextFloat();
        System.out.print("Enter your Nepali Mark");
        float nep = myMark.nextFloat();
        float totalmark = (phy+math+chem+bio+nep);
        double percent= totalmark/500.0 * 100.0;
        String g= "";
        g = (percent>70 && percent<100) ? "First class"
                :(percent>=59 && percent<70) ? "Upper Second class"
                :(percent>=49 && percent <59) ? "Second class"
                :(percent>=0 && percent < 39) ? "Third class":"Fail";
        System.out.println("Total Mark ="+totalmark);
        System.out.println("Percentage ="+percent);
        System.out.println("Grade="+g);
    }
}
