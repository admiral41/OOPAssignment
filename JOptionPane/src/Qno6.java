/*Ask user to give two double input for length and breadth of a rectangle and print area type
        casted to int*/

import javax.swing.*;
public class Qno6 {
    public static void main(String[] args) {
        double l,b,area;
        l=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter length"));
        b=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter breadth"));
        area=l*b;
        JOptionPane.showMessageDialog(null,"Area of rectangle is:"+area);
    }
}
