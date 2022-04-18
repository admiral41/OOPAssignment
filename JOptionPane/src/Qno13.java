/*If the marks of Robert in three subjects are entered through keyboard (each out of 100 ),
        write a program to calculate his total marks and percentage marks.*/

import javax.swing.*;
public class Qno13 {
    public static void main(String[] args) {
        int a,b,c,tot,per;
        a=Integer.parseInt(JOptionPane.showInputDialog(null,"enter marks in math"));
        b=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter marks in science"));
        c=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter marks in social"));
        tot=a+b+c;
        per=(tot*100)/3;
        JOptionPane.showMessageDialog(null,"Total marks :"+tot);
        JOptionPane.showMessageDialog(null,"Total percentage :"+per);
    }
}
