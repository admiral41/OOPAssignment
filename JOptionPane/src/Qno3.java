/*Write a program to take input of the total marks of four subjects of a student and calculate
        the total percentage secured. Then display the percentage and final result of the student;
        If equal to or more than 70 -> First Class
        If more than 59 -> Upper second Class
        If more than 49 -> Second class
If more than 39 -> Third class and if below than 40 the result is fail.*/
import javax.swing.*;
public class Qno3 {
    public static void main(String[] args) {
        int math,sci,eng,soc,percent;
        math=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter marks in math"));
        sci=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter marks in science"));
        eng=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter marks in english"));
        soc=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter marks in social"));
        percent = (math + sci + eng + soc) / 4;
        JOptionPane.showMessageDialog(null,"percentage is:"+percent);
        String division = (percent >= 70) ? "First class" : percent > 59 && percent < 70 ? "upper second class" : percent > 49 && percent < 59 ? "second class" : percent > 39 && percent < 49 ? "third class" : "fail";
        JOptionPane.showMessageDialog(null,"total percentage:" + percent + "Division" + division);
    }
}
