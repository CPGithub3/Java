package New_Program;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class switchcase {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any alphabet ");
        String c= reader.readLine();
        switch (c){
            case  "a":
                System.out.println("Alphabet is vowel");
                break;
            case  "e":
                System.out.println("Alphabet is vowel");
                break;
            case  "i":
                System.out.println("Alphabet is vowel");
                break;
            case  "o":
                System.out.println("Alphabet is vowel");
                break;
            case  "u":
                System.out.println("Alphabet is vowel");
                break;
            default:
                System.out.println("Alphabet is consonant");
        }
    }
}
