package New_Program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class condition {
    public static void main(String[] args) throws IOException {
        int a; int b;

        System.out.println("Enter any two value");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        if (a>b){
            System.out.println(a-b);
        }
        else if (a<b){
            System.out.println(a*b);
        }
        else if(a==b){
            System.out.println("both are equal");
        }
        else {
            System.out.println("Fail");
        }

    }
}
