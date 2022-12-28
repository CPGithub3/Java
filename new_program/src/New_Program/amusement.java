package New_Program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class amusement {
    public static void main(String[] args) throws IOException {
        int age;

        System.out.println("Amusement Park ticket enquiry according to your age");
        System.out.println("Please enter your age");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        age = Integer.parseInt(br.readLine());

        if (age>=1 && age<=5){
            System.out.println("Free");
        }
        else if (age>=6 && age<=14){
            System.out.println("Half Ticket");
        }
        else if(age>=15 && age<=60){
            System.out.println("Full Ticket");
        }
        else {
            System.out.println("Please enter age between 1 to 60");
        }

    }
}
