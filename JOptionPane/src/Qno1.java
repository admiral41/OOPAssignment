
/*
Write a program to take student details as input and display the result.
 */
import javax.swing.*;
public class Qno1 {
    public static void main(String[] args) {
        float c ,roll, phy , math, chem , bio , nep, percent ;
        String name=JOptionPane.showInputDialog(null,"enter name");
        c = Float.parseFloat((JOptionPane.showInputDialog("Enter your Class:")));
        roll=Float.parseFloat((JOptionPane.showInputDialog("Enter your roll number:")));
            phy = Float.parseFloat((JOptionPane.showInputDialog("Enter your Physics Mark:")));
            math = Float.parseFloat((JOptionPane.showInputDialog("Enter your Math Mark:")));
            chem = Float.parseFloat((JOptionPane.showInputDialog("Enter your Chemistry Mark:")));
            bio = Float.parseFloat((JOptionPane.showInputDialog("Enter your Biology Mark")));
        percent = (math + phy + chem + bio) / 4;
        JOptionPane.showMessageDialog(null,"percentage is:"+percent);
        String division = (percent >= 70) ? "First class" : percent > 59 && percent < 70 ? "upper second class" : percent > 49 && percent < 59 ? "second class" : percent > 39 && percent < 49 ? "third class" : "fail";
        JOptionPane.showMessageDialog(null,"total percentage:" + percent + " Division" + division);

        }
}
