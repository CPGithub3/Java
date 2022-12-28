package New_Program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class newone {
    public static void add(int a, int b) {
        System.out.println("Addition of a and b is = " + a+b);
        }
    public static void subs(int a, int b) {
        System.out.println("Subtraction of a and b is = " + (a-b));
        }
    public static void mul(int a, int b) {
        System.out.println("Multiplication of a and b is = " +  a*b);
    }
    public static void div(int a, int b) {
        System.out.println("Div of a and b is = " + a/b);
    }
    public static void main(String[] args) throws IOException {

        System.out.println("Enter any two value");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1= Integer.parseInt(br.readLine());
        int num2= Integer.parseInt(br.readLine());

        newone o=new newone();
        o.add(num1, num2);
        o.subs(num1, num2);
        o.mul(num1, num2);
        o.div(num1, num2);
    }
}
