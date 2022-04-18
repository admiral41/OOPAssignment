// Q.No2 Write a program to calculate sum of four numbers taking user input.

import java.util.Scanner;

public class Qno2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int num1 = myObj.nextInt();
        System.out.println("Enter 2st number:");
        int num2 = myObj.nextInt();
        System.out.println("Enter 3st number:");
        int num3 = myObj.nextInt();
        System.out.println("Enter 4st number:");
        int num4 = myObj.nextInt();
        int total = (num1+num2+num3+num4)/4 ;
        System.out.println("The sum of 4 numbers is:"+total);

    }
}
