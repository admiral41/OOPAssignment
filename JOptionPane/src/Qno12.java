/*
Write a program to enter the values of two variables 'a' and 'b' from keyboard and then
        check if both the conditions 'a < 50' and 'a < b' are true.
*/

import javax.swing.*;
public class Qno12 {
    public static void main(String[] args) {
        int a,b;
        a=Integer.parseInt(JOptionPane.showInputDialog(null,"enter variable a"));
        b=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter variable b"));
        JOptionPane.showMessageDialog(null,(a<50)&&(a<b));
    }
}

