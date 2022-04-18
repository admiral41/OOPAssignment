/* Write a program to find square of a number.
        E.g.- INPUT : 2 OUTPUT : 4
        INPUT : 5 OUTPUT : 25 */
import javax.swing.*;
public class Qno9 {
    public static void main(String[] args) {
        float num,square;
        num=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter the number in square:"));
        square=num*num;
        JOptionPane.showMessageDialog(null,"The square of num "+square);
    }
}
