package New_Program;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class check {
    public static void main(String[] args) throws IOException {
        int a;
        int b;

        System.out.println("Enter two number");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        System.out.println(a == b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a != b);
    }
}
