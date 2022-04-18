/*Take name, roll number and field of interest from user and print in the format below :Hey,
        my name is xyz and my roll number is xyz. My field of interest are xyz.*/
import javax.swing.*;
public class Qno7 {
    public static void main(String[] args) {
        String name= JOptionPane.showInputDialog(null,"enter name");
        String roll=JOptionPane.showInputDialog(null,"enter roll no");
        String interest=JOptionPane.showInputDialog(null,"enter interest");
        JOptionPane.showMessageDialog(null,"My name is "+name+"and my roll no is"+roll+"My field of interest is"+interest);System.exit(0);

    }
}
