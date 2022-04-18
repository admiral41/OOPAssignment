/*Take two different string input and print them in same line. E.g.-
INPUT : Codes
Dope
OUTPUT : CodesDope
*/
import javax.swing.*;
public class Qno10 {
    public static void main(String[] args) {
        String a= JOptionPane.showInputDialog(null,"Enter code");
        String b=JOptionPane.showInputDialog(null,"Enter Dope ");
        JOptionPane.showMessageDialog(null,a+b);
    }
}
