/*Take side of a square from user and print area and perimeter of it. Also, calculate SI, Area
        of triangle and Volume of Cube and Cuboid. Take the attributes as user input.*/
import javax.swing.*;
public class Qno8 {
    public static void main(String[] args) {
        float l,p,t,r,b,h,areaofsq,SI,perimeter,volofcube,volofcuboid,areaoftri;
        l=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter length"));
        b=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter breadth"));
        h=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter height"));
        t=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter time"));
        r=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter rate"));
        p=Float.parseFloat(JOptionPane.showInputDialog(null,"Enter principal"));
        areaofsq=l*l;
        perimeter=4*l;
        SI=(p*t*r)/100;
        volofcube=l*l*l;
        volofcuboid=l*b*h;
        areaoftri=(b*h)/2;
        JOptionPane.showMessageDialog(null,"Area of square is:"+areaofsq);
        JOptionPane.showMessageDialog(null,"perimeter of square is:"+perimeter);
        JOptionPane.showMessageDialog(null,"simple interest is:"+SI);
        JOptionPane.showMessageDialog(null,"volume of cube is:"+volofcube);
        JOptionPane.showMessageDialog(null,"volume of cuboid is:" + volofcuboid);
        JOptionPane.showMessageDialog(null,"area of traingle is:"+areaoftri);
    }
}
