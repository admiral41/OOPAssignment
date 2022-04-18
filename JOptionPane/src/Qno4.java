/*Write a program to take two integer inputs from user and print sum and product of them.*/
import javax.swing.*;
public class Qno4 {
    public static void main(String[] args) {
        int a,b,sum,product;
        a=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter 1st num"));
        b=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter 2nd num"));
        sum=a+b;
        product=a*b;
        JOptionPane.showMessageDialog(null,"sum is:"+sum);
        JOptionPane.showMessageDialog(null,"product is:"+product);
    }
}
