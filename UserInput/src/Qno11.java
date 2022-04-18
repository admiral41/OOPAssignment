/*
Take 3 inputs from user and check :
all are equal
any of two are equal
( use && || with ternary operator )
 */
public class Qno11  {
    public static void main(String[] args) {
        int a=2,b=4,c=4;
        String equal=(a == c) && (a == b)?"all are equal":(a==b)||(b==c)?"any two are equal":"";
        System.out.println(equal);
    }
}
