/* Take two integer inputs from user. First calculate the sum of two then product of two.
        Finally, calculate the division of thus obtained sum and product and print the result.*/
import javax.swing.*;
public class Qno5 {
    public static void main(String[] args) {
        int a,b,sum,product,division;
        a=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter 1st num"));
        b=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter 2nd num"));
        sum=a+b;
        product=a*b;
        division=sum/product;
        JOptionPane.showMessageDialog(null,"sum is:"+sum);
        JOptionPane.showMessageDialog(null,"product is:"+product);
        JOptionPane.showMessageDialog(null,"division  is:"+division);

    }
}
