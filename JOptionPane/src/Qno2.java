/*
Write a program to calculate sum of four numbers taking user input
 */
import javax.swing.*;
public class Qno2 {
    public static void main(String[] args) {
        int a,b,c,d,sum;
        a=Integer.parseInt(JOptionPane.showInputDialog("Enter 1st integer"));
        b=Integer.parseInt((JOptionPane.showInputDialog("Enter 2nd integer")));
        c=Integer.parseInt(JOptionPane.showInputDialog("Enter 3rd integer"));
        d=Integer.parseInt(JOptionPane.showInputDialog("Enter 4th integer"));
        sum = a+b+c+d;
        JOptionPane.showMessageDialog(null,"The sum of 4 integer is:"+sum);

    }
}
