/*Take 3 inputs from user and check :
        all are equal
        any of two are equal
        ( use && || with ternary operator )*/
import javax.swing.*;
public class Qno11 {
    public static void main(String[] args) {
        int a,b,c;
        a=Integer.parseInt(JOptionPane.showInputDialog(null,"enter variable a"));
        b=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter variable b"));
        c=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter variable c"));
        String equal=(a == c) && (a == b)?"all are equal":(a==b)||(b==c)?"any two are equal":"";
        JOptionPane.showMessageDialog(null,equal);
    }
}
