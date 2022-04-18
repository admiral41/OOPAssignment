/*
 If the marks of Robert in three subjects are entered through keyboard (each out of 100 ),
write a program to calculate his total marks and percentage marks.
 */
import java.util.Scanner;
public class Qno13 {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter marks in english");
    double Eng= scanner.nextDouble();
    System.out.println("Enter marks in social");
    double Soc= scanner.nextDouble();
    System.out.println("Enter marks in math");
    double Math= scanner.nextDouble();
    double total=Eng+Soc+Math;
    double Percent=(total*100)/3;
    System.out.println("Total marks of Robert:"+total+"\nTotal percentage of Robert :"+Percent);
}
}
